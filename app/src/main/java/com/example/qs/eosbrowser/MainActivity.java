package com.example.qs.eosbrowser;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.qs.eosbrowser.fragment.ListFragment;
import com.example.qs.eosbrowser.http.Exe;
import com.example.qs.eosbrowser.http.bean.ResAction;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    ListFragment listFragment;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData("game");
    }

    private void initView() {
        listFragment = ListFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.listfragment, listFragment).commit();
    }

    private void loadData(final String account) {
        handler.postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void run() {
//                Exe.getAction("https://proxy.eosnode.tools", "gameinvestor", new Callback<ResAction>() {
                Exe.getAction("http://192.168.0.117:8888", account, new Callback<ResAction>() {
                    @Override
                    public void onResponse(Call<ResAction> call, Response<ResAction> response) {
                        listFragment.setData(response.body(), account);

                    }

                    @Override
                    public void onFailure(Call<ResAction> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.getMessage(), 0).show();
                    }
                });
                if (!isDestroyed()) {
                    loadData(account);
                }
            }
        }, 3000);


    }

}

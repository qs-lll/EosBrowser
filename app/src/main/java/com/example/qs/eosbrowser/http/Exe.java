package com.example.qs.eosbrowser.http;

import com.example.qs.eosbrowser.http.bean.ReqAction;
import com.example.qs.eosbrowser.http.bean.ResAction;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Exe {
    public static void getAction(String url, String user, final Callback<ResAction> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Call<ResAction> actions = retrofit.create(Service.class).getActions(new ReqAction(user));
        actions.enqueue(new Callback<ResAction>() {
            @Override
            public void onResponse(Call<ResAction> call, Response<ResAction> response) {
                if (response.isSuccessful()) {
                    callback.onResponse(call, response);
                }
            }

            @Override
            public void onFailure(Call<ResAction> call, Throwable t) {
                callback.onFailure(call, t);
            }
        });
    }
}

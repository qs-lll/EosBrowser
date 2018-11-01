package com.example.qs.eosbrowser.adapter;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.qs.eosbrowser.R;
import com.example.qs.eosbrowser.http.bean.ResAction;
import com.google.gson.Gson;

import java.util.List;

public class ListActionAdapter extends BaseQuickAdapter<ResAction.ActionsBean, BaseViewHolder> {
    String userName;

    public ListActionAdapter(@Nullable List<ResAction.ActionsBean> data) {
        super(R.layout.item_action, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ResAction.ActionsBean item) {
        if (item.getAction_trace().getAct().getAccount().equals("eosio.token") && item.getAction_trace().getAct().getName().equals("transfer")) {
            helper.setText(R.id.content, item.getAction_trace().getAct().getData().getFrom() + "->" + item.getAction_trace().getAct().getData().getTo());
            helper.setText(R.id.memo, item.getAction_trace().getAct().getData().getMemo());
            if (item.getAction_trace().getAct().getData().getFrom().equals(userName)) {
                helper.setText(R.id.type, "sent");
                helper.getView(R.id.type).setBackgroundColor(helper.getConvertView().getContext().getResources().getColor(R.color.color_sent));
            } else {
                helper.setText(R.id.type, "received");
                helper.getView(R.id.type).setBackgroundColor(helper.getConvertView().getContext().getResources().getColor(R.color.color_received));
            }
        } else {
            helper.setText(R.id.type, item.getAction_trace().getAct().getAccount() + "-" + item.getAction_trace().getAct().getName());
            helper.getView(R.id.type).setBackgroundColor(helper.getConvertView().getContext().getResources().getColor(R.color.color_other));
            helper.setText(R.id.memo, new Gson().toJson(item.getAction_trace().getAct().getData()) );
            helper.setText(R.id.content, "" );

        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

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
            helper.getView(R.id.content).setVisibility(View.VISIBLE);
            ResAction.ActionsBean.ActionTraceBean.ActBean.DataBean dataBean = new Gson().fromJson(item.getAction_trace().getAct().getData(), ResAction.ActionsBean.ActionTraceBean.ActBean.DataBean.class);
            helper.setText(R.id.content, dataBean.getFrom() + "->" + dataBean.getTo() + ":" + dataBean.getQuantity());
            helper.setText(R.id.memo, dataBean.getMemo());
            if (dataBean.getFrom().equals(userName)) {
                helper.setText(R.id.type, "sent");
                helper.getView(R.id.type).setBackgroundColor(helper.getConvertView().getContext().getResources().getColor(R.color.color_sent));
            } else {
                helper.setText(R.id.type, "received");
                helper.getView(R.id.type).setBackgroundColor(helper.getConvertView().getContext().getResources().getColor(R.color.color_received));
            }
        } else {
            helper.setText(R.id.type, item.getAction_trace().getAct().getAccount() + "-" + item.getAction_trace().getAct().getName());
            helper.getView(R.id.type).setBackgroundColor(helper.getConvertView().getContext().getResources().getColor(R.color.color_other));
            helper.setText(R.id.memo, new Gson().toJson(item.getAction_trace().getAct().getData()));
            helper.getView(R.id.content).setVisibility(View.GONE);

        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

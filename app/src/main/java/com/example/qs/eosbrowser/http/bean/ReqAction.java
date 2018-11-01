package com.example.qs.eosbrowser.http.bean;

public class ReqAction {
    /**
     * pos : -1
     * offset : -20
     * account_name : q
     */

    private int pos = -1;
    private int offset = -20;
    private String account_name ;

    public ReqAction(String account_name) {
        this.account_name = account_name;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }
}

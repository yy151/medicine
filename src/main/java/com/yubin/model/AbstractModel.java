package com.yubin.model;

/**
 * Created by percent on 16/3/30.
 */
public abstract class AbstractModel {

    private Boolean status;
    private String msg;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

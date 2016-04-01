package com.yubin.model;

import java.util.List;

/**
 * Created by percent on 16/3/30.
 */
public class Result<T> {

    private Boolean status;
    private long total;
    private List<T> tngou;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getTngou() {
        return tngou;
    }

    public void setTngou(List<T> tngou) {
        this.tngou = tngou;
    }
}

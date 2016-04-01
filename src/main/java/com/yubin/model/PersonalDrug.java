/**
 * TODO: complete the comment
 */
package com.yubin.model;

import java.util.Date;

/**
 * TODO: complete the comment
 */
public class PersonalDrug {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 服药开始时间
     */
    private Date start;

    /**
     * 服药结束时间
     */
    private Date end;

    /**
     * 服用频率 一日三次，一日两次
     */
    private String rate;

    /**
     * 药品id
     */
    private Long drugId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }
    public String getRate() {
        return rate;
    }
    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }
    public Long getDrugId() {
        return drugId;
    }
    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }
}
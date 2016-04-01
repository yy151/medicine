/**
 * TODO: complete the comment
 */
package com.yubin.model;

import com.yubin.contants.SmsStatusConstants;

import java.util.Date;

/**
 * TODO: complete the comment
 */
public class Auth {

    /**
     * 主键
     */
    private Long id;

    /**
     * 验证码
     */
    private String code;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 短信发送状态 0:发送中 1:成功  2:失败
     */
    private String status;

    public Auth(){}
    public Auth(String code, String phone, Date createTime) {
        this.code = code;
        this.phone = phone;
        this.createTime = createTime;
        this.status = SmsStatusConstants.SEND_ING;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
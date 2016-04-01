package com.yubin.controller;


import com.yubin.contants.ResultConstants;

/**
 * 用于 Ajax 请求返回
 */
public class ResponseVO<T> {

	private boolean succeed = true;
	private String code = ResultConstants.CODE_SUCCESS;
	private String msg = "";
	private T data;

	public ResponseVO() {

	}

	public ResponseVO(String rstcode) {
		this(rstcode, "", null);
	}

	public ResponseVO(String rstcode, String msg) {
		this(rstcode, msg, null);
	}

	public ResponseVO(String rstcode, T data) {
		this(rstcode, "", data);
	}

	public ResponseVO(String rstcode, String msg, T data) {
		this.succeed = ResultConstants.CODE_SUCCESS.equals(rstcode);
		this.code = rstcode;
		this.msg = msg;
		this.data = data;
	}

	public ResponseVO(boolean succeed) {
		this(succeed, "", null);
	}

	public ResponseVO(boolean succeed, String msg) {
		this(succeed, msg, null);
	}

	public ResponseVO(boolean succeed, T data) {
		this(succeed, "", data);
	}

	public ResponseVO(boolean succeed, String msg, T data) {
		this(succeed ? ResultConstants.CODE_SUCCESS : ResultConstants.CODE_ERR_UNKNOW, msg, data);
	}

	public boolean isSucceed() {
		return succeed;
	}

	public void setSucceed(boolean succeed) {
		this.succeed = succeed;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

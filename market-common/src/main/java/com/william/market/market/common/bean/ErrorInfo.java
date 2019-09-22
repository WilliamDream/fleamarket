package com.william.market.market.common.bean;


import com.william.market.common.error.errorCode.basics.IErrorCodeEnum;

public class ErrorInfo {
	private String errorCode;
	private String errorMsg;
	
	public ErrorInfo(){}
	public ErrorInfo(IErrorCodeEnum errorCodeEnum) {
		errorCode=errorCodeEnum.getErrorCode();
		errorMsg=errorCodeEnum.getErrorMsg();
	}
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "ErrorInfo [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}

}

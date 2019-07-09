package com.william.common.error.errorCode;


import com.william.common.error.errorCode.basics.IErrorCodeEnum;

public enum GlobalErrorCode implements IErrorCodeEnum {
	
	
	SYS_EXCEPTION("1", "系统异常"),
	PARAM_VALIDATE_EXCEPTION("PARAM_VALIDATE_EXCEPTION", "参数验证失败"),
	UPDATE_FAIL("","更新失败"),
	UPLOAD_MAX_ERR("", "上传文件超过大小限制"),
	ENCODE_ERROR("","加密出错"),
	DECODE_ERROR("","解密出错");
	private String errorCode;
	private String errorMsg;
	GlobalErrorCode(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}

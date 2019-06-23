package com.william.common.error.exception;

import com.william.common.error.errorCode.GlobalErrorCode;
import com.william.common.error.errorCode.basics.IErrorCodeEnum;

public class ValidateException extends BizException {

	/** */
	
	private static final long serialVersionUID = 1L;

	public ValidateException() {
		super();
	}

	public ValidateException(IErrorCodeEnum errorCodeEnum) {
		super(errorCodeEnum);
	}

	public ValidateException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public ValidateException(String errorCode, String errorMsg, Throwable cause) {
		super(errorCode, errorMsg, cause);
	}
	
	public ValidateException(String errorMsg) {
		super(GlobalErrorCode.PARAM_VALIDATE_EXCEPTION.getErrorCode(),errorMsg);
	}
}

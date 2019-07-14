package com.william.market.common.error.exception;


import com.william.common.error.errorCode.basics.IErrorCodeEnum;

public class BizException extends RuntimeException implements IErrorCodeEnum {

private static final long serialVersionUID = 1L;
	
	/**
	 * 错误码
	 */
	protected String errorCode;
	/**
	 * 错误信息
	 */
	protected String errorMsg;

	protected BizException() {
		super();
	}

	public BizException(IErrorCodeEnum errorCodeEnum) {
		super(errorCodeEnum.getErrorCode());
		this.errorCode = errorCodeEnum.getErrorCode();
		this.errorMsg = errorCodeEnum.getErrorMsg();
	}



	public BizException(String errorCode, String errorMsg) {
		super(errorCode);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public BizException(String errorCode, String errorMsg, Throwable cause) {
		super(errorCode, cause);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
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

	public String getMessage() {
		return errorMsg;
	}

	/**
	 * 重写fillInStackTrace 优点：会有更好的性能 缺点：没有异常链
	 */
	@Override
	public Throwable fillInStackTrace() {
		return this;
	}

}

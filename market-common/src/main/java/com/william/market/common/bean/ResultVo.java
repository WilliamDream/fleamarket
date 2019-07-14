package com.william.market.common.bean;


import com.william.common.error.errorCode.basics.IErrorCodeEnum;

public class ResultVo {
	/*
	 * 成功：0 ，失败：-1 , 没权限：-2
	 */
	private Integer code;

	/*
	 * 返回的数据
	 */
	public Object data;
	/*
	 * 返回的错误信息
	 */
	private ErrorInfo errorInfo;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public static ResultVo success(Object object) {
		ResultVo result = new ResultVo();
		result.setCode(0); // 默认返回成功
		result.setData(object);
		return result;
	}

	public static ResultVo success() {
		return success(null);
	}

	public static ResultVo error(IErrorCodeEnum errorCodeEnum) {
		ResultVo result = new ResultVo();
		result.setCode(1);
		ErrorInfo errorInfo = new ErrorInfo(errorCodeEnum);
		result.setErrorInfo(errorInfo);
		return result;
	}

	public static ResultVo authError(IErrorCodeEnum errorCodeEnum) {
		ResultVo result = new ResultVo();
		result.setCode(2);
		ErrorInfo errorInfo = new ErrorInfo(errorCodeEnum);
		result.setErrorInfo(errorInfo);
		return result;
	}

	public static ResultVo error(String errorCode, String errorMsg) {
		ResultVo result = new ResultVo();
		ErrorInfo errorInfo = new ErrorInfo();
		result.setCode(1);
		errorInfo.setErrorCode(errorCode);
		errorInfo.setErrorMsg(errorMsg);
		result.setErrorInfo(errorInfo);
		return result;
	}

	
}

package com.william.market.common.error.exception;


import com.william.common.error.errorCode.AuthErrorCode;

public class AuthException extends BizException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuthException(AuthErrorCode authErrorCode) {
		super(authErrorCode);
	}
	
}

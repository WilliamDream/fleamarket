package com.william.common.error;

import com.william.common.bean.ResultVo;
import com.william.common.error.errorCode.GlobalErrorCode;
import com.william.common.error.exception.AuthException;
import com.william.common.error.exception.BizException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/7/9 22:35
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    private static Log log = LogFactory.getLog(GlobalExceptionHandler.class);

    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultVo bizExceptionHandler(HttpServletRequest req, Exception e){
        BizException ex=(BizException)e;
        ResultVo result=ResultVo.error(ex);
        return result;
    }

    @ExceptionHandler(value = AuthException.class)
    @ResponseBody
    public  ResultVo authExceptionHandler(HttpServletRequest req, Exception e){
        AuthException ex=(AuthException)e;
        ResultVo result=ResultVo.authError(ex);
        return result;
    }

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public  ResultVo exceptionHandler(HttpServletRequest req, Exception e){
        log.error(e.getMessage(),e);
        ResultVo result=ResultVo.error(GlobalErrorCode.SYS_EXCEPTION);
        return result;
    }


}

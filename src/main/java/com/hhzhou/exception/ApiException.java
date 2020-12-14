package com.hhzhou.exception;

import com.hhzhou.common.IErrorCode;

/**
 * @description:自定义异常类
 * @author: hhzhou
 * @create:2020/12/13
 */
public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}

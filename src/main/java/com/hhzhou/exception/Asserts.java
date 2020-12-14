package com.hhzhou.exception;

import com.hhzhou.common.IErrorCode;

/**
 * @description: 断言处理类，用于抛出各种API处理异常
 * @author: hhzhou
 * @create:2020/12/13
 */
public class Asserts {
    public static void fail(String message){
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode){
        throw new ApiException(errorCode);
    }
}

package com.hhzhou.exception;

import com.hhzhou.common.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:全局异常处理类
 * @author: hhzhou
 * @create:2020/12/13
 */
@ControllerAdvice
public class GlobalExccetionHandler {

    @ResponseBody
    @ExceptionHandler(ApiException.class)
    public CommonResult handler(ApiException e){
        if (e.getErrorCode() != null){
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());
    }
}

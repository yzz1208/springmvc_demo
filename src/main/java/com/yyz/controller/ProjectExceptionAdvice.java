package com.yyz.controller;

import com.yyz.exception.BusinessException;
import com.yyz.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.yyz.controller.Code.SYSTEM_UNKNOW_ERR;

//异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){

        //记录日志
        //发送消息给运维
        //发送邮件给开发者,ex对象发送给开发人员

        return new Result(SYSTEM_UNKNOW_ERR,null,"系统异常");
    }

    //系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发者,ex对象发送给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //系统异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }
}

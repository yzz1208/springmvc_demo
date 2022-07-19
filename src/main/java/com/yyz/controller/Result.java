package com.yyz.controller;

public class Result{
    private Object date;
    private Integer code;
    private String msg;

    public Result(Integer code, Object date, String msg) {
        this.date = date;
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, Object date) {
        this.date = date;
        this.code = code;
    }

    public Result() {
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

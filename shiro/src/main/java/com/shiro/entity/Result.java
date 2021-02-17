package com.shiro.entity;

public class Result {
    private String code;
    private String message;
    private Object data;

    private static String SUCCESS_CODE = "0";
    private static String FAIL_CODE = "1";

    public Result() {
    }

    public static Result success() {
        Result result = new Result();
        result.code = SUCCESS_CODE;
        result.message = "ok";
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.code = FAIL_CODE;
        result.message = "fail";
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result();
        result.code = FAIL_CODE;
        result.message = message;
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

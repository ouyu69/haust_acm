package com.haust_acm.exception;

import com.haust_acm.enums.ResponseCodeEnum;

public class BusinessException extends Exception {
    private ResponseCodeEnum codeEnum;
    private Integer code;
    private String message;

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(Throwable e) {
        super(e);
    }

    public BusinessException(ResponseCodeEnum codeEnum) {
        super(codeEnum.getMsg());
        this.codeEnum = codeEnum;
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMsg();
    }

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
        this.message = message;
    }


    public BusinessException(Throwable cause, ResponseCodeEnum responseCodeEnum, Integer code, String message) {
        super(cause);
        this.codeEnum = codeEnum;
        this.code = code;
        this.message = message;
    }


    public ResponseCodeEnum getCodeEnum() {
        return codeEnum;
    }

    public void setCodeEnum(ResponseCodeEnum codeEnum) {
        this.codeEnum = codeEnum;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

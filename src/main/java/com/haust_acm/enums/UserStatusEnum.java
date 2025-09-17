package com.haust_acm.enums;

/**
 * @FileName UserStatusEnum
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/
public enum UserStatusEnum {
    NORMAL(0, "正常"),
    DISABLED(1, "禁用"),
    DELETED(2, "删除");

    private Integer code;
    private String msg;

    UserStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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

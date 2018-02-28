package com.imooc.enums;

import lombok.Getter;

/**
 * Created by zmq on 2018/1/10.
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    DOWN(1,"已支付")
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

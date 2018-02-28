package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by zmq on 2018/1/11.
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}

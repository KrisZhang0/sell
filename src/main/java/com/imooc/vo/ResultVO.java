package com.imooc.vo;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 * Created by zmq on 2018/1/4.
 */
@Data
public class ResultVO<T> {

    /**错误码.*/
    private Integer code;

    /**提示信息.*/
    private String message;

    private T data;
}

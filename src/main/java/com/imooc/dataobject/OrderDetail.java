package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 订单详情表
 * Created by zmq on 2018/1/10.
 */
@Entity
@Data
public class OrderDetail {

    /**详情id */
    @Id
    private String detailId;

    /**订单id */
    private String orderId;

    /**商品id */
    private String productId;

    /**商品名称 */
    private String productName;

    /**商品单价 */
    private BigDecimal productPrice;

    /**商品数量 */
    private Integer productQuantity;

    /**商品小图 */
    private String productIcon;
}

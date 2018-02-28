package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * Created by zmq on 2018/1/2.
 */
@Entity
@Data
public class ProductInfo {

    /**商品id. */
    @Id
    private String productId;

    /**名字. */
    private String productName;

    /**价格. */
    private BigDecimal productPrice;

    /**库存 */
    private Integer productStock;

    /**描述 */
    private String productDescription;

    /**小图 */
    private String productIcon;

    /**商品状态,0正常1下架 */
    private Integer productStatus;

    /**类目编号 */
    private Integer categoryType;

}

package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * return_item
 * @author 
 */
@Data
public class ReturnItem implements Serializable {
    private Long returnItemId;

    private Long returnItemCount;

    private String goodsName;

    private Double returnItemPrice;

    private Long returnOrderId;

    private static final long serialVersionUID = 1L;
}
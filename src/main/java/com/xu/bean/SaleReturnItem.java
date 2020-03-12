package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * sale_return_item
 * @author 
 */
@Data
public class SaleReturnItem implements Serializable {
    private Long saleReturnItemId;

    private Long saleReturnItemCount;

    private String goodsName;

    private Double saleReturnItemPrice;

    private Long saleReturnOrderId;

    private static final long serialVersionUID = 1L;
}
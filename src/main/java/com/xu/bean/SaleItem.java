package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * sale_item
 * @author 
 */
@Data
public class SaleItem implements Serializable {
    private Long saleItemId;

    private Long saleItemCount;

    private Long customerId;

    private String saleItemName;

    private Double saleItemPrice;

    private Long saleOrderId;

    private static final long serialVersionUID = 1L;
}
package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * purchase_item
 * @author 
 */
@Data
public class PurchaseItem implements Serializable {
    private Long purchaseItemId;

    private Long purchaseCount;

    private String name;

    private Double purchasePrice;

    private Long purchaseOrderId;

    private Long supplierId;

    private static final long serialVersionUID = 1L;
}
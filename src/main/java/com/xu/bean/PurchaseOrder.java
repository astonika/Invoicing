package com.xu.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * purchase_order
 * @author 
 */
@Data
public class PurchaseOrder implements Serializable {
    private Long purchaseOrderId;

    private String flag;

    private Date inDate;

    private String purchaseOrderPay;

    private Long suppliersId;

    private Double purchaseOrderTotal;

    private static final long serialVersionUID = 1L;
}
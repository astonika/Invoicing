package com.xu.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sale_order
 * @author 
 */
@Data
public class SaleOrder implements Serializable {
    private Long saleOrderId;

    private Long customerId;

    private String flag;

    private String saleOrderPay;

    private Date saleOrderSaleDate;

    private Double saleOrderTotal;

    private static final long serialVersionUID = 1L;
}
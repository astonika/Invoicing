package com.xu.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sale_return_order
 * @author 
 */
@Data
public class SaleReturnOrder implements Serializable {
    private Long saleReturnOrderId;

    private Long customerId;

    private String saleReturnOrderPay;

    private Date saleReturnOrderReturnDate;

    private Double saleReturnOrderTotal;

    private static final long serialVersionUID = 1L;
}
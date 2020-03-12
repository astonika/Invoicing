package com.xu.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * return_order
 * @author 
 */
@Data
public class ReturnOrder implements Serializable {
    private Long returnOrderId;

    private Date returnOrderOutDate;

    private String returnOrderPay;

    private Long suppliersId;

    private Double returnOrderTotal;

    private static final long serialVersionUID = 1L;
}
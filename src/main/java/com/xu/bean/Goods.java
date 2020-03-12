package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * goods
 * @author 
 */
@Data
public class Goods implements Serializable {
    private Long goodsId;

    private String approveId;

    private String batchId;

    private String goodsName;

    private Double price;

    private String space;

    private Long supplierId;

    private String unit;

    private static final long serialVersionUID = 1L;
}
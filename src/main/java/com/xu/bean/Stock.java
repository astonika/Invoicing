package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * stock
 * @author 
 */
@Data
public class Stock implements Serializable {
    private Long stockId;

    private String stockArea;

    private Long stockCount;

    private Long goodsId;

    private static final long serialVersionUID = 1L;
}
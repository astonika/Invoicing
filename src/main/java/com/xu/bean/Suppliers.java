package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * suppliers
 * @author 
 */
@Data
public class Suppliers implements Serializable {
    private Long suppliersId;

    private String address;

    private String bank;

    private Long bankAccount;

    private String email;

    private String linkMan;

    private String linkTel;

    private String supplierName;

    private String telPhone;

    private String zip;

    private static final long serialVersionUID = 1L;
}
package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * customer
 * @author 
 */
@Data
public class Message implements Serializable {
    private Long customerId;

    private String address;

    private String bank;

    private Long bankAccount;

    private String email;

    private String linkMan;

    private String linkTel;

    private String customerName;

    private String telPhone;

    private String zip;

    private static final long serialVersionUID = 1L;
}
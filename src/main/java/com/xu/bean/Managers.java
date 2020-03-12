package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * managers
 * @author 
 */
@Data
public class Managers implements Serializable {
    private Long managersId;

    private Long managersAge;

    private String managersGender;

    private String managersName;

    private String managersPassword;

    private String managersPhonenumber;

    private static final long serialVersionUID = 1L;
}
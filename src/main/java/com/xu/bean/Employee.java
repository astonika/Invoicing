package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * employee
 * @author 
 */
@Data
public class Employee implements Serializable {
    private Long employeeId;

    private Long employeeAge;

    private String employeeGender;

    private String employeeName;

    private String employeePassword;

    private String employeePhonenumber;

    private static final long serialVersionUID = 1L;
}
package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * dept
 * @author 
 */
@Data
public class Dept implements Serializable {
    private Long deptId;

    private String deptName;

    private static final long serialVersionUID = 1L;
}
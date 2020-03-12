package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * dept_emp
 * @author 
 */
@Data
public class DeptEmpKey implements Serializable {
    private Long deptDeptId;

    private Long empEmployeeId;

    private static final long serialVersionUID = 1L;
}
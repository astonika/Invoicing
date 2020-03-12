package com.xu.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * dept_man
 * @author 
 */
@Data
public class DeptManKey implements Serializable {
    private Long deptDeptId;

    private Long manManagersId;

    private static final long serialVersionUID = 1L;
}
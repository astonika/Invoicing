package com.xu.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * message
 * @author 
 */
@Data
public class Message implements Serializable {
    private Long id;

    private Date date;

    private String msg;

    private String flag;

    private static final long serialVersionUID = 1L;
}
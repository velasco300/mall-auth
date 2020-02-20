package com.perfect.mall.mallauth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

}

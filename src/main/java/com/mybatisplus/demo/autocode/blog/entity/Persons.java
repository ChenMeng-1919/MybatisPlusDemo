package com.mybatisplus.demo.autocode.blog.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author cm
 * @since 2021-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Persons implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("PersonID")
    private Integer PersonID;

    @TableField("LastName")
    private String LastName;

    @TableField("FirstName")
    private String FirstName;

    @TableField("Address")
    private String Address;

    @TableField("City")
    private String City;


}

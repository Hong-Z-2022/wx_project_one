package com.wx.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class BaseInfoEntity {

    @TableField("created_by")
    private String createdBy;

    @TableField("created_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdDate;

    @TableField("updated_by")

    private String updatedBy;

    @TableField("updated_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedDate;

    @TableField("is_deleted")
    private String isDeleted;
}

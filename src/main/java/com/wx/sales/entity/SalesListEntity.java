package com.wx.sales.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.entity.BaseInfoEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("wx_sales_list_info")
public class SalesListEntity extends BaseInfoEntity {

    @TableId(value = "id_wx_sales_list_info", type = IdType.AUTO)
    private Integer id;

    private String brandTypeCode;

    private String brandTypeName;

    private String brandCode;

    private String brandName;

    private String salesModel;

    private BigDecimal salesNumber;

    private BigDecimal salesPrice;

    private BigDecimal salesTotalPrice;

    private Date salesDate;

    private String customerName;

    private String customerTel;

    private String customerAddr;

    private String salesPlatformCode;

    private String employeeCode;

}

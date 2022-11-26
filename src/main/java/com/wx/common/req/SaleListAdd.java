package com.wx.common.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class SaleListAdd {

    private String brandTypeCode;

    @NotEmpty(message = "品牌类型名称不能为空")
    private String brandTypeName;

    private String brandCode;

    @NotEmpty(message = "品牌名称不能为空")
    private String brandName;

    @NotEmpty(message = "销售型号不能为空")
    private String salesModel;

    @NotEmpty(message = "销售数量不能为空")
    private BigDecimal salesNumber;

    @NotEmpty(message = "销售单价不能为空")
    private BigDecimal salesPrice;

    private BigDecimal salesTotalPrice;

    @NotEmpty(message = "销售日期不能为空")
    private Date salesDate;

    @NotEmpty(message = "客户姓名不能为空")
    private String customerName;

    @NotEmpty(message = "客户电话不能为空")
    private String customerTel;

    @NotEmpty(message = "客户地址不能为空")
    private String customerAddr;

    private String salesPlatformCode;

    private String employeeCode;
}

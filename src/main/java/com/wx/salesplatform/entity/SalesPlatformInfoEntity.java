package com.wx.salesplatform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.entity.BaseInfoEntity;
import lombok.Data;

@Data
@TableName("wx_sales_platform_list_info")
public class SalesPlatformInfoEntity extends BaseInfoEntity {

    @TableId(value = "id_wx_sales_platform_list_info", type = IdType.AUTO)
    private Integer id;

    private String salesPlatformName;

    private String salesPlatformCode;

}

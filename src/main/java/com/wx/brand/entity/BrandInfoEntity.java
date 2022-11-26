package com.wx.brand.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.entity.BaseInfoEntity;
import lombok.Data;

@Data
@TableName("wx_brand_list_info")
public class BrandInfoEntity extends BaseInfoEntity {

    @TableId(value = "id_wx_brand_list_info", type = IdType.AUTO)
    private Integer id;

    private String brandName;

    private String brandCode;

    private String brandTypeCode;

}

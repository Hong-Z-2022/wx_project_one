package com.wx.brand.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.entity.BaseInfoEntity;
import lombok.Data;

@Data
@TableName("wx_brand_type_list_info")
public class BrandTypeInfoEntity extends BaseInfoEntity {

    @TableId(value = "id_wx_brand_type_list_info", type = IdType.AUTO)
    private Integer id;

    private String brandTypeName;

    private String brandTypeCode;

}

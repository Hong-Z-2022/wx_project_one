package com.wx.salesplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wx.common.entity.AjaxResult;
import com.wx.salesplatform.entity.SalesPlatformInfoEntity;
import com.wx.salesplatform.mapper.SalesPlatformInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/platform")
public class SalesPlatformInfoController {

    @Autowired
    private SalesPlatformInfoMapper salesPlatformInfoMapper;

    @PostMapping("/querySalesPlatform")
    public AjaxResult queryBrandName() {
        QueryWrapper<SalesPlatformInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("is_deleted","0");
        return new AjaxResult(200,"SUCCESS",salesPlatformInfoMapper.selectList(queryWrapper));
    }

}


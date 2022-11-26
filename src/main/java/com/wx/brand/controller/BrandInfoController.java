package com.wx.brand.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wx.brand.entity.BrandInfoEntity;
import com.wx.brand.entity.BrandTypeInfoEntity;
import com.wx.brand.mapper.BrandInfoMapper;
import com.wx.brand.mapper.BrandTypeInfoMapper;
import com.wx.common.entity.AjaxResult;
import com.wx.common.req.SalesBrandReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandInfoController {

    @Autowired
    private BrandTypeInfoMapper brandTypeInfoMapper;

    @Autowired
    private BrandInfoMapper brandInfoMapper;

    @PostMapping("/queryBrandName")
    public AjaxResult queryBrandName(@RequestBody SalesBrandReq salesBrandReq) {
        QueryWrapper<BrandInfoEntity> brandInfoEntityQueryWrapper = new QueryWrapper<>();
        brandInfoEntityQueryWrapper.eq("brand_type_code",salesBrandReq.getBrandTypeCode());
        brandInfoEntityQueryWrapper.eq("is_deleted","0");
        return new AjaxResult(200,"SUCCESS",brandInfoMapper.selectList(brandInfoEntityQueryWrapper));
    }

    @PostMapping("/queryBrandTypeName")
    public AjaxResult queryBrandTypeName() {
        QueryWrapper<BrandTypeInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("is_deleted","0");
        List<BrandTypeInfoEntity> brandTypeInfoEntities = brandTypeInfoMapper.selectList(queryWrapper);
        return new AjaxResult(200,"SUCCESS",brandTypeInfoEntities);
    }
}


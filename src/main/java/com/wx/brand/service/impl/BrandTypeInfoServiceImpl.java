package com.wx.brand.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.brand.entity.BrandTypeInfoEntity;
import com.wx.brand.mapper.BrandTypeInfoMapper;
import com.wx.brand.service.BrandTypeInfoService;
import org.springframework.stereotype.Service;

@Service
public class BrandTypeInfoServiceImpl extends ServiceImpl<BrandTypeInfoMapper, BrandTypeInfoEntity> implements BrandTypeInfoService {
}

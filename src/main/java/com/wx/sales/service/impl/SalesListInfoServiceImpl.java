package com.wx.sales.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.common.entity.AjaxResult;
import com.wx.sales.entity.SalesListEntity;
import com.wx.sales.mapper.SaleListInfoMapper;
import com.wx.sales.service.SalesListInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesListInfoServiceImpl extends ServiceImpl<SaleListInfoMapper, SalesListEntity> implements SalesListInfoService {

    @Autowired
    private SaleListInfoMapper mapper;

    @Override
    public AjaxResult querySaleList(){
        List<SalesListEntity> list = mapper.selectList(new QueryWrapper<SalesListEntity>().eq("is_deleted", "0"));
        return new AjaxResult(200,"success",list);
    }

}

package com.wx.sales.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.common.entity.AjaxResult;
import com.wx.sales.entity.SalesListEntity;

public interface SalesListInfoService extends IService<SalesListEntity> {

    AjaxResult querySaleList();
}

package com.wx.sales.controller;

import com.sun.istack.internal.NotNull;
import com.wx.common.entity.AjaxResult;
import com.wx.sales.entity.SalesListEntity;
import com.wx.common.req.SaleListAdd;
import com.wx.sales.service.impl.SalesListInfoServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/sales")
public class SalesListInfoController {

    @Autowired
    private SalesListInfoServiceImpl salesListInfoService;

    @GetMapping("/query")
    public AjaxResult query() {
        return salesListInfoService.querySaleList();
    }

    @PostMapping("/add")
    public AjaxResult add(@Valid @NotNull @RequestBody SaleListAdd req) {
        SalesListEntity salesListEntity = new SalesListEntity();
        try {
            BeanUtils.copyProperties(salesListEntity,req);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        boolean save = salesListInfoService.save(salesListEntity);
        return new AjaxResult(200,"SUCCESS",save);
    }
}

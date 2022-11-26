package com.wx.common.config;


import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.druid.util.StringUtils;
import com.wx.common.entity.AjaxResult;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws  Exception{
        log.info("请求被拦截{}",request);

        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        String token = request.getHeader("Authorization");
        log.info("token:{}",token);
        if(StringUtils.isEmpty(token)){
            AjaxResult ajaxResult= AjaxResult.error("未登录");
            response.setContentType("application/json;charset=utf-8");
            log.info("{}", ajaxResult);
            response.getWriter().print(JSONUtils.toJSONString(ajaxResult));
            return false;
        }

        return true;
    }
}


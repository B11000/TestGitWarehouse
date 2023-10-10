package com.example.springjpa.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * ／－－－－▼---------◅▹　◆　◃▻----------▼－－－＼
 * 　@Author-------: B_11000··················
 * 　@CreationDate-: 2023-10-09 20:09:41······
 * 　@Version------: 0.0.0····················
 * ＼－－－－▲---------◅▹　◆　◃▻----------▲－－－｜
 */


public class Interceptor_2Interceptor implements HandlerInterceptor {
    //前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("前");
        return true;
    }

    //后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("后");
    }

    //完成后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("完成");
    }
}

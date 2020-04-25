package com.yyx.inteceptor;

import com.yyx.controller.LoginClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InteceptorTest implements HandlerInterceptor {

    /*注入控制器接口层*/
    @Autowired
    private LoginClass loginClass;

    /**
     *单元方法前调用
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o ：HandlerMethod类型，存储了此次请求的单元方法的方法对象。
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        System.out.println("=========我是拦截器===========");

        return true;//放行
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

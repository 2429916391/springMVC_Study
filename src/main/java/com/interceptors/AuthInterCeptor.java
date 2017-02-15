package com.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * author 2429916391@qq.com on 2017/2/9.
 */
public class AuthInterCeptor implements HandlerInterceptor{

    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        boolean b = true;
        HttpSession session = req.getSession();
        if(session.getAttribute("admin")==null){
            b = false;
            req.getRequestDispatcher("login.jsp").forward(req,res);
        }
        return b;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

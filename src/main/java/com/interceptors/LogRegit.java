package com.interceptors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * author 2429916391@qq.com on 2017/2/9.
 */
@Controller
@RequestMapping("/admin")
public class LogRegit {

    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return "显示主页内容";
    }
    @RequestMapping("/show.do")
    @ResponseBody
    public String logReg(HttpServletRequest req) {
        String n = req.getParameter("name");
        String p = req.getParameter("pass");
        String ss = "登录失败";
        if ("admin".equalsIgnoreCase(n) && "a123".equalsIgnoreCase(p)) {
            ss = "登录成功";
            req.getSession().setAttribute("admin",n);
        }
        return ss;
    }
}

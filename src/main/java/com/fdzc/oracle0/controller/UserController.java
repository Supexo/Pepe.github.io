package com.fdzc.oracle0.controller;

import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UserController {
    @Autowired
    IUserService userService;


    @RequestMapping("/login")
    public ModelAndView login(@RequestParam(name="err",required = false) String err){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        if(err==null){
            err = "0";
        }
        mav.addObject("err", err);
        return mav;
    }

    @RequestMapping("/loginCheck")
    public void loginCheck(HttpServletRequest request, HttpServletResponse response, @RequestParam(name="username") String username, @RequestParam(name = "password") String password) throws IOException {
        User user = userService.checkUserLogin(username,password);
        if(user==null){
            response.sendRedirect("/login?err=1");
        }else {
            Cookie c = new Cookie("user",user.getCookie());
            c.setMaxAge(60*10);
            c.setPath("/");
            response.addCookie(c);
            response.sendRedirect("/index");
        }

    }
}

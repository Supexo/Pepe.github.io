package com.fdzc.oracle0.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping("/loginCheck")
    public void loginCheck(HttpServletRequest request){
        Cookie[] cookie = request.getCookies();
        if(cookie==null){
            System.out.println("没有cookie");
            
        }else{
            for(Cookie c:cookie){
                System.out.println("name:"+c.getName()+"value:"+c.getValue());
            }
        }

    }
}

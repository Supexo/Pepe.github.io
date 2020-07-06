package com.fdzc.oracle0.controller;

import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.bean.UserType;
import com.fdzc.oracle0.service.IStoreService;
import com.fdzc.oracle0.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    IStoreService storeService;

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
            c = new Cookie("username",user.getName());
            c.setMaxAge(60*10);
            c.setPath("/");
            response.addCookie(c);
            if(user.getType()== UserType.ADMINISTER){
                response.sendRedirect("/manage");
            }else{
                response.sendRedirect("/index");
            }

        }
    }

    @RequestMapping("/edit/{gid}")
    public void editGame(HttpServletRequest request, HttpServletResponse response,@PathVariable String gid) throws IOException {
        /*
        TODO:检查用户登陆，没登陆去登录页面，否则去编辑页面
         */
        // 检查用户登录
        Cookie[] cookie = request.getCookies();
        if(cookie==null){
            response.sendRedirect("/login");
        }else{
            User user = null;
            for(Cookie c:cookie){
                if("user".equals(c.getName())){
                    // 有记录登录状态
                    user = userService.getUserByCookie(c.getValue());
//                    System.out.println(user.getName());
                    if(storeService.addToCart(gid,user.getUid())){
                        response.sendRedirect("/cart");
                    }else{
                        //添加失败
                        response.sendRedirect("/cart?err=1");
                    }

                }
            }
            // 有cookie但是没有记录登录状态
            if(user==null) {
                response.sendRedirect("/login");
            }
        }
    }

}

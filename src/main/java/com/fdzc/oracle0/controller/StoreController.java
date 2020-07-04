package com.fdzc.oracle0.controller;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.service.IUserService;
import com.fdzc.oracle0.service.StoreServiceImpl;
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
import java.util.ArrayList;
import java.util.List;
@RestController
public class StoreController {
    @Autowired
    StoreServiceImpl storeService;

    @Autowired
    IUserService userService;

    @RequestMapping("/index")
    public ModelAndView getMainPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        List<Game> games = storeService.getLatestGames();
        List<Game> navs = storeService.getNavGames();
        mav.addObject("navs",navs);
        mav.addObject("games",games);
        return mav;
    }

    @RequestMapping("/addToCart/{gid}")
    public ModelAndView addToCart(@PathVariable Integer gid){
        /*
        TODO:检查用户登陆，没登陆去登录页面，否则直接进入购物车页面
         */
        ModelAndView mav = new ModelAndView();

        return mav;
    }

    @RequestMapping("/info/{gid}")
    public ModelAndView getInfo(@PathVariable Integer gid){
        ModelAndView mav = new ModelAndView();
        Game game = storeService.getGame(gid);
        if(game==null){
            mav.setViewName("notFound");;
        }else{
            mav.setViewName("info");
            mav.addObject("game",game);
        }
        return mav;
    }

    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String keyword, @RequestParam(name="page",required = false) String page){

        ModelAndView mav = new ModelAndView();
        List<Game> games;
        games = storeService.getGames(keyword, page);
        mav.setViewName("search");
        mav.addObject("games",games);
        mav.addObject("keyword",keyword);
        return mav;
    }

    @RequestMapping("/cart")
    public ModelAndView search(HttpServletRequest request, HttpServletResponse response, @RequestParam(name="page",required = false)String page) throws IOException {
        ModelAndView mav = new ModelAndView();
        Cookie[] cookie = request.getCookies();
        if(cookie==null){
            response.sendRedirect("/login");
        }else{
            User user;
            for(Cookie c:cookie){
                if("user".equals(c.getName())){
                    // 有记录登录状态
                    user = userService.getUserByCookie(c.getValue());
                    List<Game> games = storeService.getCart(user.getUid(),page);
                }
            }
            // 有cookie但是没有记录登录状态
            response.sendRedirect("/login");
        }
        return mav;
    }
}

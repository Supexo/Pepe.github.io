package com.fdzc.oracle0.controller;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.service.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
@RestController
public class StoreController {
    @Autowired
    StoreServiceImpl storeService;
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
        return mav;
    }
}

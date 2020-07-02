package com.fdzc.oracle0.controller;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.service.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class StoreController {
    @Autowired
    StoreServiceImpl storeService;
    @RequestMapping("/index")
    public ModelAndView getMainPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        List<Game> games = storeService.newestGames();
        mav.addObject("games",games);
        return mav;
    }
}

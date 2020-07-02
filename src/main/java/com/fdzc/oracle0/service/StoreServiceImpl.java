package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.dao.IGameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class StoreServiceImpl implements IStoreService{
    @Autowired
    IGameDao userDao;

    @Override
    public List<Game> newestGames(){
        List<Game> games = new ArrayList<Game>();
        games = userDao.getGames();
        //返回最新上架的十个游戏
        return games;
    }
}

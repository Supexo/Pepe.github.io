package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.dao.IStoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StoreServiceImpl implements IStoreService{
    @Autowired
    IStoreDao userDao;

    @Override
    public List<Game> newestGames(){
        List<Game> games = new ArrayList<Game>();
        games = userDao.getTestGames();
        //返回最新上架的十个游戏
        return games;
    }

    @Override
    public Game getGames(int gid) {
        return null;
    }
}

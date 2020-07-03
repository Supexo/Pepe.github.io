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
    IStoreDao storeDao;

    @Override
    public List<Game> getLatestGames(){
        //返回最新上架的十个游戏
        return storeDao.getLatestGames();
    }

    @Override
    public List<Game> getGames() {
        return storeDao.getTestGames();
    }

    @Override
    public List<Game> getNavGames() {

        return storeDao.getNavGames();
    }

    @Override
    public Game getGame(int gid) {
        return storeDao.getGame(gid);
    }
}

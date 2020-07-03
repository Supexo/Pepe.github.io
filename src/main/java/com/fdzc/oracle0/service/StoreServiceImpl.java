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
    public List<Game> getGames(String keyword, String page) {
        List<Game> games = new ArrayList<>();
        int p;
        // 返回gid为-1的说明参数查询错误
        try {
            p = Integer.parseInt(page);
            System.out.println(p);
            storeDao.getGames(keyword,p);
        }catch (NumberFormatException e){
            // System.out.println("数字错误");
            Game g = new Game();
            g.setGid(-1);
            games.add(g);
        }
        return games;
    }

    @Override
    public Game getGame(int gid) {
        return storeDao.getGame(gid);
    }
}

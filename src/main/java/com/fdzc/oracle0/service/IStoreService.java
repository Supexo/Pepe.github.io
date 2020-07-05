package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.Game;

import java.util.List;

public interface IStoreService {
    public Game getGame(int gid);
    public List<Game> getLatestGames();
    public List<Game> getGames();
    public List<Game> getGames(String keyword, String page);
    public List<Game> getNavGames();
    // 查询购物车 - 一页十个
    public List<Game> getCart(int uid, String page);
    // 加入购物车 加入成功返回true，已在库中or已在购物车中or已下架返回false
    public boolean addToCart(String gid,int uid);
    // 删除购物车里某款游戏
    public void deleteFromCart(String gid, int uid);

}

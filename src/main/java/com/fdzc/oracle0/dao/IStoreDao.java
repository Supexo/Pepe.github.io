package com.fdzc.oracle0.dao;

import com.fdzc.oracle0.bean.Game;

import java.util.List;

public interface IStoreDao {
    // 获取某个游戏的搜索结果 - 一页10个
    public List<Game> getGames(String keyWord, int page);
    // 获取其中一个游戏的所有信息 - 记得查tag
    public Game getGame(int gid);
    // 加入购物车
    public void addToCart(int gid,int uid);
    // 删除购物车里某款游戏
    public void deleteFromCart(int gid, int uid);
    // 查询购物车 - 一页十个
    public List<Game> getCart(int uid, int page);
    // 购买成功
    public boolean addToRepository(int gid, int uid);
    // 管理添加游戏
    public void addGame(Game game);
    // 获取最新的10款游戏
    public List<Game> getLatestGames();
    // 获取三个游戏渲染首页
    public List<Game> getNavGames();
    // 测试用，可删除
    public List<Game> getTestGames();
    // 退款
    public void refund(int gid, int uid);
}

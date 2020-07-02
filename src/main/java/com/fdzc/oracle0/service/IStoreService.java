package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.Game;

import java.util.List;

public interface IStoreService {
    public List<Game> newestGames();
    public Game getGames(int gid);
}

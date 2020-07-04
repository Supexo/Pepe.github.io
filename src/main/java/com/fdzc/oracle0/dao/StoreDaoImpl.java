package com.fdzc.oracle0.dao;

import com.fdzc.oracle0.bean.Game;
import org.springframework.stereotype.Repository;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StoreDaoImpl implements IStoreDao {
    //仅作为测试用！
    private List<Game> games;
    private void setTestGames(){
        games = new ArrayList<>();
        List<String> tags = new ArrayList<>();
        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(1001,"NEKOPARA Vol. 3","NEKO WORKs","Sekai Project",7500,50,"水無月嘉祥所經營的蛋糕店『Soleil』裡的貓娘情人持續增加，今天也好評營業中。 自尊心很強、高傲又時髦的貓娘次女楓， 與總是陷入妄想獨自一人暴走的三女桂。 兩隻貓在姊妹之中的關係如同至交好友一般，因為一些契機而對夢想感到煩惱的楓， 想成為摯友的助力卻不知該怎麼做才好的桂，描繪一起朝著夢想成...","2017-5-25","nekopara3","",true, tags));
        tags.clear();

        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(1002,"NEKOPARA Vol. 2","NEKO WORKs","Sekai Project",7500,60,"由水無月嘉祥經營的蛋糕店「Soleil」，今天也在水無月家貓娘四姊妹＋妹妹時雨的幫忙下努力營業著。 嘴巴壞又不坦率，但實際上十項全能又愛護妹妹的長女紅豆， 以及正直又努力，可是卻笨手笨腳又愛逞強的四女椰子， 過去在姊妹中感情最好的這兩隻貓娘，不知何時開始變成了一對成天吵不膩的歡喜冤家。","2016-2-20","nekopara2","",true, tags));
        tags.clear();

        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(1003,"NEKOPARA Vol. 1","NEKO WORKs","Sekai Project",7500,60,"水無月嘉祥離開了經營著具有悠久傳統的和菓子老店的老家， 決心以西點師的身分，獨力開一間自己的蛋糕店\"La Soleil\"。 但是從老家寄來的搬家行李裡頭， 竟然混進了兩隻以前在老家養的人型貓，巧克力與香草。","2014-12-30","nekopara1","",true,tags));
        tags.clear();

        tags.add("Hentai");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(1004,"NEKOPARA Vol. 0","NEKO WORKs","Sekai Project",7500,60,"Please note that NEKOPARA Vol. 0 is a fandisc for NEKOPARA Vol. 1What's NEKOPARA? Why, it's a cat paradise! This is a story just before Kashou opened \"La Soleil\".Enjoy a page from the leisurely, daily lives of Shigure and the Minaduki household's catgirls!","2015-8-17","nekopara0","",true,tags));
        tags.clear();

        tags.add("视觉小说");
        tags.add("动漫");
        tags.add("恋爱模拟");
        games.add(new Game(1005,"DATE A LIVE: Rio Reincarnation","Idea Factory","Idea Factory International",13800,60,"Show the Spirits the power of love and save the world in this romantic visual novel!","2019-7-24","DAL-rio","",true,tags));
        tags.clear();

        tags.add("视觉小说");
        tags.add("动漫");
        tags.add("恋爱模拟");
        games.add(new Game(1006,"If My Heart Had Wings","MoeNovel","MoeNovel",4800,75,"本作品支持简体中文，请先购买本体再进行DLC免费更新为中文版。主角水瀬碧梦想成为一名自行车选手，但在一次自行车事故中不能再骑车，因此沮丧的水瀬碧回到家乡重新开始生活。失去了动力的水瀬碧偶然遇上被困在山坡上女主角小鸟。并一同亲眼目睹一架滑翔机在高空飞行时，开始了飞行梦想的旅程。","2013-6-28","If-My-Heart-Had-Wings","",true,tags));
        tags.clear();

        tags.add("大战略");
        tags.add("回合战略");
        tags.add("历史");
        games.add(new Game(1007,"Total War: THREE KINGDOMS","CREATIVE ASSEMBLY","SEGA",38800,25,"《Total War™: THREE KINGDOMS》首次在这一获奖无数的策略类游戏系列中重塑中国古代的烽火传奇。在扣人心弦的回合制战役中，可以建设国家，治国理政；在令人叹为观止的即时战斗中，则可以征战沙场，破军杀敌。《THREE KINGDOMS》将二者巧妙结合，重新定义了那段英雄辈出的传奇历史。","2019-5-23","Total-War-THREE-KINGDOMS","",true,tags));
        tags.clear();

        tags.add("大战略");
        tags.add("回合战略");
        tags.add("二战");
        games.add(new Game(1008,"Hearts of Iron IV","Paradox Development Studio","Paradox Interactive",21000,75,"Victory is at your fingertips! Your ability to lead your nation is your supreme weapon, the strategy game Hearts of Iron IV lets you take command of any nation in World War II; the most engaging conflict in world history.","2016-6-6","hoi4","",true,tags));
        tags.clear();

        tags.add("大战略");
        tags.add("回合战略");
        tags.add("历史");
        games.add(new Game(1009,"Europa Universalis IV","Paradox Development Studio","Paradox Interactive",21000,80,"Four centuries of detailed history come alive in Paradox’s classic grand strategy game. Lead any nation from Renaissance to Revolution in a complex simulation of the early modern world. Master the art of war, diplomacy and trade to shape and change your nation’s history!","2013-6-6","eu4","",true,tags));
        tags.clear();

        tags.add("大战略");
        tags.add("回合战略");
        tags.add("科幻");
        games.add(new Game(1010,"Stellaris","Paradox Development Studio","Paradox Interactive",21000,80,"在这款由Paradox Development Studio精心打造的科幻大型战略游戏中，探索充满奇迹的浩瀚银河。与千奇百怪的外星种族互动、发现奇异新世界并体验其中令人意想不到的事件，同时扩大您帝国的影响力。每一场新的冒险皆拥有几乎无穷无尽的可能性。","2016-5-9","stellaris","",true,tags));
        tags.clear();

        tags.add("大战略");
        tags.add("回合战略");
        tags.add("历史");
        games.add(new Game(1011,"Imperator: Rome","Paradox Development Studio","Paradox Interactive",21000,80,"Imperator: Rome 是由 Paradox Development Studio 推出的最新大战略游戏。此游戏的时代背景为介于继承亚历山大的东方诸王朝至罗马帝国建立之间的混乱世纪","2019-4-26","imperator","",true,tags));
        tags.clear();

        tags.add("大战略");
        tags.add("回合战略");
        tags.add("二战");
        games.add(new Game(1012,"Hearts of Iron III","Paradox Development Studio","Paradox Interactive",7500,75,"Hearts of Iron III lets you play the most engaging conflict in world history, World War 2, on all fronts as any country and through multiple different scenarios. Guide your nation to glory between 1936 and 1948 and wage war, conduct diplomacy and build your industry in the most detailed World War 2 game ever ","2009-8-7","hoi3","",true, tags));
        tags.clear();

    }

    @Override
    public Game getGame(int gid) {
        setTestGames();//测试用数据初始化，后面记得删除

        for(int i=0;i<games.size();i++){
            if(gid==games.get(i).getGid()){
                return games.get(i);
            }
        }
        return null;
    }

    @Override
    public void addToCart(int gid, int uid) {

    }

    @Override
    public boolean addToRepository(int gid, int uid) {
        return false;
    }

    @Override
    public void addGame(Game game) {

    }

    @Override
    public List<Game> getGames(String keyWord, int page) {
        setTestGames();//测试用数据初始化，后面记得删除

        List<Game> resultGames = new ArrayList<>();
        for(Game g:games){
            if(checkGame(g,keyWord)){
                resultGames.add(g);
            }
        }
        return resultGames;
    }
    // 测试用的比对代码，真正使用时，直接在数据库查询清楚
    private boolean checkGame(Game g,String k){
        boolean result = false;
        // 看看在不在tag里
        for(String s: g.getTag()){
            if(s.toLowerCase().indexOf(k.toLowerCase())!=-1){
                return true;
            }
        }

        if(g.getName().toLowerCase().indexOf(k.toLowerCase())!=-1){
            result =  true;
        }else if(g.getSummary().toLowerCase().indexOf(k.toLowerCase())!=-1){
            result =  true;
        }else if(g.getDev().toLowerCase().indexOf(k.toLowerCase())!=-1){
            result =  true;
        }else if(g.getPub().toLowerCase().indexOf(k.toLowerCase())!=-1){
            result =  true;
        }

        return result;
    }
    @Override
    public void deleteFromCart(int gid, int uid) {

    }

    @Override
    public List<Game> getCart(int uid, int page) {
        return null;
    }

    @Override
    public List<Game> getLatestGames() {
        setTestGames();//测试用数据初始化，后面记得删除

        List<Game> latestGames = new ArrayList<>();
        for(int i=0;i<10;i++){
            latestGames.add(games.get(i));
        }
        // 为了测试方便，这里返回随意10个
        // 以时间为排序，将最新发售的十个游戏返回
        return latestGames;
    }

    @Override
    public List<Game> getNavGames() {
        setTestGames();//测试用数据初始化，后面记得删除

        List<Game> navGames = new ArrayList<>();
        navGames.add(games.get(1));
        navGames.add(games.get(4));
        navGames.add(games.get(11));
        //为了方便写死了，这里请返回三个不一样的内容。
        return navGames;
    }

    public List<Game> getTestGames(){
        setTestGames();
        return games;
    }

    @Override
    public void refund(int gid, int uid) {

    }



    /////////////////////////////////////KOMACHI///////////////////////////////////////
    @Override
    public List<Game> getTestLatestGames() {    // 获取最新的10款游戏
        CallableStatement call = null;
        ResultSet rs = null;
        list<Game> lst=new list<Game>();

        call = conn.prepareCall("{ call 获取商城中最新10款游戏的ID(?) }");
        call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
        call.execute();    //执行存储过程
        rs = ((OracleCallableStatement)call).getCursor(1); //获取结果集
        while (rs.next()) {
            lst.add(getTestGame(rs.getInt("GID")));  //用结果集中的ID作为参数获取整个游戏的信息（Game对象），然后加入列表中
        }

        return lst;
    }

    public List<Game> getTestNavGames() {
        CallableStatement call = null;
        ResultSet rs = null;
        list<Game> navGames=new list<Game>();

        call = conn.prepareCall("{ call 随机获取商城中3款游戏的ID(?) }");
        call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
        call.execute();    //执行存储过程
        rs = ((OracleCallableStatement)call).getCursor(1); //获取结果集
        while (rs.next()) {
            lst.add(getTestGame(rs.getInt("GID")));  //用结果集中的ID作为参数获取整个游戏的信息（Game对象），然后加入列表中
        }

        return navGames;
    }

    @Override
    public Game getTestGame(int gid) {   // 根据 ID 获取某个游戏的所有信息 - 记得查tag
        CallableStatement call = null;
        ResultSet rs = null

        call = conn.prepareCall("{ call 获取某个游戏除了tag的所有信息(?,?) }");
        call.setInt(1,gid);
        call.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
        call.execute();    //执行存储过程
        rs = ((OracleCallableStatement)call).getCursor(2); //获取结果

        Game game = new Game();
        game.setGid(rs.getInt("GID"));
        game.setName(rs.getString("NAME"));
        game.setDev(rs.getString("DEVELOPER"));
        game.setPub(rs.getString("PUBLISHER"));
        game.setPrice(rs.getInt("PRICE"));
        game.setDiscount(rs.getInt("DISCOUNT"));
        game.setSummary(rs.getString("SUMMARY"));
        game.setPubDate(rs.getString("ISSUED_DATE"));
        game.setMainImg(rs.getString("MAIN_IMAGE"));
        game.setGameFile(rs.getString("GAME_FILE"));

        list<String> tag = getGameTags(gid);
        game.setTag(tag);

        return game;
    }

    private List<String> getGameTags(int gid){
        CallableStatement call = null;
        ResultSet rs = null
        List<String> lst = new ArrayList<String>();

        call = conn.prepareCall("{ call 获取某个游戏的tag集(?,?) }");
        call.setInt(1,gid);
        call.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
        call.execute();    //执行存储过程
        rs = ((OracleCallableStatement)call).getCursor(2); //获取结果集
        while (rs.next()) {
            lst.add(rs.getString("NAME"));
        }

        return lst;
    }

    /////////////////////////////////////KOMACHI///////////////////////////////////////

}

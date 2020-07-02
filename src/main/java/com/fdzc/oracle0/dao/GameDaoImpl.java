package com.fdzc.oracle0.dao;

import com.fdzc.oracle0.bean.Game;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GameDaoImpl implements IGameDao{
    //仅作为测试用！
    private List<Game> games;
    private void setTestGames(){
        games = new ArrayList<>();
        List<String> tags = new ArrayList<>();
        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(1,"NEKOPARA Vol. 3","NEKO WORKs","Sekai Project",7500,50,"水無月嘉祥所經營的蛋糕店『Soleil』裡的貓娘情人持續增加，今天也好評營業中。 自尊心很強、高傲又時髦的貓娘次女楓， 與總是陷入妄想獨自一人暴走的三女桂。 兩隻貓在姊妹之中的關係如同至交好友一般，因為一些契機而對夢想感到煩惱的楓， 想成為摯友的助力卻不知該怎麼做才好的桂，描繪一起朝著夢想成...","2017-5-25","nekopara3","",true,tags));
        tags.clear();

        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(2,"NEKOPARA Vol. 2","NEKO WORKs","Sekai Project",7500,60,"由水無月嘉祥經營的蛋糕店「Soleil」，今天也在水無月家貓娘四姊妹＋妹妹時雨的幫忙下努力營業著。 嘴巴壞又不坦率，但實際上十項全能又愛護妹妹的長女紅豆， 以及正直又努力，可是卻笨手笨腳又愛逞強的四女椰子， 過去在姊妹中感情最好的這兩隻貓娘，不知何時開始變成了一對成天吵不膩的歡喜冤家。","2016-2-20","nekopara2","",true,tags));
        tags.clear();

        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(3,"NEKOPARA Vol. 1","NEKO WORKs","Sekai Project",7500,60,"水無月嘉祥離開了經營著具有悠久傳統的和菓子老店的老家， 決心以西點師的身分，獨力開一間自己的蛋糕店\"La Soleil\"。 但是從老家寄來的搬家行李裡頭， 竟然混進了兩隻以前在老家養的人型貓，巧克力與香草。","2014-12-30","nekopara1","",true,tags));
        tags.clear();

        tags.add("Hentai");
        tags.add("色情内容");
        tags.add("裸露");
        tags.add("可爱");
        games.add(new Game(4,"NEKOPARA Vol. 0","NEKO WORKs","Sekai Project",7500,60,"Please note that NEKOPARA Vol. 0 is a fandisc for NEKOPARA Vol. 1What's NEKOPARA? Why, it's a cat paradise! This is a story just before Kashou opened \"La Soleil\".Enjoy a page from the leisurely, daily lives of Shigure and the Minaduki household's catgirls!","2015-8-17","/nekopara0","",true,tags));
        tags.clear();

    }

    // 返回全部游戏
    @Override
    public List<Game> getGames() {
        setTestGames();
        return games;
    }
}

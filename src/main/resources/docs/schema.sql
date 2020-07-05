--自增序列
Create sequence t_user_id_seq Minvalue 1001 Nomaxvalue Increment by 1 start with 1001 nocache;
Create sequence t_game_id_seq Minvalue 1001 Nomaxvalue Increment by 1 start with 1001 nocache;
Create sequence t_tag_id_seq Minvalue 1001 Nomaxvalue Increment by 1 start with 1001 nocache;
Create sequence t_ugr_id_seq Minvalue 1001 Nomaxvalue Increment by 1 start with 1001 nocache;
Create sequence t_gtr_id_seq Minvalue 1001 Nomaxvalue Increment by 1 start with 1001 nocache;

--建表语句
Create table tbl_users(
  UID int,
  TYPE int NOT NULL,
  NAME varchar2(256) NOT NULL,
  PASSWORD varchar2(16) NOT NULL,
  AVATAR varchar2(256) NOT NULL,
  SURPLUS int NOT NULL,
  COOKIE varchar2(256) NOT NULL,
  constraint PK_USER_FS PRIMARY KEY (UID)
);

Create table tbl_games(
  GID int,
  NAME varchar2(256) NOT NULL,
  DEV varchar2(256) NOT NULL,
  PUB varchar2(256) NOT NULL,
  PRICE int NOT NULL,
  DISCOUNT int NOT NULL,
  SUMMARY varchar2(256) NOT NULL,
  PUBLISH_DATE varchar2(16) NOT NULL,
  MAIN_IMAGE varchar2(256) NOT NULL,
  STATUS int NOT NULL,
  constraint PK_GAME PRIMARY KEY (GID)
);

Create table tbl_tags(
  TID int,
  NAME varchar2(16) NOT NULL,
  constraint PK_TAG_FS PRIMARY KEY (TID)
);

Create table tbl_user_game_relation(
  UGR int,
  UID int,
  GID int,
  constraint PK_UGR_FS PRIMARY KEY (UGR),
  constraint FK_UGR_USER_FS FOREIGN KEY (UID) REFERENCES tbl_users(UID),
  constraint FK_UGR_GAME_FS FOREIGN KEY (GID) REFERENCES tbl_games(GID)
);

Create table tbl_game_tag_relation(
  GTR int,
  GID int,
  TID int,
  constraint PK_GTR_FS PRIMARY KEY (GTR),
  constraint FK_GTR_GAME_FS FOREIGN KEY (GID) REFERENCES tbl_games(GID),
  constraint FK_GTR_TAG_FS FOREIGN KEY (TID) REFERENCES tbl_tags(TID)
);

--用户表初始化插入语句
INSERT INTO tbl_users VALUES();
INSERT INTO tbl_users VALUES();
SELECT 1 FROM dual;

--游戏表初始化插入语句
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'游魂2-you are the only one-','Lump of Sugar','HIKARI FIELD',11900,71,
'本作是由知名美少女游戏品牌Lump of Sugar（方糖社）制作的一款奇幻恋爱题材作品。也是高人气作品《游魂-Kiss on my Deity-》时隔8年
推出正统续作。本作仍由前作原画师萌木原文武担当原画人设，剧情则在继承原有世界观基础上引入新角色与故事，同时又妥善照顾了玩家的情怀面
让前作主角们悉数登场。','2016-12-9','tayutama2',1);
INSERT INTO tbl_games VALUES(t_tag_id_seq.nextval,'CLANNAD','VisualArts/Key','Sekai Project',12600,50,'空前热门的作品「CLANNAD」
通过「家族」这一主题，以宏大的剧本、美丽的CG和动人的音乐，描绘了一个人与小镇、人与人的故事。','2004-4-28','clannad',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'DATE A LIVE: Rio Reincarnation','Idea Factory','Idea Factory International',13800,60,
'Show the Spirits the power of love and save the world in this romantic visual novel!','2019-7-24','DAL-rio',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'How to Raise a Wolf Girl','Sweet & Tea','Sekai Project',7000,26,
'Shuuji and Kana have their hands full teaching Iroha how to be human again, after she spends ten years in the
mountains with a wolf god. But who is really raising who?','2019-10-12','How-to-Raise-a-Wolf-Girl',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'If My Heart Had Wings','MoeNovel','MoeNovel',4800,75,'本作品支持简体中文，请先购买本体
再进行DLC免费更新为中文版。主角水瀬碧梦想成为一名自行车选手，但在一次自行车事故中不能再骑车，因此沮丧的水瀬碧回到家乡重新开始生活。失去了动力
的水瀬碧偶然遇上被困在山坡上女主角小鸟。并一同亲眼目睹一架滑翔机在高空飞行时，开始了飞行梦想的旅程。','2013年6月28日','If-My-Heart-Had-Wings',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'The logic of the miniature garden','Cabbit','SakuraGame',3600,50,'本作
是一款有著萌系畫風，與美少女一起探索神秘的學園推理ADV作品。作為懸疑向作品，在推理解謎之外，著重強調對角色的刻畫，在充滿黑暗的“箱庭市”裡，
作為普通人的男主無法改變現狀，遊戲從一個男主見證者的視角，給玩家傳達了城市裡人性的“惡”。','2019-6-19','',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'Muv-Luv','aNCHOR Inc.','aNCHOR Inc.',9000,40,
'白陵大附属柊学园3年级白银武和青梅竹马鉴纯夏，好友铠衣尊人过着愉快普通的校园生活。某一天的早上，醒来的武发现身旁睡着一名少女。
这位名叫御剑冥夜的少女就这样住了下来。','2016-7-15','Muv-Luv',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'Muv-Luv Alternative','aNCHOR Inc.','aNCHOR Inc.',11600,41,
'──那是沒被說出的另類結束。非常渺小的、非常壯大的、非常重要的、愛與勇氣的童話故事──','2017年9月18日','Muv-Luv-Alternative',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'NEKO-NIN exHeart','Whirlpool','Sekai Project',3600,61,'Japan. From time immemorial,
there are those who possess superhuman abilities. These beings who looked like a cross between man and beast are called Demi-Humans.
They acted as Ninja and served those in power.','2017年4月22日','NEKO-NIN-exHeart',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'NEKO-NIN exHeart 2','Whirlpool','Sekai Project',3700,51,'This is a Sequel to
NEKO-NIN exHeart. Japan. From time immemorial, there are those who possess superhuman abilities. These beings who looked like a
cross between man and beast are called Demi-Humans. They acted as Ninja and served those in power.','2018-4-28','NEKO-NIN-exHeart2',1)
INSERT INTO tbl_games VALUES(t_game_id_seq.nextval,'NEKO-NIN exHeart 3','Whirlpool','Sekai Project',3700,32,
'We have arrived from the Fuuma Village in order to serve you, sir!','2019-10-19','NEKO-NIN-exHeart3',1)
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
INSERT INTO tbl_games VALUES()
SELECT 1 FROM dual;

--Tag表初始化插入语句
INSERT ALL
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'动漫')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'可爱')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'视觉小说')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'恋爱模拟')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'色情内容')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'剧情丰富')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'爱情')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'剧情')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'单人')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'模拟')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'裸露')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'成人')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'冒险')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'独立')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'休闲')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'暴力')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'血腥')

INTO tbl_tags VALUES(t_tag_id_seq.nextval,'动漫')
INTO tbl_tags VALUES(t_tag_id_seq.nextval,'动漫')
INTO tbl_tags VALUES()
SELECT 1 FROM dual;

--用户库存表初始化插入语句
INSERT ALL
INTO tbl_user_game_relation VALUES()
INTO tbl_user_game_relation VALUES()
SELECT 1 FROM dual;

--游戏Tag表初始化插入语句
INSERT ALL
INTO tbl_game_tag_relation VALUES()
INTO tbl_game_tag_relation VALUES()
SELECT 1 FROM dual;

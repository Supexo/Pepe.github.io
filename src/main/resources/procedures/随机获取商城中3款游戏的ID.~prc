create or replace procedure 随机获取商城中3款游戏的ID(
       o_cursor out CURSOR_TYPE
)
is
begin
       open o_cursor for
            select GID from (select * from TBL_GAME order by dbms_random.random()) where rownum <=3;
                        
end 随机获取商城中3款游戏的ID;
/

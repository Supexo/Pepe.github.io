create or replace procedure 获取某个游戏除了tag的所有信息(
       gid in int,
       o_cursor out CURSOR_TYPE
)
is
begin
       open o_cursor for
            select * from TBL_GAME where GID = gid;
             
end 获取某个游戏除了tag的所有信息;
/

create or replace procedure 根据ID获取某个游戏的tag集(
       gid in int, 
       o_cursor out CURSOR_TYPE
)
is
begin
       open o_cursor for
            select b.name from TBL_GAME_TAG_RELATION a inner join TBL_TAG b where a.GID=?;
            
end 根据ID获取某个游戏的tag集;
/

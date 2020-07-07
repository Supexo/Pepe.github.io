create or replace procedure 获取商城中最新10款游戏的ID(
       o_cursor out CURSOR_TYPE
)
is
begin
       open o_cursor for
            select GID from TBL_GAME order by ISSUED_DATE desc limit 10;
            
end 获取商城中最新10款游戏的ID;
/

create or replace procedure GetGameInfoWithoutTags(
       ggid in int, 
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select * from TBL_GAMES where GID = ggid;
            
end GetGameInfoWithoutTags;
/

create or replace procedure GetGameTags(
       gid in int, 
       o2_cursor out sys_refcursor
)
is
begin
       open o2_cursor for
            select b.name from TBL_GAME_TAG_RELATION a inner join TBL_TAGS b on a.GID = gid;
            
end GetGameTags;
/

create or replace procedure Get3GamesRandomlyWithoutTags(
       o5_cursor out sys_refcursor
)
is
begin
       open o5_cursor for
            select * from TBL_GAMES where rownum <='3' order by dbms_random.random();
                        
end Get3GamesRandomlyWithoutTags;
/

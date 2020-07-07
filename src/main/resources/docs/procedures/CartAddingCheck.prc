create or replace procedure CartAddingCheck(
       ggid in int, 
       uid in int,
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select * from TBL_USER_GAME_RELATION where USERID = uid and GID = ggid and (STATUS=1 or STATUS=2 or STATUS=3);


end CartAddingCheck;
/

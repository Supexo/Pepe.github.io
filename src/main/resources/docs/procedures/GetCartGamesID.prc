create or replace procedure GetCartGamesID(
       uuid in int, 
       page in int,
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select GID from 
                 (select GID,ROWNUM rn from TBL_USER_GAME_RELATION where USERID = uuid and STATUS=3)
            where rn>=page*10-10 and rn<=page*10;

end GetCartGamesID;
/

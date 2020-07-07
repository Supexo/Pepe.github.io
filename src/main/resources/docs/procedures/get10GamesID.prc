create or replace procedure get10GamesID(O1_CURSOR OUT sys_refcursor) is
begin
  
       open o1_cursor for
            select * from TBL_GAMES where rownum<=10 order by PUBLISH_DATE desc;
            
       
       
end get10GamesID;
/

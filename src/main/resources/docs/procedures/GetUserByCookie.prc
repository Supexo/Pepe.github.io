create or replace procedure GetUserByCookie(
       ccookie in string, 
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select * from TBL_USERS where COOKIE = ccookie;

end GetUserByCookie;
/

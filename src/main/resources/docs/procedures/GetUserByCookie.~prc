create or replace procedure GetUserByCookie(
       cookie in string, 
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select * from TBL_USERS where COOKIE = cookie;

end GetUserByCookie;
/

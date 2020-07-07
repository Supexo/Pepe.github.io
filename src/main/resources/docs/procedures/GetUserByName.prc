create or replace procedure GetUserByName(
       uname in string, 
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select * from TBL_USERS where NAME = uname;
            
end GetUserByName;
/

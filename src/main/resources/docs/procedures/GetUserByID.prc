create or replace procedure GetUserByID(
       gid in int, 
       o_cursor out sys_refcursor
) 
is
begin
       open o_cursor for
            select * from TBL_USERS where UID = gid;
            
end GetUserByID;
/

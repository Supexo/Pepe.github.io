create or replace procedure AddToCart(
       ggid in int, 
       uid in int,
       o_cursor out sys_refcursor
) 
is
begin
       insert into TBL_USER_GAME_RELATION values(t_ugr_id_seq.nextval,uid,ggid,3);
       open o_cursor for
            select * from TBL_USER_GAME_RELATION where USERID = uid and GID = ggid;
            
end AddToCart;
/

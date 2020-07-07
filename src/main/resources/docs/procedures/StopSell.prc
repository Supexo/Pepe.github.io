create or replace procedure StopSell(
       ggid in int
)
is
begin
      delete from TBL_GAMES where GID = ggid;

end StopSell;
/

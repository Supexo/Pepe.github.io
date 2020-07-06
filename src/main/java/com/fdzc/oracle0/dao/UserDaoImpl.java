package com.fdzc.oracle0.dao;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.bean.UserType;
import com.fdzc.oracle0.utils.DBUtils;
import oracle.jdbc.OracleCallableStatement;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao{
    private List<User> users;
    private void setTestUser(){
        users = new ArrayList<>();
        users.add(new User(1001, UserType.DEFAULT ,"TypeAlpha","123456aa","",10000,"TypeAlpha12333"));
        users.add(new User(1002, UserType.DEFAULT ,"Komachi","123456aa","",10000,"Komachi12333"));
        users.add(new User(1003, UserType.DEFAULT ,"Kirin","123456aa","",10000,"Kirin12333"));
        users.add(new User(1004, UserType.ADMINISTER ,"G_fat","123456aa","",10000,"G_fat12333"));
    }

    @Override
    public List<Game> getUserGames(int uid) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void changePass(int uid) {

    }

    @Override
    public void banUser(int uid, int level) {

    }

    @Override
    public List<User> getUsers(int page) {
        return null;
    }

    @Override
    public User getUser(int uid) {

        CallableStatement call = null;
        ResultSet rs = null;
        User user = new User();
        Connection conn = DBUtils.getConn();

        try {
            call = conn.prepareCall("{ call GetUserByID(?,?) }");
            call.setInt(1, uid);
            call.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
            call.execute();    //执行存储过程
            rs = ((OracleCallableStatement) call).getCursor(2); //获取结果

            user.setUid(rs.getInt("UID"));

            switch (rs.getInt("TYPE")){
                case 0:
                    user.setType(UserType.DEFAULT);
                    break;
                case 1:
                    user.setType(UserType.ADMINISTER);
                    break;
                case 2:
                    user.setType(UserType.DEACTIVATED);
                    break;
                case 3:
                    user.setType(UserType.BANNED);
                    break;
            }

            user.setName(rs.getString("NAME"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setAvatar(rs.getString("AVATAR"));
            user.setBalance(rs.getInt("BALANCE"));
            user.setCookie(rs.getString("COOKIE"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;


/*        setTestUser();
        for(User u:users){
            if(uid==u.getUid()){
                return u;
            }
        }
        return null;*/
    }

    @Override
    public User getUser(String name) {

        CallableStatement call = null;
        ResultSet rs = null;
        User user = new User();
        Connection conn = DBUtils.getConn();

        try {
            call = conn.prepareCall("{ call GetUserByName(?,?) }");
            call.setString(1, name);
            call.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
            call.execute();    //执行存储过程
            rs = ((OracleCallableStatement) call).getCursor(2); //获取结果
            rs.next();
            user.setUid(rs.getInt("USERID"));
            switch (rs.getInt("TYPE")){
                case 0:
                    user.setType(UserType.DEFAULT);
                    break;
                case 1:
                    user.setType(UserType.ADMINISTER);
                    break;
                case 2:
                    user.setType(UserType.DEACTIVATED);
                    break;
                case 3:
                    user.setType(UserType.BANNED);
                    break;
            }
            user.setName(rs.getString("NAME"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setAvatar(rs.getString("AVATAR"));
            user.setBalance(rs.getInt("SURPLUS"));
            user.setCookie(rs.getString("COOKIE"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;


        /*// 设置测试用代码
        setTestUser();
        for(User u:users){
            if(name.equals(u.getName())){
                return u;
            }
        }
        return null;*/
    }

    @Override
    public User getUserByCookie(String cookie) {

        CallableStatement call = null;
        ResultSet rs = null;
        User user = new User();
        Connection conn = DBUtils.getConn();

        try {
            call = conn.prepareCall("{ call GetUserByCookie(?,?) }");
            call.setString(1, cookie);
            call.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);  //需要注册输出的参数
            call.execute();    //执行存储过程
            rs = ((OracleCallableStatement) call).getCursor(2); //获取结果
            rs.next();
            user.setUid(rs.getInt("USERID"));
            switch (rs.getInt("TYPE")){
                case 0:
                    user.setType(UserType.DEFAULT);
                    break;
                case 1:
                    user.setType(UserType.ADMINISTER);
                    break;
                case 2:
                    user.setType(UserType.DEACTIVATED);
                    break;
                case 3:
                    user.setType(UserType.BANNED);
                    break;
            }
            user.setName(rs.getString("NAME"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setAvatar(rs.getString("AVATAR"));
            user.setBalance(rs.getInt("SURPLUS"));
            user.setCookie(rs.getString("COOKIE"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

/*        setTestUser();
        for (User u:users){
            if(cookie.equals(u.getCookie())){
                return u;
            }
        }
        return null;*/
    }

    @Override
    public void setBalance(int uid) {

    }
}

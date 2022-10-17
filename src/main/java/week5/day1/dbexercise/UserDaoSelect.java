package week5.day1.dbexercise;

import week5.day1.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDaoSelect {

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection conn = new ConnectionMaker().makeConnection();

        PreparedStatement pstmt = conn.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
        pstmt.setString(1,id);

        ResultSet rs = pstmt.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"),rs.getString("name"),rs.getString("password"));

        rs.close();
        pstmt.close();
        conn.close();
        return user;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDaoSelect userDaoSelect = new UserDaoSelect();
        User user = userDaoSelect.get("1");
        System.out.println(user.getName());
    }
}

package week5.day1.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class UserDaoInsert {

    public void add() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id,name,password) VALUES(?,?,?)");
        ps.setString(1,"1");
        ps.setString(2,"Jiyoung");
        ps.setString(3,"1234");

        int status = ps.executeUpdate();
        System.out.println(status);
        ps.close();
        conn.close();
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDaoInsert userDaoInsert = new UserDaoInsert();
        userDaoInsert.add();
    }
}

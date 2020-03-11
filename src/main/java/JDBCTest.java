import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/ckf48?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        String driverName = "com.mysql.cj.jdbc.Driver";
        String sql = "select * from school.s_student_homework";
        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, "root", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next())
                System.out.println(resultSet.getInt(1));

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

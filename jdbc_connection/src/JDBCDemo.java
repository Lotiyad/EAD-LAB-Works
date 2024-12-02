import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/Studentsdb";
            String username = "root"; 
            String password = "loti@12345"; 
            
            Class.forName(driver);
            DriverManager.getConnection(url, username, password);
            System.out.println("Established Connection");
        } catch (Exception e) {
            e.printStackTrace(); // TODO: handle exception
        }
    }
}

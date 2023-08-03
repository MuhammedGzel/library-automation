
package Formlar;
import java.sql.Connection;
import java.sql.*;

public class DbHelper {
    static String username="root";
    static String password="14531453Mali.";
    static String DbUrl="jdbc:mysql://localhost:3306/kutuphane";
    public  Connection getConnection() throws SQLException {
    return (Connection) DriverManager.getConnection(DbUrl,username,password);  
    }
    public void ShowError(SQLException e){
        System.out.println("Hata: "+e.getMessage());
        System.out.println("Hata Kodu: "+e.getErrorCode());
    }
    }

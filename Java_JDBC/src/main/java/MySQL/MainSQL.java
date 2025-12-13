package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainSQL {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            String url = "jdbc:mysql://localhost:3306/library_db?serverTimezone=UTC";
            String user = "root";
            String password = "1234";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        } finally{
            try{
                if(connection != null){
                    connection.close();
                }
            } catch(SQLException sqlException){
                System.out.println(sqlException.getMessage());
            }
        }
    }
}

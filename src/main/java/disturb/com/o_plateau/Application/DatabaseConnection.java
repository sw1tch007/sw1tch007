package disturb.com.o_plateau.Application;

import java.sql.*;
public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            connection = initConnection();
        }
        return connection;
    }
    private static Connection initConnection()
    {
        String dbName ="testCon";
        String username = "root";
        String password = "";
        Connection initConn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            initConn = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,username,password);

        } catch (SQLException e) {
            throw new RuntimeException("Connexion impossible, Verifier votre Serveur Mysql", e);
        }
        catch(ClassNotFoundException e) {
            System.out.println("null");
        }
        return initConn;
    }
}



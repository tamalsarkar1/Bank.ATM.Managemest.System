package bank.management.system;

import java.sql.*;

public class Connections {
    public PreparedStatement s;
    Connection connection;
    Statement statement;
    public Connections(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingsystem","root","2024");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

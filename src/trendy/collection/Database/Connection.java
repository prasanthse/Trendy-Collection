package trendy.collection.Database;

import java.sql.*;

public class Connection {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    Class.forName("com.mysql.jdbc.Driver");  
    connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendycollection","root","");   
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from emp");   
}

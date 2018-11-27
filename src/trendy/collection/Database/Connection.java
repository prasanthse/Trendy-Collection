package trendy.collection.Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public Connection(){
        try {
            makeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection(Connection connect, Statement statement, PreparedStatement preparedStatement, ResultSet resultSet){
        this.connect = connect;
        this.statement = statement;
        this.preparedStatement = preparedStatement;
        this.resultSet = resultSet;
    }
    
    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    public void makeConnection() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConnect((Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/trendycollection","root","")); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

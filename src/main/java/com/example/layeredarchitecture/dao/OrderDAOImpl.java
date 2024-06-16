package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public class OrderDAOImpl implements OrderDAO {
    public Connection getConnection(Connection connection) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getDbConnection().getConnection();
        return connection;
    }
    public ResultSet generateOrderId() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");
        return rst;
    }
    public PreparedStatement getOrder(Connection connection,String orderId) throws SQLException, ClassNotFoundException {


        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);
        return stm;
    }
    public PreparedStatement insertOrder(Connection connection, PreparedStatement stm, String orderId, LocalDate orderDate, String customerId) throws SQLException {
        stm = connection.prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, orderId);
        stm.setDate(2, Date.valueOf(orderDate));
        stm.setString(3, customerId);
        return stm;
    }
}

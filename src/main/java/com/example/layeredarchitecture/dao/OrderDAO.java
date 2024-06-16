package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    public Connection getConnection(Connection connection) throws SQLException, ClassNotFoundException ;
    public ResultSet generateOrderId() throws SQLException, ClassNotFoundException ;
    public PreparedStatement getOrder(Connection connection, String orderId) throws SQLException, ClassNotFoundException ;
    public PreparedStatement insertOrder(Connection connection, PreparedStatement stm, String orderId, LocalDate orderDate, String customerId) throws SQLException ;

}

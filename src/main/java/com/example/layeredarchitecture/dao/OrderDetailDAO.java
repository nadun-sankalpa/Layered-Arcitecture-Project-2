package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface OrderDetailDAO {
    public PreparedStatement insertOrderDetailStatement(Connection connection) throws SQLException ;
    public PreparedStatement insertOrderDetails(PreparedStatement stm, OrderDetailDTO detail, String orderId) throws SQLException ;
}

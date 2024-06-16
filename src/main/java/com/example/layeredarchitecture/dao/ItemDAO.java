package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;
    public void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException ;
    public void updateItem(String code, String description, BigDecimal unitPrice,int qtyOnHand) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    public ResultSet generateId() throws SQLException, ClassNotFoundException ;

    public ResultSet getAllItemCodes() throws SQLException, ClassNotFoundException ;
    public ResultSet getItem(String code) throws SQLException, ClassNotFoundException ;
    public ResultSet findItem(String newItemCode) throws SQLException, ClassNotFoundException ;
    public PreparedStatement updateItem(Connection connection,ItemDTO item) throws SQLException ;
}

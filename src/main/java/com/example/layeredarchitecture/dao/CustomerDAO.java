package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public boolean saveCustomer(String id, String name,String address) throws SQLException, ClassNotFoundException;

    public void updateCustomer(String name,String address,String id) throws SQLException, ClassNotFoundException ;
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;
    public ResultSet generateId() throws SQLException, ClassNotFoundException ;
    public ResultSet getAllCustomerIds() throws SQLException, ClassNotFoundException ;
    public ResultSet searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;
}

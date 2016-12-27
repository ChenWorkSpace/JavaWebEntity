package com.connection.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.connection.entity.Address;
import com.connection.entity.User;
import com.sun.javafx.binding.Logging;




public interface RegisterDao {
	public void save(Connection connection,User user) throws SQLException;
	
	public void update(Connection connection,Long id,User user)throws SQLException;
	
	public void delete(Connection connection,User user)throws SQLException;
	
	public void save(Connection connection,Address address)throws SQLException;
	
	public void update(Connection connection ,Address address)throws SQLException;
}

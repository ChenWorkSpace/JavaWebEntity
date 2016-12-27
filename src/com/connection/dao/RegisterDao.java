package com.connection.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.connection.entity.User;




public interface UserDao {
	public void save(Connection connection,User user) throws SQLException;
	
	public void update(Connection connection,Long id,User user)throws SQLException;
	
	public void delete(Connection connection,User user)throws SQLException;
	
}

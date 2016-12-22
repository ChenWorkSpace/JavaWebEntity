package com.connection.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.connection.dao.UserDao;
import com.connection.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		String insertSql="insert into users(email,password,name) values(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(insertSql);
		preparedStatement.setString(1,user.getEmail());
		preparedStatement.setString(2,user.getPassword());
		preparedStatement.setString(3,user.getUser());
		preparedStatement.execute();

	}

	
	/*
	 * 根据用户id来更新数据
	  */
	@Override
	public void update(Connection connection, Long id, User user) throws SQLException {
		// TODO Auto-generated method stu
		
		
		String updateSql="update users set name=?,password=?,email=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(updateSql);
		
		preparedStatement.setString(1,user.getUser());
		preparedStatement.setString(2,user.getPassword());
		preparedStatement.setString(3,user.getEmail());
		preparedStatement.setLong(4,id);
		preparedStatement.execute();
	}

	@Override
	public void delete(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=connection.prepareStatement("delete from users where id=?");
		preparedStatement.setLong(1,user.getId());
		preparedStatement.execute();

	}

}

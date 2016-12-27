package com.connection.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.dao.RegisterDao;
import com.connection.entity.Address;
import com.connection.entity.User;

public class RegisterDaoImpl implements RegisterDao {

	@Override
	public void save(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		String insertSql="insert into users(email,password,name) select ?,?,? from dual "
				+ " where not exists(select email,name from users where email=? or name=?)";
		PreparedStatement preparedStatement=connection.prepareStatement(insertSql);
		preparedStatement.setString(1,user.getEmail());
		preparedStatement.setString(2,user.getPassword());
		preparedStatement.setString(3,user.getUser());
		preparedStatement.setString(4,user.getEmail());
		preparedStatement.setString(5,user.getUser());
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
		preparedStatement.executeUpdate();
	}

	@Override
	public void delete(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=connection.prepareStatement("delete from users where id=?");
		preparedStatement.setLong(1,user.getId());
		preparedStatement.execute();

	}


	@Override
	public void save(Connection connection, Address address) throws SQLException {
		// TODO Auto-generated method stub
		String saveSQL="insert into address(user_id,province,town,area)  values(?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(saveSQL);
		preparedStatement.setLong(1,address.getId());
		preparedStatement.setString(2,address.getProvince());
		preparedStatement.setString(3,address.getTown());
		preparedStatement.setString(4, address.getArea());
		preparedStatement.execute();
		
	}


	@Override
	public void update(Connection connection, Address address) throws SQLException {
		// TODO Auto-generated method stub
		String updateSQL="update address set province=?,town=?,area=? where user_id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(updateSQL);
		preparedStatement.setString(1, address.getProvince());
		preparedStatement.setString(2,address.getTown());
		preparedStatement.setString(3, address.getArea());
		preparedStatement.setString(4, address.getUserid());
		preparedStatement.executeUpdate();
		
		
	}
	
	
	public Long getId(Connection connection,User user)throws SQLException{
		Long id=null;
		ResultSet resultSet=null;
		String IdSQL="select id from users where email=? and name=?";
		PreparedStatement preparedStatement=connection.prepareStatement(IdSQL);
		preparedStatement.setString(1,user.getEmail());
		preparedStatement.setString(2, user.getUser());
		resultSet=preparedStatement.executeQuery();
		if(!resultSet.next()){
			id=(long) -1;
		}else{
			id=(long)resultSet.getInt("id");
		}
		
		
		return id;
		
	}

}

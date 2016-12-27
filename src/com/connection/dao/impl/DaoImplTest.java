package com.connection.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.connection.entity.Address;
import com.connection.entity.User;
import com.connection.jdbc.TransationFactroy;

public class DaoImplTest {

	private static Connection connection;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long idLong=null;
	RegisterDaoImpl daoImpl=new RegisterDaoImpl();
	 connection= TransationFactroy.getInstance().getConnection();
	 try {
		connection.setAutoCommit(false);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 User user=new User();
	 Address address=new Address();
	 user.setEmail("1494518303@qq.com");
	 user.setPassword("123446");
	 user.setUser("1494518303@qq.com");
	 
	 try {
		idLong=daoImpl.getId(connection, user);
		if(idLong==-1){
			System.out.println("���û��Ѵ��ڣ������ע������");
		}
		else{
			daoImpl.save(connection, user);
			address.setId(idLong);
			System.out.println(idLong);
			daoImpl.save(connection, address);
			connection.commit();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		try {
			connection.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	 System.out.println("Hello World");
	 System.out.println("��� ���磡  ");
	 	}
	

}

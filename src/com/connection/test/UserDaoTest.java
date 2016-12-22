package com.connection.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.connection.dao.UserDao;
import com.connection.dao.impl.UserDaoImpl;
import com.connection.entity.User;
import com.connection.jdbc.TransationFactroy;

public class UserDaoTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Connection connection=TransationFactroy.getInstance().getConnection();
		UserDaoImpl dao=new UserDaoImpl();
		connection.setAutoCommit(false);
		User user=new User();
		user.setUser("chen");
		user.setEmail("149@qq.com");
		user.setPassword("1232445");
		
		dao.save(connection,user);
		
		/*connection.commit();*/
		try {
			connection.rollback();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}

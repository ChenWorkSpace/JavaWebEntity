package com.connection.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.jdbc.Driver;


public class TransationFactroy {

	
	private static String Driver;
	private static String user;
	private static String dburl;
	private static String password;
	private static Connection connection;
	private static final TransationFactroy TRANSATION_FACTROY=new TransationFactroy();
	
	static{
		Properties properties=new Properties();
		InputStream inputStream=TransationFactroy.class.getClassLoader()
				.getResourceAsStream("dbconfig.properties");
		
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("============≈‰÷√Œƒº˛∂¡»° ß∞‹=================");
			e.printStackTrace();
		}
		Driver=properties.getProperty("driver");
		user=properties.getProperty("user");
		dburl=properties.getProperty("dburl");
		password=properties.getProperty("password");
		
	}
	
	
	public TransationFactroy() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static TransationFactroy getInstance(){
		return TRANSATION_FACTROY;
	}
	
	
	public Connection getConnection(){
		try {
			Class.forName(Driver); 
			connection=DriverManager.getConnection(dburl,user,password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return connection;
	}
}

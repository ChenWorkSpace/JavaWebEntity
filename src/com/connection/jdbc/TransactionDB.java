package com.connection.jdbc;

import java.awt.print.Printable;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.directory.DirContext;


import com.mysql.jdbc.Statement;
import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.security.jca.GetInstance;

public class TransactionDB {

	
	private static String driver;
    private static String dburl;
    private static String user;
    private static String password;
    private static final TransactionDB db=new TransactionDB();
    private static Connection connection;
		
	
    static{
    	Properties pro=new Properties();
    	try {
			InputStream inputStream=TransactionDB.class.getClassLoader().
					getResourceAsStream("dbconfig.properties");
			pro.load(inputStream);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("===========配置文件读取错误=============");
		
		}
    	driver=pro.getProperty("driver");
    	dburl=pro.getProperty("dburl");
    	user=pro.getProperty("user");
    	password=pro.getProperty("password");
    	
    }
    
    public TransactionDB() {
		// TODO Auto-generated constructor stub
	}
	
    public static TransactionDB getInstance() {
    	
		return db;
	}
    
    public Connection makConnection(){
    	try {
			Class.forName(driver);
			connection=DriverManager.getConnection(dburl,user,password);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("===========出现异常===========");
			e.printStackTrace();
		}
    	return connection;
    }
}

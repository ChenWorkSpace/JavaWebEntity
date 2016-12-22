package com.connection.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.connection.jdbc.TransactionDB;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		TransactionDB transactionDB=TransactionDB.getInstance();
		Connection connection=transactionDB.makConnection();
		System.out.println(connection.getAutoCommit());
		System.out.println("Success!");
}
	
}

package com.untility.bean;

import java.io.Serializable;

public class login_bean implements Serializable {
	
	private String username;
	private String password;
	public login_bean() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}

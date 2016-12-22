package com.connection.entity;

public class User extends idEntity {
	
	 private String user;
	 private String password;
	 private String email;
	 
	 
	 
	@Override
	public String toString() {
		return "user [user=" + user + ", password=" + password + ", email=" + email + ", id=" + id + "]";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
	 

}

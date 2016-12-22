package com.untility.bean;

import java.io.Serializable;

/**
 * @author chen1
 *
 */
public class register_bean implements Serializable {
	
	private String username;//×¢²áÓÃ»§Ãû<Ä¬ÈÏ=×¢²áÓÊÏä>
	private String password;//×¢²áÃÜÂë
	private String email;//×¢²áÓÊÏä
	private String province;//Ê¡
	private String town;//ÊĞ
	private String area;//Çø
	
	
	public register_bean() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}

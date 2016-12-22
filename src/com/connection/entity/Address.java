package com.connection.entity;

public class Address extends idEntity {
	
	private String province;//Ê¡
	private String town;//ÊÐ
	private String area;//Çø
	private String userid;
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Address [province=" + province + ", town=" + town + ", area=" + area + ", userid=" + userid + ", id="
				+ id + "]";
	}
	
	
	
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 	
    private String username;//注册用户名<默认=注册邮箱>
	private String password;//注册密码
	private String email;//注册邮箱
	private String province;//省
	private String town;//市
	private String area;//区
	 -->
<jsp:useBean id="Register"  class="com.untility.bean.register_bean"></jsp:useBean>
 <jsp:setProperty property="username" name="Register" param="register_email"/>
<jsp:setProperty property="password" name="Register" param="register_password"/>
<jsp:setProperty property="email" name="Register" param="register_email"/>
<jsp:setProperty property="province" name="Register"  param="register_province"/>
<jsp:setProperty property="town" name="Register"  param="register_town"/>
<jsp:setProperty property="area" name="Register"  param="register_area"/>

注册成功：

用户名：<%=Register.getEmail() %><br/>
邮箱：<%=Register.getEmail() %><br/>
密码：<%=Register.getPassword() %><br/>
所在省（市）：<%=Register.getProvince() %><br/>
       市：<%=Register.getTown() %><br/>
       区：<%=Register.getArea() %><br/> 
</body>
</html>
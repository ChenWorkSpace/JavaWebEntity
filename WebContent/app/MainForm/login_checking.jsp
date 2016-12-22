<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Login" class="com.untility.bean.login_bean"></jsp:useBean>
<jsp:setProperty property="username" name="Login" param="register_email"/>
<jsp:setProperty property="password" name="Login" param="register_password"/>



username:<jsp:getProperty property="username" name="Login"/>
password:<jsp:getProperty property="password" name="Login"/>

</body>
</html>
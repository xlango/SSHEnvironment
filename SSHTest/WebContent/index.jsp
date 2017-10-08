<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
</head>
<body>
<h1>请输入您的账号和密码</h1>
 <div align="center">
    <s:form  method="post" action="login" namespace="/">
      <s:textfield name="username" size="20" label="用户名"/>
      <s:password name="password" size="20" label="密码"/>
      <s:submit value="提交"/>
    </s:form>
  </div>
   <a href="addUser.jsp">注册</a> <a href="gerPassword.jsp">找回密码</a>
</body>
</html>
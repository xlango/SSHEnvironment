<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
    <s:form  method="post" action="add" namespace="/">
      <s:textfield name="username" size="20" label="用户名"/>
      <s:password name="password" size="20" label="密码"/>
      <s:textfield name="phone" size="20" label="电话"/>
      <s:textfield name="email" size="20" label="邮箱"/>
      <s:textfield name="adress" size="20" label="地址"/>   
      <s:submit value="提交"/>
    </s:form>
  </div>
</body>
</html>
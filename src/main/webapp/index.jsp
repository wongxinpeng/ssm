<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<h1>这是首页！！！</h1>
	<form action="user/add" method="post">
		用户名称：<input name="userName"/><br/>
		用户年龄：<input name="userAge"/><br/>
		用户生日：<input name="userBirthday" type="datetime"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>
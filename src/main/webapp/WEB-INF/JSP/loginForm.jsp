<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>Login To Your Account</h1>
 <form action="${pageContext.request.contextPath}/login" method="post"> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css"> 
  <div><label>USERNAME: <input type="text" name="username" /></label></div>
  <div><label>PASSWORD: <input type="password" name="password" /></label></div>
  <button type="submit">Login</button>
  

</form>
</body>
</html>
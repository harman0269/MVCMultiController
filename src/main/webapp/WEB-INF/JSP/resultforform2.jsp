<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result for form 2</title>
</head>
<body>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css"> 
<h1>YOUR DETAILS</h1>
<p>USERNAME:${kuser.username}</p>
<p>PASSWORD:${kuser.password}</p>
<p>EMAIL:${kuser.mail}</p>
<p>DATE OF BIRTH:${kuser.dateOfBirth}</p> 
<p>EXPERIENCE:${kuser.experience}</p>
<p>ID:${kuser.id }</p>
</body>
</html>
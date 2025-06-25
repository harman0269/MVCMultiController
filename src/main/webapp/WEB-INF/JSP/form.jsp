<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/submitForm" method="post"> 
    <label>Username:
        <input type="text" name="userName">
    </label><br>

    <label>Email:
        <input type="email" name="email">
    </label><br>

    <button type="submit">Submit</button>
</form>

</body>
</html>

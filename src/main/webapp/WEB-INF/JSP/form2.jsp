<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formm</title>
<style>
div {
    margin-bottom: 15px;
}
body {
    color: yellow;
    margin: 20px;
    background-color: black;
}
#forum {
    text-align: center;
    border: 1px solid yellow;
    border-radius: 4px;
    padding: 20px;
    width: 35%;
    margin: 200px auto;
}
</style>
</head>
<body>

<!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css"> -->

<div id="forum">
    <div>
        <img alt="No image found" src="${pageContext.request.contextPath}/resources/image/360_F_206046054_B8YrFuOlIv93L1znF8bM8kmkEksNdpDf.jpg" />
    </div>
    <form action="${pageContext.request.contextPath}/submitformm" method="post">
        <div><label>USERNAME: <input type="text" name="username" /></label></div>
        <div><label>PASSWORD: <input type="password" name="password" /></label></div>
        <div><label>EMAIL: <input type="email" name="mail" /></label></div>
        <div><label>DATE OF BIRTH: <input type="date" name="dateOfBirth" /></label></div>
        <div><label>EXPERIENCE: <input type="number" name="experience" /></label></div>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>

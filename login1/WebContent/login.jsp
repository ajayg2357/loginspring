<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
<form:form action="checkLogin.obj" modelAttribute="login" method="post">
User Name: <form:input path="userName"/><br>
Password: <form:input path="password"/><br>
<input type="submit" value="Login">

</form:form>

</body>
</html>
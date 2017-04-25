<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>

    <sf:form method="POST" commandName="spitter">
        First name: <sf:input path="firstName"/><br/>
        Last name: <sf:input path="lastName"/><br/>
        Username: <sf:input path="email"/><br/>
        Password: <sf:password path="password"/><br/>
        <input type="submit" value="Register"/>
    </sf:form>
</body>
</html>

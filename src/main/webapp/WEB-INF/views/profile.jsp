<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <h1>Your profile</h1>
    <c:out value="${spitter.username}}"/><br/>
    <c:out value="${spitter.firstName}}"/> <c:out value="${spitter.lastName}}"/>
</body>
</html>

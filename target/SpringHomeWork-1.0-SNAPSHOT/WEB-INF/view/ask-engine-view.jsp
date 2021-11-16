<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: oalikin88
  Date: 008
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Выберите тип двигателя</title>
</head>
<body>
<form:form method="GET" action="showInfo">
    Запрос <form:input path="engine"/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>

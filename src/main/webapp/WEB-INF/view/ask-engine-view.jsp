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
<h2>petrol or diesel?</h2>
<br>
<form:form method="GET" action="showinfo" >
    Запрос <input type="text" name="type"/>
    <input type="submit" value="Отправить">
</form:form>
</body>
</html>

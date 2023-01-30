<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New vehicle</title>
</head>
<body>
<form:form action="add-new-vehicle" method="post" modelAttribute="newVehicle">
    Type: <form:input path="type"/>
    <br>
    Status: <form:input path="status"/>
    <br>
    Color: <form:input path="color"/>
    <br>
    CoordinateX: <form:input path="coordinateX"/>
    <br>
    CoordinateY: <form:input path="coordinateY"/>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Vehicles</title>
    <style>
        table {
            border: 1px solid grey;
            border-collapse: collapse;
            padding: 3px;
        }
        tr {
            border: 1px solid grey;
            border-collapse: collapse;
            padding: 3px;
            text-align: center;
        }
        td {
            border: 1px solid grey;
            border-collapse: collapse;
            padding: 3px;
            text-align: center;
        }
        th {
            border-collapse: collapse;
            border: 1px solid grey;
            padding: 3px;
            text-align: center;
        }
    </style>
</head>

<body>
<h2>All vehicles</h2>

<table>

    <tr>
        <th>id</th>
        <th>coordinates</th>
        <th>reserve</th>
        <th>type</th>
        <th>color</th>
        <th>status</th>
        <th>purchase date</th>
        <th>actions</th>
    </tr>
    <c:forEach var="item" items="${vehicleList}">

        <c:url var="updateButton" value="/update-vehicle">
            <c:param name="vehicleId" value="${item.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/delete-vehicle">
            <c:param name="vehicleId" value="${item.id}"/>
        </c:url>

        <tr>

            <td>${item.id}</td>
            <td>${item.coordinateX}, ${item.coordinateY}</td>
            <td>${item.reserve}</td>
            <td>${item.type}</td>
            <td>${item.color}</td>
            <td>${item.status}</td>
            <td>${item.purchaseDate}</td>
            <td>
                <input value="Update" type="button" onclick="window.location.href='${updateButton}'">
                <input value="Delete" type="button" onclick="window.location.href='${deleteButton}'">
            </td>

        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add" onclick="window.location.href='get-form'">
</body>
</html>

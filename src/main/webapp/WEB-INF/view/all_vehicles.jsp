<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    </tr>
    <c:forEach var="item" items="${vehicleList}">
        <tr>
            <td>${item.id}</td>
            <td>${item.coordinateX}, ${item.coordinateY}</td>
            <td>${item.reserve}</td>
            <td>${item.type}</td>
            <td>${item.color}</td>
            <td>${item.status}</td>
            <td>${item.purchaseDate}</td>
        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add" onclick="window.location.href='get-form'">
</body>
</html>

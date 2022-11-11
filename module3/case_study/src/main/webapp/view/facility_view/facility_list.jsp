<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/6/2022
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Facility</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<a href="/facility?action=add"> ADD NEW FACILITY</a>

<a href="/index.jsp">Quay lại trang chính</a>

<table  class="table table-success table-striped">
    <tr>
        <th scope="col">ID</th>
        <th scope="col">NAME</th>
        <th scope="col">AREA</th>
        <th scope="col">COST</th>
        <th scope="col">Max PEOPLE</th>
        <th scope="col">RENT TYPE ID</th>
        <th scope="col">FACILITY TYPE</th>
        <th scope="col">STANDARD ROOM</th>
        <th scope="col">DESCRIPTION OTHER CONVENIENCE</th>
        <th scope="col">POOL AREA</th>
        <th scope="col">NUMBER OF FLOORS</th>
        <th scope="col">FACILITY FREE</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    <c:forEach var="facility" items="${facilityList}">
        <tr>
            <td><c:out value="${facility.id}"/></td>
            <td><c:out value="${facility.name}"/></td>
            <td><c:out value="${facility.area}"/></td>
            <td><c:out value="${facility.cost}"/></td>
            <td><c:out value="${facility.maxPeople}"/></td>
            <td><c:out value="${facility.rentTypeId}"/></td>
            <td><c:out value="${facility.facilityTypeId}"/></td>
            <td><c:out value="${facility.standardRoom}"/></td>
            <td><c:out value="${facility.descriptinonOtherConvenience}"/></td>
            <td><c:out value="${facility.poolArea}"/></td>
            <td><c:out value="${facility.numberOfFloors}"/></td>
            <td><c:out value="${facility.facilityFree}"/></td>
            <td>
                <a href="/users?action=edit&id=${user.id}">Edit</a>
                <a href="/users?action=delete&id=${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>

</body>
</html>

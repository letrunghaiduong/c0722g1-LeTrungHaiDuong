<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/6/2022
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<a href="/employee?action=add" class="btn btn-primary">Add New Employee</a>
<a href="/index.jsp" class="btn btn-primary">Quay lại trang chính</a>

<table class="table table-success table-striped">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Date of birth</th>
        <th scope="col">ID Card</th>
        <th scope="col">Salary</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Position Name</th>
        <th scope="col">Education Degree Name</th>
        <th scope="col">Division Name</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employeeList}" varStatus="status">
        <tr>
            <td><c:out value="${status.count}"/></td>
            <td><c:out value="${employee.name}"/></td>
            <td><c:out value="${employee.dateOfBirth}"/></td>
            <td><c:out value="${employee.idCard}"/></td>
            <td><c:out value="${employee.salary}"/></td>
            <td><c:out value="${employee.phoneNumber}"/></td>
            <td><c:out value="${employee.email}"/></td>
            <td><c:out value="${employee.address}"/></td>
            <td><c:out value="${employee.position.positionName}"/></td>
            <td><c:out value="${employee.educationDegree.educationDegreeName}"/></td>
            <td><c:out value="${employee.division.divisionName}"/></td>
            <td>
                <a href="/employee?action=edit&id=${employee.getId()}" class="btn btn-primary">EDIT</a>
                <button type="button" class="btn btn-primary">
                    DELETE
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/6/2022
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<h2><a href="/customer?action=add">Add New Customer</a></h2>
<a href="/index.jsp">Quay lại trang chính</a>
<table  class="table table-success table-striped">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">CUSTOMER TYPE ID</th>
        <th scope="col">NAME</th>
        <th scope="col">DATE OF BIRTH</th>
        <th scope="col">GENDER</th>
        <th scope="col">ID CARD</th>
        <th scope="col">PHONE NUMBER</th>
        <th scope="col">EMAIL</th>
        <th scope="col">ADDRESS</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    <c:forEach var="customer" items="${customerList}" varStatus="satus">
    <tr>
        <td><c:out value="${satus.count}"/></td>
        <td><c:out value="${customer.customerTypeId}"/></td>
        <td><c:out value="${customer.name}"/></td>
        <td><c:out value="${customer.dateOfBirth}"/></td>
        <td><c:out value="${customer.gender}"/></td>
        <td><c:out value="${customer.idCard}"/></td>
        <td><c:out value="${customer.phoneNumber}"/></td>
        <td><c:out value="${customer.email}"/></td>
        <td><c:out value="${customer.address}"/></td>
        <td>
            <a href="/customers?action=edit&id=${customer.id}">Edit</a>
            <a href="/customers?action=delete&id=${customer.id}">Delete</a>
        </td>
    </tr>
    </c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>
</body>
</html>

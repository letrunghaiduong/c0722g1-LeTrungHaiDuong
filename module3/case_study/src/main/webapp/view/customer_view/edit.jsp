<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/9/2022
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<h1>Customer Management</h1>
<h2><a href="/customer">Back List</a></h2>
<h2>
    <c:if test="${mess != null}">
        <span style="color: darkred">${mess}</span>
    </c:if>
</h2>
<form class="col-md-2" method="post">
    <label class="form-label">Id<input type="text" class="form-control" placeholder="Id" name="id" value="${customer.getId()}"></label>
    <label class="form-label">Name <input type="text" class="form-control" placeholder="Name Customer" name="name" value="${customer.getName()}"></label>
    <label class="form-label">Date of Birth<input type="date" class="form-control" name="dateOfBirth" value="${customer.getBirthday()}"></label>
    <label class="form-label">Customer Type
        <select name="customerTypeId" id="" class="form-select">
            <option>Customer Type</option>
            <option value="1">Diamond</option>
            <option value="2">Platinium</option>
            <option value="3">Gold</option>
            <option value="4">Silver</option>
            <option value="5">Member</option>
        </select>
    </label>
    <label class="form-label">ID Card<input type="text" class="form-control" placeholder="ID Card" name="idCard" value="${customer.getIdCard()}"></label>
    <label class="form-label">Phone Number<input type="text" class="form-control" placeholder="Phone Number" name="phoneNumber" value="${customer.getPhoneNumber()}"></label>
    <label class="form-label">Address<input type="text" class="form-control" placeholder="Address" name="address" value="${customer.getAddress()}"></label>
    <label class="form-label">Email<input type="email" class="form-control" placeholder="Email" name="email" value="${customer.getEmail()}"></label>
    <label class="form-label">Gender
        <br>
        <label class="form-check-label"><input type="radio" class="form-check-input" name="gender" value="Male">Male</label>
        <label class="form-check-label"><input type="radio" class="form-check-input" name="gender" value="Female">Female</label>
        <label class="form-check-label"><input type="radio" class="form-check-input" name="gender" value="Other">Other</label>
    </label>
    <div class="col-md-3">
        <br>
        <button class="btn btn-primary form-control">Add</button>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>

</body>
</html>

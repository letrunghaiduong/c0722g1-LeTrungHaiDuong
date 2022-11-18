<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/9/2022
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<a href="/customer" class="btn btn-primary">Back List Customer</a>
<h2><c:if test="${mess != null}">
    <span style="color: darkred">${mess}</span>
</c:if></h2>
<form class="col-md-2" action="/customer?action=save" method="post">
    <label class="form-label">Name <input type="text" class="form-control" placeholder="Name Customer" name="name" required pattern="[A-Za-z]+ "></label>
    <label class="form-label">Date of Birth<input type="date" class="form-control" name="dateOfBirth" required></label>
    <label class="form-label">Customer Type
        <select name="customerType" id="" class="form-select" required>
            <option>Customer Type</option>
            <c:forEach var="customerType" items="${customerTypeList}">
                <option value="${customerType.customerTypeId}">${customerType.customerTypeName}</option>
            </c:forEach>
    </select>
    </label>
    <label class="form-label">ID Card<input type="text" class="form-control" placeholder="ID Card" name="idCard" required></label>
    <label class="form-label">Phone Number<input type="text" class="form-control" placeholder="Phone Number" name="phoneNumber" required></label>
    <label class="form-label">Address<input type="text" class="form-control" placeholder="Address" name="address" required></label>
    <label class="form-label">Email<input type="email" class="form-control" placeholder="Email" name="email" required></label>
    <label class="form-label" required>Gender
        <br>
        <label class="form-check-label"><input type="radio" class="form-check-input" name="gender" value=true>Male</label>
        <label class="form-check-label"><input type="radio" class="form-check-input" name="gender" value=false>Female</label>
    </label>
    <div class="col-md-3">
        <br>
        <input type="submit" value="ADD">
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/6/2022
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Contract</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<button type="button" class="btn btn-info " data-bs-toggle="modal" data-bs-target="#exampleModal">
    Add New Cpntract
</button>
<a href="/index.jsp">Quay lại trang chính</a>

<table  class="table table-success table-striped">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">STAR DATE</th>
        <th scope="col">END DATE</th>
        <th scope="col">DIPOSIT</th>
        <th scope="col">EMPLOYEE ID</th>
        <th scope="col">CUSTOMER ID</th>
        <th scope="col">FACILITY ID</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>1990-02-27</td>
        <td>1990-02-27</td>
        <td>0</td>
        <td>3</td>
        <td>1</td>
        <td>1</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>
    <tr>
        <th scope="row">1</th>
        <td>1990-02-27</td>
        <td>1990-02-27</td>
        <td>0</td>
        <td>3</td>
        <td>1</td>
        <td>1</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>
    <tr>
        <th scope="row">1</th>
        <td>1990-02-27</td>
        <td>1990-02-27</td>
        <td>0</td>
        <td>3</td>
        <td>1</td>
        <td>1</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>

    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>
</body>
</html>

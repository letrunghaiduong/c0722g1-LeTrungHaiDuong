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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<button type="button" class="btn btn-info " data-bs-toggle="modal" data-bs-target="#exampleModal">
    Add New Employee
</button>
<a href="/index.jsp">Quay lại trang chính</a>

<div  class="container-fluid vh-100">
    <div style="height: 10% ;text-align: center;color: #0d6056;width: 100%" class="row">
        <table  class="table table-success table-striped">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">NAME</th>
                <th scope="col">Date of birth</th>
                <th scope="col">ID Card</th>
                <th scope="col">Salary</th>
                <th scope="col">Phone Number</th>
                <th scope="col">Email</th>
                <th scope="col">Address</th>
                <th scope="col">Position id</th>
                <th scope="col">Education degree id</th>
                <th scope="col">Division id</th>
                <th scope="col">User name</th>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Nguyễn Văn An</td>
                <td>1970-11-07</td>
                <td>456231786</td>
                <td>10000000</td>
                <td>0901234121</td>
                <td>annguyen@gmail.com</td>
                <td>295 Nguyễn Tất Thành, Đà Nẵng</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>ABC</td>
                <td>
                    <button type="button" class="btn btn-secondary btn-sm">Delete</button>
                </td>
                <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Nguyễn Văn An</td>
                <td>1970-11-07</td>
                <td>456231786</td>
                <td>10000000</td>
                <td>0901234121</td>
                <td>annguyen@gmail.com</td>
                <td>295 Nguyễn Tất Thành, Đà Nẵng</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>ABC</td>
                <td>
                    <button type="button" class="btn btn-secondary btn-sm">Delete</button>
                </td>
                <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>
</body>
</html>

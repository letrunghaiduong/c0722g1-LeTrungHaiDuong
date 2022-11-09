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
<button type="button" class="btn btn-info " data-bs-toggle="modal" data-bs-target="#exampleModal">
    Add New Service
</button>
<a href="/index.jsp">Quay lại trang chính</a>

<table  class="table table-success table-striped">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">NAME</th>
        <th scope="col">AREA</th>
        <th scope="col">COST</th>
        <th scope="col">Max PEOPLE</th>
        <th scope="col">RENT TYPE</th>
        <th scope="col">FACILITY TYPE</th>
        <th scope="col">STANDARD ROOM</th>
        <th scope="col">DESCRIPTION OTHER CONVENIENCE</th>
        <th scope="col">POOL AREA</th>
        <th scope="col">NUMBER OF FLOORS</th>
        <th scope="col">FACILITY FREE</th>
        <th scope="col">DELETE</th>
        <th scope="col">EDIT</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Villa Beach Front</td>
        <td>25000</td>
        <td>1000000</td>
        <td>10</td>
        <td>3</td>
        <td>1</td>
        <td>vip</td>
        <td>Có hồ bơi</td>
        <td>500</td>
        <td>4</td>
        <td>1 Xe máy, 1 Xe đạp</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>

    <tr>
        <th scope="row">2</th>
        <td>House Princess 01</td>
        <td>15000</td>
        <td>5000000</td>
        <td>10</td>
        <td>3</td>
        <td>1</td>
        <td>vip</td>
        <td>Có thêm bếp nướng</td>
        <td>null</td>
        <td>3</td>
        <td>null</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>

    <tr>
        <th scope="row">3</th>
        <td>Villa Beach Front</td>
        <td>25000</td>
        <td>1000000</td>
        <td>10</td>
        <td>3</td>
        <td>1</td>
        <td>vip</td>
        <td>Có hồ bơi</td>
        <td>500</td>
        <td>4</td>
        <td>null</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>

    <tr>
        <th scope="row">4</th>
        <td>Villa Beach Front</td>
        <td>25000</td>
        <td>1000000</td>
        <td>10</td>
        <td>3</td>
        <td>1</td>
        <td>vip</td>
        <td>Có hồ bơi</td>
        <td>500</td>
        <td>4</td>
        <td>null</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>

    <tr>
        <th scope="row">5</th>
        <td>Villa Beach Front</td>
        <td>25000</td>
        <td>1000000</td>
        <td>10</td>
        <td>3</td>
        <td>1</td>
        <td>vip</td>
        <td>Có hồ bơi</td>
        <td>500</td>
        <td>4</td>
        <td>null</td>
        <td><button type="button" class="btn btn-secondary  btn-sm">Delete</button></td>
        <td><button type="button" class="btn btn-danger btn-sm">Edit</button></td>
    </tr>
    </tbody>
</table>
<script src="../../bootstrap-5.0.2-dist/js/bootstrap.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>

</body>
</html>

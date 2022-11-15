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
    <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css"/>
    <script src="jquery/jquery-3.5.1.min.js"></script>
    <script src="datatables/js/jquery.dataTables.min.js"></script>
    <script src="datatables/js/dataTables.bootstrap5.min.js"></script>

</head>
<body>
<a href="/index.jsp" class="btn btn-primary">Quay lại trang chính</a>
<br>
<a href="/customer?action=add" class="btn btn-primary">Add New Customer</a>
<form action="/customer?action=search" method="post" class="float-end">
    <input type="text" placeholder="Search" name="keySearch">
    <button class="btn btn-primary">
        Search
    </button>
</form>
<div>

<table  class="table table-success table-striped" id="tableCustomer" style="width: 100%">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">CUSTOMER TYPE</th>
        <th scope="col">NAME</th>
        <th scope="col">DATE OF BIRTH</th>
        <th scope="col">GENDER</th>
        <th scope="col">ID CARD</th>
        <th scope="col">PHONE NUMBER</th>
        <th scope="col">EMAIL</th>
        <th scope="col">ADDRESS</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}" varStatus="satus">
    <tr>
        <td><c:out value="${satus.count}"/></td>
        <td><c:out value="${customer.customerType.customerTypeName}"/></td>
        <td><c:out value="${customer.name}"/></td>
        <td><c:out value="${customer.dateOfBirth}"/></td>
        <td><c:if test="${customer.gender == 1}">Nam</c:if>
            <c:if test="${customer.gender == 0}">Nữ</c:if>
        </td>
        <td><c:out value="${customer.idCard}"/></td>
        <td><c:out value="${customer.phoneNumber}"/></td>
        <td><c:out value="${customer.email}"/></td>
        <td><c:out value="${customer.address}"/></td>
        <td>
            <a href="/customer?action=edit&id=${customer.getId()}" class="btn btn-primary">EDIT</a>
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="modalDelete('${customer.id}','${customer.name}')">
                DELETE
            </button>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal delete</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <span>Bạn có muốn xóa: </span>
                <span id="deleteName"></span>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <form  method="get" action="/customer">
                    <input type="text" name="action" value="delete" hidden>
                    <input type="text" hidden id="deleteId" name="deleteId">
                    <input type="submit" class="btn btn-primary" value="DELETE">
                </form>

            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>
<script>
    function modalDelete(id,name) {
        document.getElementById("deleteName").innerText=name;
        document.getElementById("deleteId").value = id;

    }
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        });
    });
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/16/2022
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<h1>Danh sách bệnh án</h1>
<table  class="table table-success table-striped" style="width: 100%">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Mã bệnh án</th>
        <th scope="col">Mã bệnh nhân</th>
        <th scope="col">Tên bệnh nhân</th>
        <th scope="col">Ngày nhập viện</th>
        <th scope="col">Ngày ra viện</th>
        <th scope="col">Lý do nhập viện</th>
        <%--      <th scope="col">Phương pháp điều trị</th>--%>
        <%--      <th scope="col">Bác sĩ điều trị</th>--%>
        <th scope="col">Tác vụ</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="benhAn" items="${benhAnList}" varStatus="satus">
        <tr>
            <td><c:out value="${satus.count}"/></td>
            <td><c:out value="${benhAn.maBenhAn}"/></td>
            <td><c:out value="${benhAn.maBenhNhan}"/></td>
            <td><c:out value="${benhAn.benhNhan.tenBenhNhan}"/></td>
            <td><c:out value="${benhAn.ngayNhapVien}"/></td>
            <td><c:out value="${benhAn.ngayRaVien}"/></td>
            <td><c:out value="${benhAn.lyDoNhapVien}"/></td>
            <td>
                <a href="/benhAn?action=edit&id=${benhAn.getMaBenhAn()}" class="btn btn-primary">EDIT</a>
                <button type="button" class="btn btn-primary">
                    DELETE
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>

</body>
</html>

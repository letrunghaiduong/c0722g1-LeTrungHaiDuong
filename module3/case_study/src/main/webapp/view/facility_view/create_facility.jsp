<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/9/2022
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>CREATE</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"></head>
</head>
<body>
<h1>Trang thêm mới</h1>
<a href="/view/employee_view/employee_list.jsp">Quay lại danh sách</a>
<c:if test="${mess!=null}">
    <span style="color: blue">${mess}</span>
</c:if>
<form action="/users?action=add" method="post">
    <pre>Name:                           <input type="text" name="name"></pre>
    <pre>Email:                          <input type="text" name="email"></pre>
    <pre>Area:                           <input type="text" name="area"></pre>
    <pre>Cost:                           <input type="text" name="area"></pre>
    <pre>Max People:                     <input type="text" name="area"></pre>
    <pre>RENT TYPE ID:                   <input type="text" name="area"></pre>
    <pre>FACILITY TYPE:                  <input type="text" name="area"></pre>
    <pre>STANDARD ROOM:                  <input type="text" name="area"></pre>
    <pre>DESCRIPTION OTHER CONVENIENCE:  <input type="text" name="area"></pre>
    <pre>POOL AREA:                      <input type="text" name="area"></pre>
    <pre>NUMBER OF FLOORS:               <input type="text" name="area"></pre>
    <pre>FACILITY FREE:                  <input type="text" name="area"></pre>
    <input type="submit" value="ADD">
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>
</body>
</html>

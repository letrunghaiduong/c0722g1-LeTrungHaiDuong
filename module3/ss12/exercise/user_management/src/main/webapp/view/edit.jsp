<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/7/2022
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"></head>

</head>
<body>
<h1>Trang EDIT</h1>
<a href="/users">QUay lại trang list</a>
<c:if test="${messEdit!=null}">
    <span style="color: blue">${messEdit}</span>
</c:if>
<form action="/users?action=edit" method="post">
    <pre>Id:      <input type="text" name="id"></pre>
    <pre>Name:    <input type="text" name="name"></pre>
    <pre>Email:   <input type="text" name="email"></pre>
    <pre>Country: <input type="text" name="country"></pre>
    <input type="submit" value="EDIT">
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script></body>

</body>
</html>

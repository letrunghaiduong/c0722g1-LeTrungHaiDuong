<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/6/2022
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Remove</title>
</head>
<body>
<h1>Bạn có muốn xóa sanr phaamr nayf không</h1>
<a href="/product">Quay lại trang list</a>
<form action="/product?action=remove" method="post">
    <pre>ID:       <input type="hidden" name="id" value="${product.getId()}"></pre>
    <pre>Name:     <input type="text" name="name" value="${product.getName()}" readonly></pre>
    <pre>Price:    <input type="text" name="price" value="${product.getPrice()}" readonly></pre>
    <pre>Describe: <input type="text" name="describe" value="${product.getDescribe()}" readonly></pre>
    <pre>Producer: <input type="text" name="producer" value="${product.getProducer()}" readonly></pre>
    <pre> Xóa<input type="submit" name="submid" ></pre>
</form>
</body>
</html>

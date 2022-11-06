<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/6/2022
  Time: 12:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT</title>
</head>
<body>
<h1>Trang EDIT</h1>
<a href="/product">QUay lại trang list</a>
<form action="/product?action=edit" method="post">
    <pre>ID:       <input type="hidden" name="id" value="${product.getId()}"></pre>
    <pre>Name:     <input type="text" name="name" value="${product.getName()}"></pre>
    <pre>Price:    <input type="text" name="price" value="${product.getPrice()}"></pre>
    <pre>Describe: <input type="text" name="describe" value="${product.getDescribe()}"></pre>
    <pre>Producer: <input type="text" name="producer" value="${product.getProducer()}"></pre>
    <pre><input type="submit" name="submid" ></pre>
</form>
</body>
</html>

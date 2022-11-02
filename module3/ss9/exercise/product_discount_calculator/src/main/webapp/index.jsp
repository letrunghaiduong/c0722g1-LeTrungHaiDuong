<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/2/2022
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <input type="text" name="description" size="50" placeholder="Nhập mô tả "/>
    <input type="text" name="listPrice" placeholder="Giá niêm yết của sản phẩm "/>
    <input type="text" name="discountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm) "/>
    <input type = "submit" id = "submit" value = "Calculate Discount"/>
  </form>
  </body>
</html>

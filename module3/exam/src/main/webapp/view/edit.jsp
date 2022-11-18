<%--
  Created by IntelliJ IDEA.
  User: FPT
  Date: 11/16/2022
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT</title>
</head>
<body>
<h1>Sủa thông tin bệnh án</h1>
<h2><a href="/benhAn">Back List</a></h2>
<form class="col-md-2" action="/benhAn?action=edit" method="post">
    <label class="form-label">Mã bệnh án<input type="text" class="form-control" name="maBenhAn" value="${benhAn.maBenhAn()}"></label>
    <label class="form-label">Mã bệnh nhân <input type="text" class="form-control" name="maBenhNhan" value="${benhAn.maBenhNhan()}"></label>
    <label class="form-label">Tên bệnh nhân<input type="text" class="form-control" name="tenBenhNhan" value="${benhAn.benhNhan.tenBenhNhan()}"></label>
    <label class="form-label">Ngày nhập viện<input type="date" class="form-control" name="ngayNhapVien" value="${benhAn.ngayNhapVien()}"></label>
    <label class="form-label">Ngày ra viện<input type="date" class="form-control"  name="ngayRaVien" value="${benhAn.ngayRaVien()}"></label>
    <label class="form-label">Lý do nhập viện<input type="text" class="form-control"  name="lyDoNhapVien" value="${benhAn.lyDoNhapVien}"></label>
    <label class="form-label">Lý do nhập viện<input type="text" class="form-control"  name="phuongPhapDieuTri" value="${benhAn.phuongPhapDieuTri}"></label>
    <label class="form-label">Lý do nhập viện<input type="text" class="form-control"  name="bacSiDieuTri" value="${benhAn.bacSiDieuTri}"></label>
    <div class="col-md-3">
        <br>
        <input type="submit" value="SAVE">
    </div>
</form>
</body>
</html>

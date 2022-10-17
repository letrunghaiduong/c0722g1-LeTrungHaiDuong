drop database if exists convert_erd_to_relational;
create database convert_erd_to_relational;
use convert_erd_to_relational;
create table phieu_xuat(
soPX int primary key,
ngay_xuat date
);
create table vat_tu(
maVTU int primary key,
tenVTU varchar(50)
);
create table phieuXuat_vatTu(
soPX int,
maVTU int,
primary key(soPX,maVTU),
foreign key (soPX) references phieu_xuat(soPX),
foreign key (maVTU) references vat_tu(maVTU),
DGXuat double,
SLXuat int
);
create table phieu_nhap(
soPN int primary key,
ngay_nhap date
);
create table vatTu_phieuNhap(
maVTU int,
soPN int,
primary key(maVTU,soPN),
foreign key (maVTU) references vat_tu(maVTU),
foreign key (soPN) references phieu_nhap(soPN),
DGNhap double,
SLNhap int
);
create table donDH(
soDH int primary key,
ngayDH date
);
create	table vatTu_donDH(
maVTU int,
soDH int,
primary key(maVTU,soDH),
foreign key (maVTU) references vat_tu(maVTU),
foreign key (soDH) references donDH(soDH)
);
create table nhaCC(
maNCC int primary key,
tenNCC varchar(50),
diaChi varchar(50),
soDH int,
foreign key (soDH) references donDH(soDH),
sdt int
);
create table soDT(
so_dien_thoai int primary key,
maNCC int,
foreign key (maNCC) references nhaCC(maNCC)
);
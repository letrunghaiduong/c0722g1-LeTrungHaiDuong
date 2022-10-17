drop database if exists QuanLyBanHang;
create database  QuanLyBanHang;
use QuanLyBanHang;
create table customer(
customer_id int primary key,
customer_name varchar(50),
customer_age int
);
create table order_product(
order_id int primary key,
customer_id int,
foreign key (customer_id) references customer(customer_id),
order_date date,
order_price double
);
create table product(
product_id int primary key,
product_name varchar(50),
product_price double
);
create table order_detail(
order_id int,
product_id int,
primary key(order_id,product_id),
foreign key (order_id) references order_product(order_id),
foreign key (product_id) references product(product_id),
orQTY int
);



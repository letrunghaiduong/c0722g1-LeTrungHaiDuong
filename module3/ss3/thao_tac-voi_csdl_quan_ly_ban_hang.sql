use QuanLyBanHang;
insert into customer values (1,'Minh Quan',10),
							(2,'Ngoc Oanh',20),
							(3,'Hong Ha',50);
insert into order_product values (1,1,'2006-3-21',null),
								 (2,2,'2006-3-23',null),
								 (3,1,'2006-3-16',null);
insert into product values  (1,'May Giat',3),                                    
							(2,'Tu Lanh',5),
							(3,'Dieu Hoa',7),
							(4,'Quat',1),
							(5,'Bep Dien',2);
insert into order_detail values  (1,1,3),                               
								 (1,3,7),
								 (1,4,2),
								 (2,1,1),
								 (3,1,8),
								 (2,5,4),
								 (2,3,3);
                                 
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order 
select  order_id, 
		order_date, 
        order_price 
from order_product;                                 
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select  c.customer_name, 
		p.product_name
from customer c 
join order_product o 
on c.customer_id = o.customer_id 
join  order_detail od 
on o.order_id = od.order_id 
join product p 
on od.product_id =  p.product_id;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select *from customer c 
left join order_product o 
on c.customer_id = o.customer_id
where o.customer_id is null;
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
select  o.order_id,
		o.order_date, 
        sum(od.orQTY * p.product_price) as toltal
from order_product o 
join order_detail od
on o.order_id = od.order_id
join product p 
on od.product_id =  p.product_id
group by o.order_id

                                 
                                 
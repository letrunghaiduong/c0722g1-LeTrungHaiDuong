use case_study;
SET FOREIGN_KEY_CHECKS=0;  
insert into facility_type values (1, 'year'), 
							     (2, 'month'),
							     (3, 'day'),
							     (4, 'hour');
insert into rent_type values (1, 'Villa'), 
							 (2, 'House'),
							 (3, 'Room');
insert into facility values (1,'Villa Beach Front',25000,1000000,10,3,1,'vip','Có hồ bơi',500,4,null), 
						    (2,'House Princess 01',14000,5000000,7,2,2,'vip','Có thêm bếp nướng',null,3,null);
insert into _position value (1, 'Quản lý'),
                            (2, 'Nhân viên');
insert into education_degree value (1, 'Trung Cấp'),
                                   (2, 'Cao Đẳng'),
                                   (3, 'Đại Học'),
								   (4, 'Sau Đại Học');
insert into division value (1, 'Sale-Marketing'),
                            (2, 'Hành chính'),                                   
                            (3, 'Phục vụ'),                                   
                            (4, 'Quản lý');                          
insert into employee value   (1,'Nguyễn Văn An','1970-11-07',456231786,10000000,0901234121,'annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1), 
						     (2,'Lê Văn Bình','1997-04-09',654231234,7000000,0934212314,'binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),
						     (3,'Hồ Thị Yến','1995-12-12',999231723,14000000,0412352315,'thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
						     (4,'Võ Công Toản','1980-04-04',123231365,17000000,0374443232,'toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4);
insert into customer_type value (1, 'Diamond'), 
						      (2, 'Platinium'),
							  (3, 'Gold'),
						      (4, 'Silver'),
						      (5, 'Member'); 
insert into customer value (1,5,'Nguyễn Thị Hào','1970-11-07',0,643431213,0945423362,'thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng'), 
						      (2,3,'Phạm Xuân Diệu','1992-08-08',1,865342123,0954333333,'xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị'),
						      (3,1,'Trương Đình Nghệ','1990-02-27',1,488645199,0373213122,'nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh'),
						      (4,1,'Dương Văn Quan','1981-07-08',	1,543432111,0490039241,'duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng'),
						      (5,4,'Hoàng Trần Nhi Nhi','1995-12-09',0,795453345,0312345678,'nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai');                             
select*from customer;
use casestudy;
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
SET SQL_SAFE_UPDATES = 0; -- bật chế độ an toàn
SET SQL_SAFE_UPDATES = 1; -- tắt chế độ an toàn
delete from nhan_vien
where nhan_vien.ma_nhan_vien not in (select hop_dong.ma_nhan_vien 
								from hop_dong 
								where (year(hop_dong.ngay_lam_hop_dong) in ('2019','2020','2021'))
                                group by hop_dong.ma_nhan_vien);
select * from nhan_vien;

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
update loai_khach set ten_loai_khach = 'Diamond' 
where khach_hang.ma_khach_hang in (select kh.ma_khach_hang
	 from khach_hang kh
	 join loai_khach lk
	 on kh.ma_loai_khach = lk.ma_loai_khach
     join hop_dong hd
     on kh.ma_khach_hang = hd.ma_khach_hang
     join dich_vu dv
     on hd.ma_dich_vu = dv.ma_dich_vu
     join hop_dong_chi_tiet hdct 
     on hd.ma_hop_dong = hdct.ma_hop_dong
     join dich_vu_di_kem dvdk
     on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
	 where (lk.ten_loai_khach = 'Platinium') and year(hd.ngay_lam_hop_dong) = '2021'
     group by kh.ma_khach_hang
     having sum((dvdk.gia*hdct.so_luong)+dv.chi_phi_thue) > 1000000); 
     
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).     
delete from hop_dong , hop_dong_chi_tiet 
using hop_dong
join hop_dong_chi_tiet
where year(hop_dong.ngay_lam_hop_dong) < 2021
    and hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong;
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
SET SQL_SAFE_UPDATES = 0;
update dich_vu_di_kem dvdk 
SET gia = gia * 2
where dvdk.ma_dich_vu_di_kem = (select a.mdvdk
	from (select hdct.ma_dich_vu_di_kem mdvdk , SUM(hdct.so_luong) tsl
		from hop_dong hd
		join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
		where year(hd.ngay_lam_hop_dong) = 2020
		group by ma_dich_vu_di_kem) a where a.tsl >10);
SET SQL_SAFE_UPDATES = 1;
-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.	  
select nv.ma_nhan_vien id,nv.ho_ten,nv.email,nv.so_dien_thoai,nv.ngay_sinh,nv.dia_chi from nhan_vien nv
union
select kh.ma_khach_hang,kh.ho_ten,kh.email,kh.so_dien_thoai,kh.ngay_sinh,kh.dia_chi from khach_hang kh;        

  
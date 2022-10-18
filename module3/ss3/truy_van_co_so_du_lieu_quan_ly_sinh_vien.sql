use QuanLySinhVien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from Student where StudentName like 'H%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from Class where StartDate like '%12%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from Subject where Credit >= 3 and Credit <= 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
select * from Student where StudentName = 'Hung';
 SET SQL_SAFE_UPDATES = 0;
 update Student set ClassId = 2;
 SET SQL_SAFE_UPDATES = 1;
 
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select s.StudentId, s.StudentName, sub.SubName, m.Mark
from  Student s join Mark m on s.StudentId = m.StudentId join Subject sub on m.SubId = sub.SubId
order by m.Mark desc, s.StudentName asc;
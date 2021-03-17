<h1>Student-Management</h1>
</br>Quản lý sinh viên - giáo viên

Câu 1:
Tạo lớp Person chứa thông tin

- Tên

- Giới tính

- Ngày sinh

- Địa chỉ

Với đầy đủ hàm get set, constructor không tham số, constructor đầy đủ tham số

1. Viết phương thức inputInfo(), nhập thông tin Person từ bàn phím

2. Viết phương thức showInfo(), hiển thị tất cả thông tin Person

Câu 2:
Tạo lớp Student thừa kế Person, lưu trữ các thông tin một sinh viên

- Mã sinh viên: chứa 8 kí tự

- Điểm trung bình: từ 0.0 – 10.0

- Email: phải chứa kí tự @ và không tồn tại khoảng trắng

1. Override phương thức inputInfo(), nhập thông tin Student từ bàn phím

2. Override phương thức showInfo(), hiển thị tất cả thông tin Student

3. Viết phương thức xét xem Student có được học bổng không? Điểm trung bình trên 8.0 là được học bổng

Câu 3:
Tạo lớp StudentTest, chứa Main kiểm tra chức năng lớp Student

Tạo Menu chọn như sau

a. Chọn 1: Nhập vào n sinh viên (n là số lượng sinh viên, được nhập từ bàn phím)

b. Chọn 2: Hiển thị thông tin tất cả các sinh viên ra màn hình

c. Chọn 3: Hiển thị sinh viên có điểm trung bình cao nhất và sinh viên có điểm trung bình thấp nhất

d. Chọn 4: Tìm kiếm sinh viên theo mã sinh viên. Nhập vào mã sinh viên. Nếu tồn tại sinh viên

có mã đó thì in ra màn hình thông tin sinh viên. Nếu không tồn tại thì in ra: Không có sinh

viên nào có mã là <giá trị của mã sinh viên>

e. Chọn 5: Hiển thị tất cả các sinh viên theo thứ tự tên trong bảng chữ cái (A->Z)

f. Chọn 6: Hiển thị tất cả các sinh viên được học bổng, và sắp xếp theo thứ tự điểm cao xuống thấp

g. Chọn 7: Thoát

Câu 4:
Tạo lớp Teacher, kế thừa từ Person, lưu trữ thông tin một giảng viên

- Lớp dạy: Lưu lớp mà giảng viên dạy giống như aptech (ví dụ C1011L, C0903H, C1010KV…)

- Lương một giờ dạy

- Số giờ dạy trong tháng

1. Override phương thức inputInfo(), nhập thông tin Teacher từ bàn phím

2. Override phương thức showInfo(), hiển thị tất cả thông tin Teacher

3. Viết phương thức tính lương thực nhận, trả về lương thực nhận theo công thức:

Nếu lớp dạy là lớp buổi sáng và chiều (Giờ G, H, I, K) thì

Lương thực nhận = lương một giờ dạy * số giờ dạy trong tháng;

Nếu lớp dạy là lớp buổi tối (Giờ L, giờ M) thì

Lương thực nhân = lương một giờ dạy * số giờ dạy trong tháng + 200000đ;

Câu 5:
Tạo lớp TeacherTest, chứa hàm Main kiểm tra chức năng của Teacher

Tạo menu lựa chọn như sau:

a. Chọn 1: Nhập vào n giảng viên (n là số lượng sinh viên, được nhập từ bàn phím)

b. Chọn 2: Hiển thị thông tin tất cả các giảng viên ra màn hình

c. Chọn 3: Hiển thị giảng viên có lương cao nhất

d. Chọn 4: Thoát

# Project_OOP_QLHTRCP
Projcet of Hieu_zeus

Đặc tả bài toán: Một hệ rạp thống chiếu phim ở Việt Nam có nhiều rạp chiếu phim. Mỗi rạp chiếu phim được xác định bởi mã rạp, gồm có các thông tin như: tên rạp, địa chỉ, số phòng chiếu trong rạp, sức chứa của rạp. Mỗi rạp chiếu phim thì có nhiều phòng được xác định bởi mã phòng, gồm các thuộc tính như: khu vực, số lượng ghế, loại phòng (Vip, thường). Một rạp chiếu phim có nhiều tệp khách hàng được xác định bởi mã tệp khách hàng, gồm các thuộc tính: tên tệp khách hàng, độ tuổi, sở thích, số lượng.
Tân từ: Một rạp chiếu phim có nhiều phòng, một phòng chiếu thuộc về một rạp duy nhất. 
Mỗi phòng có thể chiếu nhiều bộ phim khác nhau. Mỗi bộ phim được xác định bởi mã phim, gồm các thuộc tính: tên phim, đạo diễn, diễn viên chính, thời lượng và thể loại của bộ phim đó.
Tân từ: Một phòng được chiếu nhiều bộ phim. Mỗi bộ phim có thể chiếu ở nhiều phòng
Do có nhiều phòng và nhiều bộ phim nên để khán giả dễ theo dõi, tạo nên lịch chiếu để khán giả dễ theo dõi để chọn thời điểm thích hợp để xem phim.
Một phòng có nhiều lịch chiếu, mỗi lịch chiếu dành cho một phòng. Khán giả là người đi xem bộ phim mình mong muốn, được xác định bởi mã khán giả, khán giả có các thuộc tính khác như: họ tên, ngày sinh, địa chỉ, số điện thoại. Sau khi mua vé khán giả sẽ được cấp một hóa đơn, xác định với mã hóa đơn, và các thuộc tính: ngày hóa đơn, số tiền phải trả, tên bộ phim xem, giờ chiếu, vị trí ghế.
Tân từ: Một khán giả có thể đặt nhiều vé, mỗi vé chỉ có thể dùng được cho một khán giả. Một vé chỉ hiệu lực ở một rạp và một rạp có nhiều vé.
Trong rạp có nhiều nhân viên được bố trí làm ở các vị trí khác nhau, vị trí làm việc được xác định bởi mã công việc, gồm các thuộc tính: tencv, mô tả công việc. Có thể có quản lý rạp, được xác đỉnh bởi mã nhân viên, gồm các thuộc tính: họ tên, ngày sinh, vị trí việc làm, lương, số điên thoại. Mỗi nhân viên làm nhiều công việc khác nhau.
Tân từ: Một rạp chiếu phim có nhiều nhân viên. Mỗi một nhân viên chỉ làm ở một rạp chiếu duy nhất. Mỗi nhân viên làm nhiều công việc, mỗi công việc do nhiều nhân viên đảm nhiệm.
Để có được các bộ phim chiếu trong các rạp thì rạp đó phải hợp tác với các đối tác hãng phim, được xác định bởi mã đối tác, gồm các thuộc tính: họ tên đối tác, số điện thoại. Tại đó ta có các hợp đồng xác định bởi số hợp đồng, các thuộc tính: ngày hợp đồng, trị giá hợp đồng, số tiền tạm đóng, ngày đóng tiền.
Tân từ: Một rạp phim hợp tác với nhiều đối tác, mỗi đối tác chỉ hợp tác với hãng phim duy nhất. Một rạp phim có nhiều hợp đồng, mỗi hợp đồng thuộc về một rạp chiếu duy nhất.


5 câu hỏi Lambda Expression (Java).
1.	Lấy ra thông tin những bộ phim mà Trấn Thành làm diễn viên chính.
2.	Lấy ra tên hợp đồng, tên đối tác và ngày hợp đồng đối với những hợp đồng vẫn chưa thành toán đủ.
3.	Cho biết danh sách nhân viên đến từ những tỉnh thành nào. Sắp xếp tăng dần các tỉnh thành theo chữ cái đầu tiên.
4.	Tại các phòng của rạp khi biết mã rạp. Cho biết thông tin về phòng chiếu, phim được chiếu và thời gian chiếu.
5.	Cho biết thông tin những bộ phim hiện chưa có xuất chiếu.

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home</title>
  </head>
  <body>
    <div class="container">
      <ol>
        <li>
          <a href="<c:url value="/teachers/thong-tin-tat-ca-giang-vien" />">
             Thông tin gồm mã số, họ tên và tênT chuyên ngành của tất cả các giảng viên
          </a>
        </li>
        <li>
          <a href="<c:url value="/teachers/thong-tin-giang-vien-chuyen-nganh-CNTT-va-DTVT" />">
             Thông tin gồm mã số, họ tên và tên Chuyên ngành của các giảng
            viên của Chuyên ngành CNTT và ĐTVT
          </a>
        </li>
        <li>
          <a href="http://"> Số sinh viên của Chuyên ngành CNTT </a>
        </li>
        <li>
          <a href="<c:url value="/students/thong-tin-sinh-vien-chuyen-nganh-Ke-Toan" />">
             Danh sách gồm mã số, họ tên và tuổi của các sinh viên Chuyên
            ngành Kế toán
          </a>
        </li>
        <li>
          <a href="http://">
             Số giảng viên của Chuyên ngành Kế toán
          </a>
        </li>
        <li>
          <a href="http://">
             Thông tin về sinh viên không tham gia làm đồ án
          </a>
        </li>
        <li>
          <a href="http://">
             Mã Chuyên ngành, tên Chuyên ngành và số giảng viên của mỗi
            Chuyên ngành
          </a>
        </li>
        <li>
          <a href="http://">
             Số điện thoại của Chuyên ngành mà sinh viên có tên ‘Le van
            son’ đang theo học
          </a>
        </li>
        <li>
          <a href="http://">
             Mã số và tên của các đề tài do giảng viên ‘Tran son’ hướng
            dẫn
          </a>
        </li>
        <li>
          <a href="http://">
             Tên đề tài không có sinh viên nào làm đồ án
          </a>
        </li>
        <li>
          <a href="<c:url value="/teachers/thong-tin-giang-vien-huong-dan-tu-ba-sinh-vien-tro-len" />">
             Mã số, họ tên, tên Chuyên ngành của các giảng viên hướng
            dẫn từ 3 sinh viên trở lên.
          </a>
        </li>
        <li>
          <a href="http://">
             Mã số, tên đề tài của đề tài có nhiều sinh viên làm nhất.
          </a>
        </li>
        <li>
          <a href="http://">
             Mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia
            đồ án
          </a>
        </li>
        <li>
          <a href="http://">
             Mã số, họ tên và điểm của các sinh viên Chuyên ngành CNTT và
            ĐTVT
          </a>
        </li>
        <li>
          <a href="http://">
             Tên Chuyên ngành, số lượng sinh viên của mỗi Chuyên ngành
          </a>
        </li>
        <li>
          <a href="http://">
            Thông tin về những sinh viên chưa có điểm đồ án
          </a>
        </li>
        <li>
          <a href="http://">
             Danh sách gồm mã số, họ tên các sinh viên có điểm đồ án bằng
            0
          </a>
        </li>
        <li>
          <a href="http://">
             Top 5 sinh viên có điểm đồ án cao nhất chuyên ngành CNTT
          </a>
        </li>
        <li>
          <a href="http://">
             Sinh viên có điểm đồ án cao top 2 chuyên ngành ĐTVT.
          </a>
        </li>
        <li>
          <a href="http://">
             Số sinh viên có điểm trên 5 của mỗi chuyên ngành.
          </a>
        </li>
        <li>
          <a href="http://">
            Tính điểm trung bình đồ án của một nhóm sinh viên và sinh
            viên có điểm cao nhất trong nhóm.
          </a>
        </li>
      </ol>
    </div>
  </body>
</html>

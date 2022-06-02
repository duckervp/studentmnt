package com.management.controller;

import com.management.dto.StudentDetail;
import com.management.service.IStudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final IStudentDetailService studentDetailService;

    @Autowired
    public StudentController(IStudentDetailService studentDetailService) {
        this.studentDetailService = studentDetailService;
    }

    @GetMapping("/thong-tin-sinh-vien-chuyen-nganh-Ke-Toan")
    public String getView(ModelMap model) {
        List<StudentDetail> studentDetails = studentDetailService.getStudentByMajorName("Kế Toán");
        System.out.println("size: " + studentDetails.size());
        String[] heads = {"Code", "Name", "Age"};
        List<String[]> students = new ArrayList<>();
        for (StudentDetail studentDetail: studentDetails) {
            students.add(studentDetail.toStringArray());
        }
        model.addAttribute("heads", heads);
        model.addAttribute("datas", students);
        model.addAttribute("title", "Danh sách gồm mã số, họ tên và tuổi của các sinh viên Chuyên ngành Kế toán");
        return "result";
    }
}

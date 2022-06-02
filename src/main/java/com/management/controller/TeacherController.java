package com.management.controller;

import com.management.dto.TeacherDetail;
import com.management.model.Teacher;
import com.management.service.ITeacherDetailService;
import com.management.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    private final ITeacherService teacherService;
    private final ITeacherDetailService teacherDetailService;

    @Autowired
    public TeacherController(ITeacherService teacherService, ITeacherDetailService teacherDetailService) {
        this.teacherService = teacherService;
        this.teacherDetailService = teacherDetailService;
    }

    @GetMapping("/thong-tin-tat-ca-giang-vien")
    public String getView(ModelMap model, @RequestParam(value = "majors", required = false) List<String> majors, @RequestParam(value = "quantity", required = false) Integer quantity) {
        List<Teacher> teachers;
        String title = "";
        if (majors != null) {
            teachers = teacherService.findByCodes(majors);
            title = "Thông tin gồm mã số, họ tên và tên Chuyên ngành của các giảng viên của Chuyên ngành CNTT và ĐTVT";
        } else if (quantity != null) {
            teachers = new ArrayList<>();
            title = "Mã số, họ tên, tên Chuyên ngành của các giảng viên hướng dẫn từ 3 sinh viên trở lên.";
        } else {
            teachers = teacherService.findAll();
            title = "Thông tin gồm mã số, họ tên và tên chuyên ngành của tất cả các giảng viên";
        }
        model.addAttribute("title", title);
        model.addAttribute("teachers", teachers);
        return "teacher";
    }

    @GetMapping("/thong-tin-giang-vien-chuyen-nganh-CNTT-va-DTVT")
    public String getView2(ModelMap model) {
        List<TeacherDetail> teacherDetails = teacherDetailService.findByCodes();
        String[] heads = {"Code", "Name", "Major"};
        List<String[]> teachers = new ArrayList<>();
        for (TeacherDetail teacherDetail : teacherDetails) {
            teachers.add(teacherDetail.toStringArray());
        }
        model.addAttribute("heads", heads);
        model.addAttribute("datas", teachers);
        model.addAttribute("title", "Thông tin gồm mã số, họ tên và tên Chuyên ngành của các giảng viên của Chuyên ngành CNTT và ĐTVT");
        return "result";
    }

    @GetMapping("/thong-tin-giang-vien-huong-dan-tu-ba-sinh-vien-tro-len")
    public String getView3(ModelMap model) {
        List<TeacherDetail> teacherDetails = teacherDetailService.findByStudentInstructedQuantity(3);
        String[] heads = {"Code", "Name", "Major"};
        List<String[]> teachers = new ArrayList<>();
        for (TeacherDetail teacherDetail : teacherDetails) {
            teachers.add(teacherDetail.toStringArray());
        }
        model.addAttribute("heads", heads);
        model.addAttribute("datas", teachers);
        model.addAttribute("title", "Mã số, họ tên, tên Chuyên ngành của các giảng viên hướng\n" +
                "            dẫn từ 3 sinh viên trở lên.");
        return "result";
    }

}

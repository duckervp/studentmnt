package com.management.service.impl;

import com.management.dao.ITeacherDetailDAO;
import com.management.dto.TeacherDetail;
import com.management.service.ITeacherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherDetailService implements ITeacherDetailService {
    private ITeacherDetailDAO teacherDetailDAO;

    @Autowired
    public TeacherDetailService(ITeacherDetailDAO teacherDetailDAO) {
        this.teacherDetailDAO = teacherDetailDAO;
    }

    @Override
    public List<TeacherDetail> findByCodes() {
        return teacherDetailDAO.findByCodes();
    }

    @Override
    public List<TeacherDetail> findByStudentInstructedQuantity(Integer quantity) {
        return teacherDetailDAO.findByStudentInstructedQuantity(quantity);
    }
}

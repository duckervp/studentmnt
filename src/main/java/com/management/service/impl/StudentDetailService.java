package com.management.service.impl;

import com.management.dao.IStudentDetailDAO;
import com.management.dto.StudentDetail;
import com.management.service.IStudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailService implements IStudentDetailService {
    private final IStudentDetailDAO studentDetailDAO;

    @Autowired
    public StudentDetailService(IStudentDetailDAO studentDetailDAO) {
        this.studentDetailDAO = studentDetailDAO;
    }

    @Override
    public List<StudentDetail> getStudentByMajorName(String majorName) {
        return studentDetailDAO.getStudentByMajorName(majorName);
    }
}

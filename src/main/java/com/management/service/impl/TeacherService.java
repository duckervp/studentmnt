package com.management.service.impl;

import com.management.dao.ITeacherDAO;
import com.management.model.Major;
import com.management.model.Teacher;
import com.management.service.IMajorService;
import com.management.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService implements ITeacherService {
    private final ITeacherDAO teacherDAO;
    private final IMajorService majorService;

    @Autowired
    public TeacherService(ITeacherDAO teacherDAO, IMajorService majorService) {
        this.teacherDAO = teacherDAO;
        this.majorService = majorService;
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> teachers = teacherDAO.findAll();
        for (Teacher teacher : teachers) {
            teacher.setMajor(majorService.findById(teacher.getMajor().getId()));
        }
        return teachers;
    }

    @Override
    public Teacher findById(Long id) {
        Teacher teacher = teacherDAO.findOne(id);
        teacher.setMajor(majorService.findById(teacher.getMajor().getId()));
        return teacher;
    }

    @Override
    public List<Teacher> findByCodes(List<String> codes) {
        List<Teacher> teachers = findAll();
        List<Teacher> result = new ArrayList<>();
        for (String code : codes) {
            for (Teacher teacher : teachers) {
                if (teacher.getMajor().getCode().equalsIgnoreCase(code)) {
                    result.add(teacher);
                }
            }
        }
        return result;
    }
}

package com.management.dao;

import com.management.dto.TeacherDetail;

import java.util.List;

public interface ITeacherDetailDAO {
    List<TeacherDetail> findByCodes();

    List<TeacherDetail> findByStudentInstructedQuantity(Integer quantity);
}

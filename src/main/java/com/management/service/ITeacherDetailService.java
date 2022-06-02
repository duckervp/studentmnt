package com.management.service;

import com.management.dto.TeacherDetail;

import java.util.List;

public interface ITeacherDetailService {
    List<TeacherDetail> findByCodes();
    List<TeacherDetail> findByStudentInstructedQuantity(Integer quantity);
}

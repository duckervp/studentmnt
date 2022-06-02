package com.management.service;

import com.management.dto.StudentDetail;

import java.util.List;

public interface IStudentDetailService {
    List<StudentDetail> getStudentByMajorName(String majorName);
}

package com.management.dao;

import com.management.dto.StudentDetail;

import java.util.List;

public interface IStudentDetailDAO {
    List<StudentDetail> getStudentByMajorName(String majorName);
}

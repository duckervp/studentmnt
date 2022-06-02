package com.management.service;

import com.management.model.Teacher;

import java.util.List;

public interface ITeacherService extends IService<Teacher, Long>{
    List<Teacher> findByCodes(List<String> codes);
}

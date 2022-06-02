package com.management.dao.impl;

import com.management.dao.ITeacherDAO;
import com.management.mapper.TeacherMapper;
import com.management.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class TeacherDAO implements ITeacherDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public TeacherDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public List<Teacher> findAll() {
        String sql = "SELECT * FROM StudentMNT.Teacher";
        return jdbcTemplate.query(sql, new TeacherMapper());
    }

    @Override
    public Teacher findOne(Long id) {
        return null;
    }
}

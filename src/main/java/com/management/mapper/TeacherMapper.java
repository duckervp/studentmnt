package com.management.mapper;

import com.management.model.Major;
import com.management.model.Teacher;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherMapper implements RowMapper<Teacher> {
    @Override
    public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Teacher teacher = new Teacher(
                rs.getLong("id"),
                rs.getString("code"),
                rs.getTimestamp("createdTime"),
                rs.getTimestamp("updatedTime"),
                rs.getString("name")
        );
        teacher.setMajor(new Major(rs.getLong("majorId")));
        return teacher;
    }
}

package com.management.mapper;

import com.management.dto.StudentDetail;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDetailMapper implements RowMapper<StudentDetail> {
    @Override
    public StudentDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new StudentDetail(
                rs.getString("code"),
                rs.getString("name"),
                rs.getInt("age")
        );
    }
}

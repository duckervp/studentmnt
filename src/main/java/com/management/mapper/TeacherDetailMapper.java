package com.management.mapper;

import com.management.dto.TeacherDetail;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherDetailMapper implements RowMapper<TeacherDetail> {
    @Override
    public TeacherDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new TeacherDetail(
                rs.getString("code"),
                rs.getString("name"),
                rs.getString("majorName")
        );
    }
}

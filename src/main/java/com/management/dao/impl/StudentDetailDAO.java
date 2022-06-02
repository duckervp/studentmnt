package com.management.dao.impl;

import com.management.dao.IStudentDetailDAO;
import com.management.dto.StudentDetail;
import com.management.mapper.StudentDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentDetailDAO implements IStudentDetailDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDetailDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<StudentDetail> getStudentByMajorName(String majorName) {
        majorName = "%" + majorName + "%";
        String sql = "SELECT ST.code, ST.name, TIMESTAMPDIFF(YEAR, ST.dob, CURRENT_TIMESTAMP()) AS age "
            + "FROM StudentMNT.Student AS ST "
            + "WHERE ST.majorId = (SELECT MJ.id FROM StudentMNT.Major AS MJ WHERE MJ.name LIKE ?)";
        return jdbcTemplate.query(sql, new StudentDetailMapper(), new Object[] {majorName});
    }
}

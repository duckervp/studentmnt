package com.management.dao.impl;

import com.management.dao.ITeacherDetailDAO;
import com.management.dto.TeacherDetail;
import com.management.mapper.TeacherDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class TeacherDetailDAO implements ITeacherDetailDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public TeacherDetailDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<TeacherDetail> findByCodes() {
        String sql = "SELECT TC.code, TC.name, (SELECT MJ2.name FROM StudentMNT.Major AS MJ2 WHERE MJ2.id = TC.majorId) AS majorName " +
                "FROM StudentMNT.Teacher AS TC WHERE TC.majorId IN (SELECT MJ.id FROM StudentMNT.Major AS MJ WHERE MJ.code IN ('CNTT', 'DTVT'))";
        return jdbcTemplate.query(sql, new TeacherDetailMapper());
    }

    @Override
    public List<TeacherDetail> findByStudentInstructedQuantity(Integer quantity) {
        String sql = "SELECT TC.code, " +
                "TC.name, " +
                "(SELECT MJ.name FROM StudentMNT.Major AS MJ WHERE MJ.id = TC.majorId) AS majorName " +
                "FROM StudentMNT.Teacher AS TC " +
                "WHERE TC.id IN (SELECT GI.teacherId " +
                "FROM StudentMNT.GroupInstructor AS GI " +
                "WHERE GI.projectGroupId IN (SELECT TEMP.projectGroupId " +
                "FROM (SELECT ST.projectGroupId, COUNT(*) AS numberOfStudent " +
                "FROM StudentMNT.Student AS ST " +
                "GROUP BY ST.projectGroupId) AS TEMP " +
                "WHERE TEMP.numberOfStudent >= ?))";
        return jdbcTemplate.query(sql, new TeacherDetailMapper(), new Object[] {quantity});
    }
}

package com.management.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import com.management.dao.IMajorDAO;
import com.management.mapper.MajorMapper;
import com.management.model.Major;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MajorDAO implements IMajorDAO {
  private JdbcTemplate jdbcTemplate;

  @Autowired
  public MajorDAO(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
  @Override
  public List<Major> findAll() {
    String sql = "SELECT * FROM StudentMNT.Major";
    return jdbcTemplate.query(sql, new MajorMapper());
  }

  @Override
  public Major findOne(Long id) {
    String sql = "SELECT * FROM StudentMNT.Major AS MJ WHERE MJ.id = ?";
    return jdbcTemplate.queryForObject(sql, new MajorMapper(), new Object[] {id});
  }

  @Override
  public Major findOne(String code) {
    String sql = "SELECT * FROM StudentMNT.Major AS MJ WHERE MJ.code = ?";
    return jdbcTemplate.queryForObject(sql, new MajorMapper(), new Object[] {code});
  }
}

package com.management.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.management.model.Major;

import org.springframework.jdbc.core.RowMapper;

public class MajorMapper implements RowMapper<Major>{

  @Override
  public Major mapRow(ResultSet rs, int rowNum) throws SQLException {
    Major major = new Major(
      rs.getLong("id"),
      rs.getString("code"),
      rs.getTimestamp("createdTime"),
      rs.getTimestamp("updatedTime"),
      rs.getNString("name"),
      rs.getString("phone")
    );
    return major;
  }
  
}

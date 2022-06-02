package com.management.dao;

import java.util.List;

import com.management.model.Major;

public interface IMajorDAO extends IDAO<Major, Long> {
  Major findOne(String code);
}

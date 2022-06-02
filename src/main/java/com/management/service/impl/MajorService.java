package com.management.service.impl;

import java.util.List;

import com.management.dao.IMajorDAO;
import com.management.model.Major;
import com.management.service.IMajorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorService implements IMajorService {
  private IMajorDAO majorDAO;

  @Autowired
  public MajorService(IMajorDAO majorDAO) {
    this.majorDAO = majorDAO;
  }

  @Override
  public List<Major> findAll() {
    return majorDAO.findAll();
  }

  @Override
  public Major findById(Long id) {
    return majorDAO.findOne(id);
  }

  @Override
  public Major findByCode(String code) {
    return majorDAO.findOne(code);
  }
}

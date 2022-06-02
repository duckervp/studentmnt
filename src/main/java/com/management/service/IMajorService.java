package com.management.service;

import java.util.List;

import com.management.model.Major;

public interface IMajorService extends IService<Major, Long>{
  Major findByCode(String code);
}

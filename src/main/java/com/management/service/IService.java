package com.management.service;

import com.management.model.Major;

import java.util.List;

public interface IService<T, L> {
    List<T> findAll();

    T findById(L id);
}

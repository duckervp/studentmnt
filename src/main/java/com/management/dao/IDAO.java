package com.management.dao;

import java.util.List;

public interface IDAO<T, L> {
	List<T> findAll();
	T findOne(L id);
	// T insert(T data);
	// boolean update(T data);
	// boolean delete(L id);
}

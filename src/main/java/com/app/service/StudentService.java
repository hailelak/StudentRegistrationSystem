package com.app.service;

import java.util.List;

import com.app.model.Student;
	
	public interface StudentService<T> {
		
		public T findOne(final Long id);

		public List<T> findAll();

		public T save(final T entity);

		public T update(final T entity);

		public void delete(final T entity);

		public void deleteById(final long id);

		public Integer countAll();
	}



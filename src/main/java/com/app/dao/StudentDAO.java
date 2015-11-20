package com.app.dao;

import java.util.List;

import com.app.model.Student;


public interface StudentDAO {
	public Student findOne(final long id);

	public List findAll();

	public Student save(final Student entity);

	public Student update(final Student entity);

	public void delete(final Student entity);

	public void deleteById(final long id);

	public Integer countAll();
}

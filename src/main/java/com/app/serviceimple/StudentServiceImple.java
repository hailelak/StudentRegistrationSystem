package com.app.serviceimple;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDAO;
import com.app.model.Student;


public abstract class StudentServiceImple {
	
	protected abstract StudentDAO getDAO();
	@Transactional
	public Student findOne(Long id) {
		return (Student) getDAO().findOne(id);
	}
	@Transactional
	public List<Student> findAll() {
		return getDAO().findAll();
	}

	@Transactional
	public Student save(Student entity) {
		return (Student) getDAO().save(entity);
	}

	@Transactional
	public Student update(Student entity) {
		return (Student) getDAO().update(entity);
	}

	@Transactional
	public void delete(Student entity) {
		getDAO().delete(entity);
	}

	@Transactional
	public void deleteById(long id) {
		getDAO().deleteById(id);
	}

	public Integer countAll() {
		return getDAO().countAll();
	}
}

package com.app.dao.imple;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dao.StudentDAO;
import com.app.model.Student;



@Repository("StudentDAO")
public class StudentDAOImple implements	StudentDAO {
	public StudentDAOImple() {
		setClazz(Student.class);
	}

	@Override
	public Student findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student save(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		return null;
	}
}


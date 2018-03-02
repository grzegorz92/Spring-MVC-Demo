package com.university.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.university.entity.NewStudent;

@Repository
public class NewStudentDAO implements DAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void saveData(NewStudent newStudent) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(newStudent);
		
		

	}



}

package com.university.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.university.dao.DAO;
import com.university.entity.NewStudent;



@Service
public class NewStudentService implements NewService {

	@Autowired
	private DAO newStudentDAO;
	
	@Override
	@Transactional
	public void saveData(NewStudent newStudent) {
		
		newStudentDAO.saveData(newStudent);
		
		
		
	}

}

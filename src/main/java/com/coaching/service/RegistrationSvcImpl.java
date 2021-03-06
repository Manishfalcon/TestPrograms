package com.coaching.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coaching.dao.RegistrationDAO;
import com.coaching.model.StudentEntity;
import com.coaching.model.SubjectEntity;
import com.coaching.model.TeacherEntity;
import com.coaching.travelObject.StudentTO;
import com.coaching.travelObject.TeacherTO;

@Service("registrationSvc")
public class RegistrationSvcImpl implements RegistrationSvc {
	
	@Autowired
	RegistrationDAO registrationDAO; 
	
	
	public List<StudentTO> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TeacherTO> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addStuent(StudentEntity stu) {
		registrationDAO.addStuent(stu);
		
	}

	public void addTeacher(TeacherEntity tchr) {
		// TODO Auto-generated method stub
		
	}

	public List<SubjectEntity> getAllSubjects() {
		 List<SubjectEntity> userProfiles = registrationDAO.getAllSubjects();
		return null;
	}

	
}

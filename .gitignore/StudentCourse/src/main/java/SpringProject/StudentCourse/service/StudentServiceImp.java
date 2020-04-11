package SpringProject.StudentCourse.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import SpringProject.StudentCourse.DAO.StudentDAO;
import SpringProject.StudentCourse.Exception.ApiException;
import SpringProject.StudentCourse.entity.Courses;
import SpringProject.StudentCourse.entity.Student;

public class StudentServiceImp implements StudentService{
	
	
	@Autowired
	
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO=studentDAO;
	}

	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.addStudent(student);
		
	}
    

	@Transactional
	public void deleteStudent(long studentId) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(studentId);
		
	}


	@Transactional
	public void addCourse(long studentID, Courses course) {
		// TODO Auto-generated method stub
		studentDAO.addCourse(studentID, course);
	}

	@Transactional
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		Student s=studentDAO.getStudentByEmail(email);
		if(Objects.isNull(s)) {
		   throw new ApiException("User not found with email: "+email,404); 
		}
		return s;
		
	}

}

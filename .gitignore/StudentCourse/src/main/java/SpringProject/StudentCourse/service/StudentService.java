package SpringProject.StudentCourse.service;

import SpringProject.StudentCourse.entity.Courses;
import SpringProject.StudentCourse.entity.Student;

public interface StudentService {
	
	   public void addStudent(Student student);
	    
	   public Student getStudentByEmail(String email);
	    
	   public void addCourse(long studentID, Courses course);
		
		
	   public void deleteStudent(long studentId);

}

package SpringProject.StudentCourse.DAO;

import SpringProject.StudentCourse.entity.Courses;
import SpringProject.StudentCourse.entity.Student;

public interface StudentDAO {
	
	public Student getStudentByEmail(String email);
	
    public void addStudent(Student student);
    
    public void addCourse(long studentID, Courses course);
    
	
	public void deleteStudent(long studentId);

}

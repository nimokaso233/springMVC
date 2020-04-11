package SpringProject.StudentCourse.DAO;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import SpringProject.StudentCourse.entity.Courses;
import SpringProject.StudentCourse.entity.Student;

@Repository
@Transactional
public class StudentDAOImp implements StudentDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;
	
   	
   public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		String s=" SELECT stu_id FROM Student s where u.email=:email";
		Query query = sessionFactory.getCurrentSession().createQuery(s);
		query.setParameter("email", email);
		return (Student) query.uniqueResult();
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(student);
	}
	
	
	public void addCourse(long studentId, Courses course) {
		// TODO Auto-generated method stub
		Student student = (Student) sessionFactory.getCurrentSession().load(
				Student.class, studentId);
		
	    student.addCourse(course);
		
	}
	
	

	public void deleteStudent(long studentId) {
		// TODO Auto-generated method stub
		Student student = (Student) sessionFactory.getCurrentSession().load(
				Student.class, studentId);
        if (null != student) {
        	this.sessionFactory.getCurrentSession().delete(student);
        }
	}

	

	

	
		

	

}

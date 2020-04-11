package SpringProject.StudentCourse.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity(name="Student")
@Table(name="Student",uniqueConstraints = {@UniqueConstraint(columnNames = "stu_id")})

public class Student {
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="stu_id")
private long id;

@Column(name = "first_name",unique = true, length = 100)
private String fname;

@Column(name = "last_name",unique = true, length = 100)
private String lname;

@Column(name = "email", unique = true, nullable = false, length = 100)
private String email;

@Column(name="psd", unique=true, nullable=true, length=100)
private String psd;

@Column(name="role")
private final String role="ROLE_USER";

@OneToMany(cascade=CascadeType.ALL)
@JoinTable(name="student_course", joinColumns={@JoinColumn(name="stu_id", referencedColumnName="id")}
, inverseJoinColumns={@JoinColumn(name="c_id", referencedColumnName="id")})

private List<Courses> courses;

public long getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFname() {  
    return fname;  
}  
public void setFname(String firstname) {  
    this.fname = firstname;  
}  
public String getLname() {  
    return lname;  
}  
public void setLname(String lastname) {  
    this.lname = lastname;  
}

public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}

public String getPSD() {  
    return psd;  
}  
public void setPSD(String password) {  
    this.psd = password;  
}

public List<Courses> getCourse() {  
    return courses;  
}  
public void setCourses(List<Courses> courses) {  
    this.courses = courses;  
} 

public void addCourse(Courses course) {
	courses.add(course);
}


}

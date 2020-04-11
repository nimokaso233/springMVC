package SpringProject.StudentCourse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity(name="Courses")
@Table(name="Courses",uniqueConstraints = {@UniqueConstraint(columnNames = "c_id")})

public class Courses {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="c_id")
private long id;

@Column(name="Department")
private String dp;

@Column(name="course")
private String cname;

public long getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getDepart() {  
    return dp;  
}  
public void setDepart(String department) {  
    this.dp = department;  
} 

public String getCourse() {  
    return cname;  
}  
public void setCourse(String course) {  
    this.cname = course;
}


}

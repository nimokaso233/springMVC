package SpringProject.StudentCourse.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import SpringProject.StudentCourse.entity.Courses;
import SpringProject.StudentCourse.entity.Student;
import SpringProject.StudentCourse.service.StudentService;



@Controller
public class editStudentController {
	
	@Autowired
	
	private StudentService studentService;
	
	public void setStudent(StudentService studentService) {
		this.studentService=studentService;
	}
	
	//index page
    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String defaultPage(ModelMap map) {
		return "redirect:/login";
	}
    
   //response to login
    @RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@PathVariable("email") String email, ModelMap m) {
    	Student s=studentService.getStudentByEmail(email);
    	m.addAttribute(s);
    	
		return "redirect:/courseregister";
	}
    
	//register and redirect to login page
    @RequestMapping(value = "/register",  method = RequestMethod.GET)
	public String addStudent(
			@ModelAttribute(value = "student") Student student,
			BindingResult result) {
		studentService.addStudent(student); 
    	
		return "redirect:/login";
	}
	
	// if fail in login
    @RequestMapping(value = "/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
        model.addAttribute("error", "true");
        return "login";
 
    }
    
	//response to add course
    @RequestMapping(value = "/courseregister/{name}/{dp}", method = RequestMethod.GET)
    
   	public String addCourse(@PathVariable("name") String cname,
   			@PathVariable("dp") String dp,
   			@ModelAttribute(value = "student") Student student,
   			@RequestParam(value="submit", required=true) String submit) {
    	Courses c=new Courses();
    	c.setCourse(cname);
    	c.setDepart(dp);
    	
   		studentService.addCourse(student.getId(), c);
   		
   		return "redirect:success";
   	}

    //logout
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
 
        model.addAttribute("message",
                "You have successfully logged off from application !");
        return "logout";
 
    }
    
	
	//add course successfully redirect to success page
    @RequestMapping(value="/success", method=RequestMethod.POST)
    public String success(@ModelAttribute(value="student") Student s, @ModelAttribute(value="course") Courses c) {
    	
    	return "success";
    	
    }
    
	
  
	

}

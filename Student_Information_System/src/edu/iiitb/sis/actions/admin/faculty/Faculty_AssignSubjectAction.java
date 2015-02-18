package edu.iiitb.sis.actions.admin.faculty;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.AssignCourseDao;
import edu.iiitb.sis.model.Admin_Assign_Course2F;

public class Faculty_AssignSubjectAction extends ActionSupport implements SessionAware,ModelDriven<Admin_Assign_Course2F> {
	
	private static final long serialVersionUID = 1L;
	private Admin_Assign_Course2F  AACF = new Admin_Assign_Course2F();
	// AACF mODEL class Object
	 AssignCourseDao assignCourse;
	 
	 private String facultyname;
	 private String course_names;
	  
	 
	 
	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	public String getCourse_names() {
		return course_names;
	}

	public void setCourse_names(String course_names) {
		this.course_names = course_names;
	}

	private String message;
	// Method Execute used for retrieving the course list and the Faculty List
		public String execute()
	{
		
		
		assignCourse = new AssignCourseDao();
		assignCourse.Retrieve_facultyname_coursename_function(AACF);
	   				
		return "addedcourse";
		

	}

		//Method for Updating Database with Faculty_course
		 
		public String UpdateFacultyCourse()
		{
			System.out.println("hereeee");
			assignCourse=new AssignCourseDao();
			assignCourse.assignCourses_mainFunction(facultyname,course_names);
			
			
			return "success";
			
		}
		
		
	public Admin_Assign_Course2F getModel() 
	{
		return AACF;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}

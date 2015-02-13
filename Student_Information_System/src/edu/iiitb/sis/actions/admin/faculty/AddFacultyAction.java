package edu.iiitb.sis.actions.admin.faculty;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.faculty.facultyDao;
import edu.iiitb.sis.model.Faculty;

public class AddFacultyAction extends ActionSupport implements ModelDriven<Faculty> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Faculty facultyModelObj=new Faculty();
	private String message;
	
	public String execute()
	{
		 facultyDao facultyDaoObj=new facultyDao();
		message=facultyDaoObj.addFaculty(facultyModelObj);
		if(!message.equalsIgnoreCase("success"))
			return "success";
		else
			return "failure";
		
	}
	public String pageRedirect()
	{
		return "success";
	}
	
	public Faculty getFacultyModelObj() {
		return facultyModelObj;
	}


	public void setFacultyModelObj(Faculty facultyModelObj) {
		this.facultyModelObj = facultyModelObj;
	}


	public Faculty getModel() {
		// TODO Auto-generated method stub
		return facultyModelObj;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

		
	
}

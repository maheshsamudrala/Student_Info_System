package edu.iiitb.sis.actions.admin.faculty;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.faculty.UpdateFacultyDao;
import edu.iiitb.sis.model.Faculty;

public class UpdateFacultyDetailsAction extends ActionSupport implements ModelDriven<Faculty>
{
	private static final long serialVersionUID = 1L;
	Faculty facultyModelObj=new Faculty();
	private String message;
	UpdateFacultyDao updataFacultyDaoObj=new UpdateFacultyDao();
	public String execute()
	{
		message=updataFacultyDaoObj.updateFaculty(facultyModelObj);
		return message;	
	}
	public Faculty getModel()
	{
		return facultyModelObj;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
}

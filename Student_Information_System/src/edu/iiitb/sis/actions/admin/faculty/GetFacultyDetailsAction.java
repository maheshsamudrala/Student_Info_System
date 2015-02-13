package edu.iiitb.sis.actions.admin.faculty;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.faculty.GetFacultyDetailsDao;
import edu.iiitb.sis.model.Faculty;

public class GetFacultyDetailsAction extends ActionSupport implements ModelDriven<Faculty> 
{

	
	private static final long serialVersionUID = 1L;
	Faculty facultyModelObj=new Faculty();
	private String message;
	private String searchKey;
	GetFacultyDetailsDao facultyDetailsGetDao=new GetFacultyDetailsDao();
	public String execute()
	{
		facultyDetailsGetDao.getFacutyDetails(facultyModelObj,searchKey);
		 System.out.println(facultyModelObj.getFacultyName());
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

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	
	
	
	
}

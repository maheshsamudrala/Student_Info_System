package edu.iiitb.sis.actions.admin.faculty;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.iiitb.sis.dao.admin.faculty.facultySelectDao;

public class SearchFacultyAction extends ActionSupport
{
	
	
	private static final long serialVersionUID = 1L;
	private String message;
	private List<String> facultynamelist=new ArrayList<String>();
	public String execute()
	{
		facultySelectDao facultySelectDaoObj=new facultySelectDao();
		facultynamelist=facultySelectDaoObj.getFacutyNames();
	System.out.println(facultynamelist.get(0));
		
		return "success";
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getFacultynamelist() {
		return facultynamelist;
	}
	public void setFacultynamelist(List<String> facultynamelist) {
		this.facultynamelist = facultynamelist;
	}
	

}

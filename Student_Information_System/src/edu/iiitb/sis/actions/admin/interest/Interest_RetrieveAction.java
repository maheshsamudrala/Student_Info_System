package edu.iiitb.sis.actions.admin.interest;

import java.util.ArrayList;

import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.Interest_RetrieveDao;
import edu.iiitb.sis.model.Interest_Retrieve;

public class Interest_RetrieveAction implements ModelDriven<Interest_Retrieve> {
	
	
	
	private Interest_Retrieve interest = new Interest_Retrieve(); 
	Interest_RetrieveDao interests_name = new Interest_RetrieveDao();
	public String success;
	
	public String execute()
	{
		interest.setInterests(interests_name.retrieveInterest(interest));
		System.out.println(interest.getInterests().get(0));
		
		return "success";
	}
	
	public Interest_Retrieve getInterest()
	{
		return interest;
	}

	public void setInterest(Interest_Retrieve interest)
	{
		this.interest = interest;
	}

	public Interest_Retrieve getModel()
	{
		return interest;
	}

	

}

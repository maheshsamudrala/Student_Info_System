package edu.iiitb.sis.actions.student;

import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.student.StudentEditDao;
import edu.iiitb.sis.model.StudentEdit;

public class StudentEditAction implements ModelDriven<StudentEdit>{
	private StudentEdit edit = new StudentEdit();
	private String success;
	StudentEditDao edited = new StudentEditDao();
	public String execute()
	{
		success = edited.EditDetails(edit);
		System.out.println("hi i m in action class");
		return success;
	}
	
	public StudentEdit getEdit() {
		return edit;
	}

	public void setEdit(StudentEdit edit) {
		this.edit = edit;
	}

	public StudentEdit getModel() {
		// TODO Auto-generated method stub
		return edit;
	}


	

	
}

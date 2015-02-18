package edu.iiitb.sis.actions.student;



import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.student.Student_Search_Dao;
import edu.iiitb.sis.model.Student_Search_Model;

public class StudentSearchAction implements ModelDriven<Student_Search_Model> {

	
	Student_Search_Model obj = new Student_Search_Model();	
	
	
	public Student_Search_Model getObj() {
		return obj;
	}

	public void setObj(Student_Search_Model obj) {
		this.obj = obj;
	}
	
	
	Student_Search_Dao service = new Student_Search_Dao();
		
		public String execute(){
			if(service.search(obj))
			{
				return "success";
			}	
			else
				return "failure";
		}

		public Student_Search_Model getModel() {
			// TODO Auto-generated method stub
			return obj;
		}

				
}



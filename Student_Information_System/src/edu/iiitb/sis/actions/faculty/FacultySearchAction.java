package edu.iiitb.sis.actions.faculty;



import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.faculty.Faculty_Search_Dao;
import edu.iiitb.sis.model.Faculty_Search_Model;


public class FacultySearchAction extends ActionSupport implements SessionAware,ModelDriven<Faculty_Search_Model> {

	
	private static final long serialVersionUID = 1L;
	Faculty_Search_Model obj = new Faculty_Search_Model();	
	
	
	public Faculty_Search_Model getObj() {
		return obj;
	}

	public void setObj(Faculty_Search_Model obj) {
		this.obj = obj;
	}
	
	
	/*
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;

	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileContentType() {
		return myFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	
	public String destPath;

	
*/
	Faculty_Search_Dao service = new Faculty_Search_Dao();
		
		public String execute(){
//			destPath="/home/paras/workspace/Student_Information_System/WebContent/images";
/*			
			try {
				File destFile = new File(destPath,myFileFileName);
				FileUtils.copyFile(myFile, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
*/			
			if(service.search(obj /*, "images/"+myFileFileName*/)){
				System.out.println("hul");
				return "success";
			}	else
				return "failure";
		}

		public Faculty_Search_Model getModel() {
			// TODO Auto-generated method stub
			return obj;
		}

		public void setSession(Map<String, Object> arg0) {
			// TODO Auto-generated method stub
			
		}

		

				
}



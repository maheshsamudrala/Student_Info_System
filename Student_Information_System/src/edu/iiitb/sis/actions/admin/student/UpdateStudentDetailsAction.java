package edu.iiitb.sis.actions.admin.student;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.actions.authentication.SessionBean;
import edu.iiitb.sis.dao.admin.student.StudentDao;
import edu.iiitb.sis.model.Student;

public class UpdateStudentDetailsAction extends ActionSupport implements ModelDriven<Student>,SessionAware
{
	private static final long serialVersionUID = 1L;
	private StudentDao studentDao=new StudentDao();
	private Student studentObj=new Student();
	private String message;
	
	private Map<String,Object> sessionMap=null;
	private ArrayList<String> announcementList=new ArrayList<String>();
	private ArrayList<String> newsList=new ArrayList<String>();
	private String loginName;
	private SessionBean sessionBean;

	public String execute()
	{
		studentDao=new StudentDao();
		message=studentDao.updateStudent(studentObj);
		if(message.equalsIgnoreCase("success"))
		{
			return "success";

		}
		else
		{
			return "failure";

		}
	}
	
	public void setSession(Map<String, Object> map)
	{
		this.sessionMap=map;
		this.sessionBean=(SessionBean) sessionMap.get("Session");
		setSessionValues();
	}
	private void setSessionValues()
	{
		this.announcementList=sessionBean.getAnnouncementList();
		this.newsList=sessionBean.getNewsList();
		this.loginName=sessionBean.getName();
	}
	
	public String getMessage()
	{
		return message;
	}


	public void setMessage(String message) 
	{
		this.message = message;
	}


	public Student getModel() 
	{
		return studentObj;
	}
	
	
	public Student getStudentObj() 
	{
		return studentObj;
	}

	public void setStudentObj(Student studentObj) 
	{
		this.studentObj = studentObj;
	}

	public ArrayList<String> getAnnouncementList() {
		return announcementList;
	}

	public void setAnnouncementList(ArrayList<String> announcementList) {
		this.announcementList = announcementList;
	}

	public ArrayList<String> getNewsList() {
		return newsList;
	}

	public void setNewsList(ArrayList<String> newsList) {
		this.newsList = newsList;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}
	
	
}

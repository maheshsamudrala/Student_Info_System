package edu.iiitb.sis.actions.admin.student;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.actions.authentication.SendEmail;
import edu.iiitb.sis.actions.authentication.SessionBean;
import edu.iiitb.sis.dao.admin.student.StudentDao;
import edu.iiitb.sis.model.Student;
import edu.iiitb.sis.model.UserDetails;

public class AddStudentAction extends ActionSupport implements SessionAware,ServletRequestAware,ModelDriven<Student>
{
	
	private static final long serialVersionUID = 1L;
	private HttpServletRequest servletRequest;
	private Student studentObj=new Student();
	private StudentDao studentDao;
	private String message;
	private UserDetails user=new UserDetails();
	private SendEmail sendEmail=new SendEmail();
	private Map<String,Object> sessionMap=null;
	private ArrayList<String> announcementList=new ArrayList<String>();
	
	public String execute()
	{
		studentDao=new StudentDao();
		System.out.println(studentObj.getDateOfBirth());
		String destpath = servletRequest.getSession().getServletContext().getRealPath("/");
		studentObj.setImagePath(destpath);
		SessionBean sessionBean=(SessionBean) sessionMap.get("Session");
		System.out.println(sessionBean);
		message=studentDao.addStudent(studentObj);
		
		announcementList=sessionBean.getAnnouncementList();
		if(message.equalsIgnoreCase("success"))
		{
			user.setName(studentObj.getStudentName());
			user.setEmail(studentObj.getEmail());
			user.setPassword("password");
			user.setLoginId(studentObj.getStudentRollNo());
			message=sendEmail.sendUserDetailsToMail(user);
			return "success";
		}
		else
		{
			return "failure";
		}
		
	}
	public ArrayList<String> getAnnouncementList() {
		return announcementList;
	}
	public void setAnnouncementList(ArrayList<String> announcementList) {
		this.announcementList = announcementList;
	}
	public String pageRedirect()
	{
		return "success";
	}
		
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
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

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	public void setSession(SessionBean sessionBean) 
	{
		// TODO Auto-generated method stub
		
	}
	public void setSession(Map<String, Object> map)
	{
		this.sessionMap=map;
	}
	

}

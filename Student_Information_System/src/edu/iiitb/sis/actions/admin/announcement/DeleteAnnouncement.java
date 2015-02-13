package edu.iiitb.sis.actions.admin.announcement;

import com.opensymphony.xwork2.ActionSupport;

import edu.iiitb.sis.dao.admin.announcement.AnnouncementDao;

public class DeleteAnnouncement extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	private String message;
	private String id;
	private AnnouncementDao announcementDao=new AnnouncementDao();
	public String execute()
	{
		message=announcementDao.deleteAnnouncement(id);
		if(message.equalsIgnoreCase("success"))
		{
			return "success";

		}
		else
		{
			return "failure";

		}
	}
	
	public String pageRedirect()
	{
		return "success";
	}
	
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
}

package edu.iiitb.sis.actions.admin.announcement;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.dao.admin.announcement.AnnouncementDao;
import edu.iiitb.sis.model.Announcement;;
public class AddAnnouncementAction extends ActionSupport implements ModelDriven<Announcement>
{
	
	private static final long serialVersionUID = 1L;
	private Announcement announcement=new Announcement();
	private String message;
	private AnnouncementDao announcementDao=new AnnouncementDao();
	
	public String execute()
	{
		message=announcementDao.addAnnouncement(announcement);
		
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


	public Announcement getModel() 
	{
		return announcement;
	}

}

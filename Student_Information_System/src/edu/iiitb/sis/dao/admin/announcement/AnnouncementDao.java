package edu.iiitb.sis.dao.admin.announcement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import edu.iiitb.sis.dbUtil.ConnectionPool;
import edu.iiitb.sis.model.Announcement;

public class AnnouncementDao
{

	public String addAnnouncement(Announcement announcement)
	{
		Connection con=ConnectionPool.getConnection();
		PreparedStatement addAnnouncementStmt=null;
		String query;
		try
		{
			query="insert into announcements(announcements_id,announcements_info) values(?,?) ";
			addAnnouncementStmt=con.prepareStatement(query);
			addAnnouncementStmt.setString(1,announcement.getAnnouncementId());
			addAnnouncementStmt.setString(2, announcement.getAnnouncementText());
			addAnnouncementStmt.executeUpdate();
			addAnnouncementStmt.close();
			con.close();
			return "success";	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}
			
	}
	public String deleteAnnouncement(String announcement_Id)
	{
		Connection con=ConnectionPool.getConnection();
		PreparedStatement deleteAnnouncementStmt=null;
		String query;
		try
		{
			query="delete from announcements where announcements_id=?";
			deleteAnnouncementStmt=con.prepareStatement(query);
			deleteAnnouncementStmt.setString(1, announcement_Id);
			
			if(deleteAnnouncementStmt.executeUpdate()>0)
			{
				return "success";
			}
			else
			{
				return "Announcement ID doesn't Exist.";
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}
	}
	
}

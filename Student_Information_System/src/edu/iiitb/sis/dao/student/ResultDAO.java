package edu.iiitb.sis.dao.student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import edu.iiitb.sis.dbUtil.ConnectionPool;
import edu.iiitb.sis.model.Result_Model;

public class ResultDAO {
	
	
	
	public boolean check(Result_Model obj)
	{
		ResultSet rs;

		int i;
		try {
			Connection con = ConnectionPool.getConnection();
			Statement statement;
			statement = con.createStatement();
			rs = statement.executeQuery("Select * from marks join course on marks.course_id=course.course_id;");
			

			ArrayList<String> course =new ArrayList<String>();
			ArrayList<String> mark =new ArrayList<String>();
			ArrayList<String> results =new ArrayList<String>();
			ArrayList<String> rollnos =new ArrayList<String>();
			ArrayList<String> grades =new ArrayList<String>();
			//ArrayList<String> courseName = new ArrayList<String>();
			while(rs.next())
			{
				course.add(rs.getString("course_name"));
				mark.add(rs.getString("subject_marks"));
				results.add(rs.getString("result"));
				rollnos.add(rs.getString("student_rollno"));
				grades.add(rs.getString("grade"));
				System.out.println(grades);
			}
			//obj.setCourseName(courseName);
			obj.setCourse(course);
			obj.setGrades(grades);
			obj.setMark(mark);
			obj.setResults(results);
			obj.setRollnos(rollnos);
		
			rs.close();
			statement.close();
			con.close();}
		 catch (SQLException e)
		 {
			e.printStackTrace();
		 }
		
	
		
	
		return true;
	}
}	


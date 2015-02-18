package edu.iiitb.sis.dao.faculty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.iiitb.sis.dbUtil.ConnectionPool;
import edu.iiitb.sis.model.Faculty_Search_Model;

public class Faculty_Search_Dao {
	
	public boolean search(Faculty_Search_Model obj) {
		System.out.println("ra");
		System.out.println(obj.getFaculty_id());

		try {
			Connection con=ConnectionPool.getConnection();
			Statement statement = con.createStatement();
//System.out.println("ra");
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info_system", "root", "paras");
//		Statement statement = connection.createStatement();

		ResultSet rs;
//	System.out.println(obj.getStudent_rollno());
		rs = statement.executeQuery("SELECT * FROM student_info_system.faculty WHERE faculty_id='"+obj.getFaculty_id()+"'");
	System.out.println("ra");
		if(rs.next()){
	System.out.println("hl");
			obj.setFaculty_image(rs.getString("faculty_image"));
System.out.println(obj.getFaculty_image());
			obj.setFaculty_name(rs.getString("faculty_name"));
			obj.setFaculty_id(rs.getString("faculty_id"));
//	System.out.println(obj.getStudent_rollno());
			obj.setFaculty_phoneno(rs.getString("faculty_phoneno"));
			obj.setFaculty_mailid(rs.getString("faculty_mailid"));
			obj.setFaculty_qualification(rs.getString("faculty_qualification"));
//	System.out.println(obj.getFaculty_qualification());

			rs.close();
			statement.close();
			con.close();
//			return true;
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}



		
		try {
			Connection con=ConnectionPool.getConnection();
			Statement statement = con.createStatement();

//		Class.forName("com.mysql.jdbc.Driver");
//		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info_system", "root", "paras");
//		Statement statement = connection.createStatement();
		ResultSet rs2;
//	System.out.println(obj.getStudent_rollno());
		rs2 = statement.executeQuery("SELECT course_name FROM course WHERE course_id IN (SELECT course_id FROM faculty_course WHERE faculty_id='"+obj.getFaculty_id()+"')");
	System.out.println("ra");
//		if(rs1.next()){
//	System.out.println("hl");
//			obj.setFaculty_course(rs1.getString("course_name"));
//			System.out.println(obj.getFaculty_course());
			ArrayList<String> course_list = new ArrayList<String>();
			while(rs2.next()){
//				String ra = rs1.getString("interest_name");
//				System.out.println(ra);
				course_list.add(rs2.getString("course_name"));
			}
			
			StringBuilder sb = new StringBuilder();			
			for (String s : course_list)
			{
			    sb.append(s);
			    sb.append("   ");
			}			
			
			obj.setFaculty_course(sb);

//			System.out.println(course_list);
//			obj.setFaculty_course(course_list);
			System.out.println(obj.getFaculty_course());
			rs2.close();
			statement.close();
			con.close();
			return true;	
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return false;
	}



}

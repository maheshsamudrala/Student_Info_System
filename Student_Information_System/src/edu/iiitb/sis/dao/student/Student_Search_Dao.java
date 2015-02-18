package edu.iiitb.sis.dao.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.iiitb.sis.dbUtil.ConnectionPool;
import edu.iiitb.sis.model.Student_Search_Model;



public class Student_Search_Dao {
	
	public boolean search(Student_Search_Model obj)
	{
		System.out.println(obj.getStudent_rollno());

		try
		{
			Connection con=ConnectionPool.getConnection();
			Statement statement = con.createStatement();
			/*System.out.println("ra");
				Class.forName("com.mysql.jdbc.Driver");
					Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info_system", "root", "paras");
					Statement statement = connection.createStatement();
			*/
		ResultSet rs;
		//	System.out.println(obj.getStudent_rollno());
		rs = statement.executeQuery("select * from student where student_rollno='"+obj.getStudent_rollno()+"'");
		//	System.out.println("ra");
		if(rs.next())
		{
			//	System.out.println("hl");
			obj.setStudent_image(rs.getString("student_image"));
			//			System.out.println("ch");
			//System.out.println(obj.getStudent_image());
			obj.setStudent_name(rs.getString("student_name"));
			obj.setStudent_rollno(rs.getString("student_rollno"));
			System.out.println(obj.getStudent_rollno());
			obj.setStudent_phoneno(rs.getString("student_phoneno"));
			obj.setStudent_mailid(rs.getString("student_mail"));
			obj.setStudent_address(rs.getString("student_address"));
			//	System.out.println(obj.getStudent_address());
			//			Date dt = new Date();
			Date ra = rs.getDate("student_dob");
			//			obj.setStudent_dob(ra.toString());
			//	System.out.println(ra);
			//	System.out.println(dt);
			//	System.out.println("ra");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
			String date = sdf.format(ra);
			obj.setStudent_dob(date);
			//	System.out.println(date);
			rs.close();
			statement.close();
			con.close();
			//			return true;
		}
		
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}

	try
	{
			Connection con=ConnectionPool.getConnection();
			Statement statement = con.createStatement();

			ResultSet rs1;
		//	System.out.println(obj.getStudent_rollno());
		//	rs1 = statement.executeQuery("SELECT interest.interest_name FROM interest WHERE interest.interest_id IN (SELECT interest_id FROM student_interest WHERE student_rollno='"+obj.getStudent_rollno()+"')");
		rs1 = statement.executeQuery("SELECT interest_name FROM student_interest WHERE student_rollno='"+obj.getStudent_rollno()+"'");
		//	System.out.println("ra");
		//	if(rs1.next()){
		//	System.out.println("hl");
		//	obj.setStudent_interest(rs1.getString("interest_name"));
		//	System.out.println(obj.getStudent_interest());
			ArrayList<String> interest_list = new ArrayList<String>();
			while(rs1.next())
			{
				//String ra = rs1.getString("interest_name");
				//System.out.println(ra);
				interest_list.add(rs1.getString("interest_name"));
			}
			
			
StringBuilder sb = new StringBuilder();			
			for (String s : interest_list)
			{
			    sb.append(s);
			    sb.append("   ");
			}			
			
			obj.setStudent_interest(sb);
System.out.println(obj.getStudent_interest());			
			
			
			
			
			
			
//			System.out.println(interest_list);
//			obj.setStudent_interest(interest_list);
//		System.out.println(obj.getStudent_interest());
			rs1.close();
			statement.close();
			con.close();
//			return true;	
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
		rs2 = statement.executeQuery("SELECT course.course_name FROM course WHERE course.course_id IN (SELECT course_id FROM student_course WHERE student_rollno='"+obj.getStudent_rollno()+"')");
//	System.out.println("ra");
//		if(rs1.next()){
//	System.out.println("hl");
//			obj.setStudent_course(rs1.getString("course_name"));
//			System.out.println(obj.getStudent_course());
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
			
			obj.setStudent_course(sb);
System.out.println(obj.getStudent_course());			
					
//			System.out.println(course_list);
//			obj.setStudent_course(course_list);
//			System.out.println(obj.getStudent_course());
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

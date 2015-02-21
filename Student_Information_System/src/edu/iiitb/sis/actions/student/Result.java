package edu.iiitb.sis.actions.student;
	import java.io.InputStream;
	import java.sql.Blob;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class Result  {
		public String grade;
		public String result;
		public int marks;
		public String student_rollno;
		
		
		public String getGrade() {
			return grade;
		}


		public void setGrade(String grade) {
			this.grade = grade;
		}


		public String getResult() {
			return result;
		}


		public void setResult(String result) {
			this.result = result;
		}


		public int getMarks() {
			return marks;
		}


		public void setMarks(int marks) {
			this.marks = marks;
		}


		public String getStudent_rollno() {
			return student_rollno;
		}


		public void setStudent_rollno(String student_rollno) {
			this.student_rollno = student_rollno;
		}


		public String execute() {
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info_system","root","root");
				
				PreparedStatement ps=((java.sql.Connection) con).prepareStatement("select * from marks where student_rollno="+getStudent_rollno()+";");
				//ps.setString(1,ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){    
				   setGrade(rs.getString("grade"));  
				   setResult(rs.getString("result"));  
				   setMarks(rs.getInt("marks"));  
				   setStudent_rollno(rs.getString("student_rollno"));
				   }
			rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			 		return "Success";
			
			
		}
	}




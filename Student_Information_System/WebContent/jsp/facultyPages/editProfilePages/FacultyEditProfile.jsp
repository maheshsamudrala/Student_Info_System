<!-- THIS IS THE ADMIN STATIC PAGE  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

        	<%@include file="/jsp/facultyPages/headPage.jsp" %>
        
        <title> Welcome to Student Information System</title>
</head>
<body style="background-color:#848484">
<%@include file="/jsp/facultyPages/topNavBar.jsp" %>
	<%@include file="/jsp/facultyPages/sideNavBar.jsp"%>
<!-- SECOND PART OF THE PAGE -->
<div class="col-lg-7">

<div class="mainframe">
<s:property value="message"/>
<form action="FacultyEdit" method="post" >
		<br><br>
		 <center><h1>Edit Faculty Profile</h1></center>
		 <br><br><br><br>
		<div class="form-group">
      	<label  class="col-lg-2 control-label">Phone No:</label>
      	<div class="col-lg-4">
     		<div class="input-group">
     			<span class="input-group-addon" id="basic-addon1">
     			  <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
     			</span>
       			<input type="text" class="form-control" placeholder="Type phone no. here" name="phone">
       		 </div>       							
       	</div>
      	<br><br>
      </div>	 	
      <div class="form-group">
      	<label  class="col-lg-2 control-label">Qualification:</label>
      	<div class="col-lg-4">
     		<div class="input-group">
     			<span class="input-group-addon" id="basic-addon1">
     			  <span class="glyphicon glyphicon-book" aria-hidden="true"></span>
     			</span>
       			<input type="text" class="form-control" placeholder="Type qualification here" name="qualification">
       		 </div>       							
       	</div>
      	<br><br><br>
 	<div class="form-group">
      	<div class="col-lg-10 col-lg-offset-2"><input type="submit" value="Submit"  class="btn btn-primary" />
       	<input type="reset" class="btn btn-primary" name="Reset"/>
     	 </div>
     </div>
	
</div>

 
      
 
			
	</form>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</div>

</div>

		<%@include file="/jsp/facultyPages/newsAnnouncement.jsp" %>

    
    
</body>
</html>
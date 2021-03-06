<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <%@include file="/jsp/adminPages/headPage.jsp" %>

</head>
<body style="background-color:#848484">
	 <%@include file="/jsp/adminPages/topNavBar.jsp" %>
	 <%@include file="/jsp/adminPages/sideNavBar.jsp" %>
	<div class="col-lg-7">
	<center>
	<div class="mainframe">
		<br><br>
			<s:set name="msg" value="message"/>
  		<s:if test="%{#msg=='success'}">
  			<h2 align="center">Course Added Successfully.</h2>
  		</s:if>
  		<s:else>
  			<h2 align="center"><label class="control-label">Course Name Already Exists. </label></h2>			
  		</s:else>
		
		<!-- Fields to Add Course  -->
	
		<form class="form-horizental" action="AddCourse" method="post" enctype="multipart/form-data" >
  					<div class="form-group">
      					<label  class="col-lg-4 control-label">Course Name</label> 
     					 <div class="col-lg-4">
     					 		<input type="text" class="form-control" placeholder="Type Course Name here" name="courseName" required>
       					 </div>
     					  <br><br>
   					 </div>
   					
  					<div class="form-group">
      					<label  class="col-lg-4 control-label">Credits</label>
     					 <div class="col-lg-4">
       							 <input type="text" class="form-control"  placeholder="Number of credits" name="courseCredits" required>
     					 </div>
     					<br><br><br> 
   					 </div>
   					
   					<div class="form-group">
      						<div class="col-lg-12 col-lg-offset-0"><input type="submit" value="Submit"  class="btn btn-primary" />
       						 <input type="reset" class="btn btn-default" name="Reset"/>
     						 </div>
    				</div>
   					 
  				</form>
  							<br><br><br><br>
  							<br><br><br><br>
  							
	</div>
	</center>
	</div>
	<%@include file="/jsp/adminPages/newsAnnouncement.jsp" %>
	
</body>
</html>
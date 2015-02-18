<!-- THIS IS THE ADMIN STATIC PAGE  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
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


<center><h3>Assign Grades Module</h3></center>

<div class="col-lg-7">
		<form class="form-horizental" action="AssignGradesStudentDetails" method="post">
			<div class="form-group">
			  <div class="col-lg-2"></div>
			  <div class="col-lg-6">
			  		<div class="form-group">
      					<label  class="col-lg-4 control-label">Course Name</label>
     					 <div class="col-lg-8">
     					 		<sx:autocompleter list="courselist" name="searchKey" showDownArrow="false"></sx:autocompleter>
       						<!-- 	 <input type="text" class="form-control"  placeholder="Type Roll Number here" name="searchKey" required> -->
     					 </div>
     					<br><br> 
   					 </div>
			  </div>
			  <div class="col-lg-1">
			  	<div class="form-group">
      				<div class="col-lg-10 col-lg-offset-2"><input type="submit" value="Submit"  class="btn btn-primary" />
      			</div>	
			  </div>
			</div>
		</div>
		</form>
	</div>

</div>

</div>

		<%@include file="/jsp/facultyPages/newsAnnouncement.jsp" %>

</body>
</html>
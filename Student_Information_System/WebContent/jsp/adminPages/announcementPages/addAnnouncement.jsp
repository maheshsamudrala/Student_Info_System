<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <%@include file="/jsp/adminPages/headPage.jsp" %>
</head>
<body>
	 <%@include file="/jsp/adminPages/topNavBar.jsp" %>
	 <%@include file="/jsp/adminPages/sideNavBar.jsp" %>
	<div class="col-lg-7">
		<div class="mainframe">
		<br><br>
		<s:set name="msg" value="message"/>
  		<s:if test="%{#msg=='success'}">
  			<h2 align="center">Announcement Added Successfully</h2>
  		</s:if>
  		<s:else>
  		<h2 align="center"><label class="control-label"><s:property value="msg"/> </label></h2>			
  		</s:else>
		<form class="form-horizental" action="AddAnnouncement" method="post"  >
  				<div class="form-group">
      				<label  class="col-lg-4 control-label">Announcement ID</label> 
     				 <div class="col-lg-4">
							<input type="text" class="form-control" placeholder="Type Announcement ID here" name="id" >     			 		
      				</div>
     			  <br><br>
   				 </div>
   				 <div class="form-group">
      				<label  class="col-lg-4 control-label">Announcement </label> 
     				 <div class="col-lg-4">
							<textarea rows="3" class="form-control" placeholder="Type Announcement here" name="announcement_text" cols="15"></textarea>     			 		
      				</div>
     			  <br><br>
   				 </div>
   		</form>
   		<br><br><br>
   			</div>
   			</div>		 
</body>
</html>
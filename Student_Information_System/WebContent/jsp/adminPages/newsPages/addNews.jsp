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
  			<h3 align="center">News Added Successfully</h3><br><br>
  		</s:if>
  		<s:else>
  		<h3 align="center"><label class="control-label"><s:property value="msg"/> </label></h3>	<br><br>		
  		</s:else>
		<form class="form-horizental" action="AddNews" method="post"  >
  				<div class="form-group">
      				<label  class="col-lg-4 control-label">News ID</label> 
     				 <div class="col-lg-4">
							<input type="text" class="form-control" placeholder="Type News ID here" name="newsId" >     			 		
      				</div>
     			  <br><br>
   				 </div>
   				 <div class="form-group">
      				<label  class="col-lg-4 control-label">News </label> 
     				 <div class="col-lg-4">
							<textarea rows="3" class="form-control" placeholder="Type News here" name="newsText" cols="15"></textarea>     			 		
      				</div>
     			  
   				 </div>
   				 <br><br><br>
     			  <br><br><br>
   				  <div class="form-group">
      						<div class="col-lg-10 col-lg-offset-4"><input type="submit" value="Submit"  class="btn btn-primary" />
       						 <input type="reset" class="btn btn-default" name="Reset"/>
     						 </div>
    				</div>
   		</form>
   		<br><br><br>
   			</div>
   			</div>	
   		<%@include file="/jsp/adminPages/newsAnnouncement.jsp" %>
   				 
</body>
</html>
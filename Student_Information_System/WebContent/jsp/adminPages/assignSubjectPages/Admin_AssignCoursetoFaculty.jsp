<!-- THIS IS THE ADMIN STATIC PAGE  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="edu.iiitb.sis.actions.admin.faculty.Faculty_AssignSubjectAction"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
       
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
          <%@include file="/jsp/adminPages/headPage.jsp" %>
 
 
     <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
  
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
    
    
  
   <link href="<%=request.getContextPath()%>/sis-bootstrap/font-awesome/css/bootstrap-multiselect.css"
        rel="stylesheet" type="text/css" />
    <script src="<%=request.getContextPath()%>/sis-bootstrap/js/bootstrap-multiselect.js"
        type="text/javascript"></script>
    
    
    
    <link rel="icon" type="image/ico" href="icon.ico"/>
        
        <title> Welcome to Student Information System</title>
</head>
<body style="background-color:#848484">
	 <%@include file="/jsp/adminPages/topNavBar.jsp" %>
	 <%@include file="/jsp/adminPages/sideNavBar.jsp" %>


<!-- SECOND PART OF THE PAGE -->
<div class="col-lg-7">

<div class="mainframe">


 <script type="text/javascript">
        $(function () {
            $('#course_name').multiselect({
                includeSelectAllOption: true,
                enableFiltering: true
            });
            
    
            $('#btnSelected').click(function () {
                var selected = $("#course_name option:selected");
                var message = "";
                selected.each(function () {
                    message += $(this).text()+"\n";
                });
       			alert(message);
                $("#courseSelect").submit();
            });
        });
    </script>



<div class="container">
<form name="courseSelect" id="courseSelect" action="selectcourseaction" method="post">
<div class="row">
<div class = "col-sm-4">
<div class="form-group">
      <label for="facultylist">Select Faculty :</label>
    <select id="facultylist" name="facultyname" >  
    <s:iterator value="facultylist" >  
 		<option value= "<s:property />">
        <s:property /></option>
  </s:iterator> 
    </select>

</div>
<div class = "col-sm-4">
      
	  <div class="form-group">
    <s:iterator value="courselist" ></s:iterator>      
 <label for="course_name">Select Courses :</label>  
  <select id="course_name" name="course_names"  multiple="multiple">  
   <s:iterator value="courselist" >  
 <option value= "<s:property />"> <s:property /></option>
    </s:iterator> 
    </select>
    <input type="button" id="btnSelected" value="Get Selected" />
</div>  
	
</div>
</div>
</div>
</form>

</div>
</div>
</div>
   	<%@include file="/jsp/adminPages/newsAnnouncement.jsp" %>

</body>
</html>
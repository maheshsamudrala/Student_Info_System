<!-- EDIT PROFILE OF STUDENT -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

        	<%@include file="/jsp/studentPages/headPage.jsp" %>
        
<title>Edit Profile Of Student</title>
</head>
<body style="background-color:#848484">

	<%@include file="/jsp/studentPages/topNavBar.jsp" %>
	<%@include file="/jsp/studentPages/sideNavBar.jsp"%>

<!-- SECOND PART OF THE PAGE -->
<div class="col-lg-7">
<center>
<div class="mainframe">
<form action="StudentEdit" method="post" >
		<br><br>
		 <center><h1>Edit Student Profile</h1></center>
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
      	<label  class="col-lg-2 control-label">Password</label>
      	<div class="col-lg-4">
     		<div class="input-group">
     			<span class="input-group-addon" id="basic-addon1">
     			  <span class="glyphicon glyphicon-lock" aria-hidden="true"></span> 
     			</span>
       			<input type="password" class="form-control" placeholder="********" name="password">
       		 </div>       							
       							  
      	</div>
      	<br><br>
      </div>
    		
    		<div class="form-group">
      	<label  class="col-lg-2 control-label">Address:</label>
      	<div class="col-lg-4">
     		<div class="input-group">
     			<span class="input-group-addon" id="basic-addon1">
     			  <span class="glyphicon glyphicon-home" aria-hidden="true"></span> 
     			</span>
       			<textarea class="form-control" rows="2" placeholder ="Type address here" name="address">
       			</textarea>
       		 </div>       							
       							  
      	</div>
      	<br><br>
      	<br>
      </div>	 
      
      <div class="form-group">
      	<label  class="col-lg-2 control-label">Interest:</label>
      	<div class="col-lg-4">
      	
      	
      <select id="a" name="a" multiple="multiple">

      <s:iterator value="interests">
 	     <option value="<s:property/>"><s:property/></option>
		</s:iterator>
</select>


<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>

<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
<link href="http://cdn.rawgit.com/davidstutz/bootstrap-multiselect/master/dist/css/bootstrap-multiselect.css"
    rel="stylesheet" type="text/css" />
<script src="http://cdn.rawgit.com/davidstutz/bootstrap-multiselect/master/dist/js/bootstrap-multiselect.js"
    type="text/javascript"></script>
<script type="text/javascript">
    $(function () {
        $('#a').multiselect({
            includeSelectAllOption: true
        });
    });
</script>

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
</center>
</div>
<%@include file="/jsp/studentPages/newsAnnouncement.jsp" %>
   

</body>
</html>
<!-- THIS IS THE ADMIN STATIC PAGE  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="edu.iiitb.sis.actions.admin.faculty.Faculty_AssignSubjectAction"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
       
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="<%=request.getContextPath()%>/sis-bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
 <link href="<%=request.getContextPath()%>/sis-bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
   <!-- Custom CSS -->
    <link href="<%=request.getContextPath()%>/sis-bootstrap/css/stylish-portfolio.css" rel="stylesheet" type="text/css"/>
     <!-- Custom Fonts -->
    <link href="<%=request.getContextPath()%>/sis-bootstrap/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    
    
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


<!-- FIRST PART OF THE PAGE -->
    <div class="navbar navbar-default " >
    <div class="col-lg-4"><p style="font-size:125%";> Admin</p></div>
    <div class="col-lg-4">
         <div class="navbar-collapse collapse navbar-responsive-collapse" style="text-align:center">
            
               <span style="color:black" class="glyphicon glyphicon-user gi-5x"></span>
               <b style="color:grey;font-size:175%">Student Information  System</b>
               <span style="color:black" class="glyphicon glyphicon-user gi-5x"></span>
         </div>    
         </div>
       <div class="col-lg-4">
     <p style="text-align:right"> <a href="#">Logout</a></p>
       
   
  </div>
</div>
   
   
<div class="col-lg-2">

<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i class="fa fa-home "></i>&nbsp;Home</a></li>
   
</ul>
</div>
<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i class="fa fa-user"></i>&nbsp; Add/Del Student</a></li>
   
</ul>
</div>

<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i  class="fa fa-user "></i>&nbsp;Add/Del Faculty</a></li>
   
</ul>
</div>
<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="list"><i class="fa fa-book fa-fw"></i>&nbsp;Update Coarse</a></li>
   
</ul>
</div>
<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i  class="fa fa-gear"></i>&nbsp;Interest Settings</a></li> 
   
</ul>
</div>
<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i  class="fa fa-gear"></i>&nbsp;Subject Settings</a></li> 
   
</ul>
</div>
<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i  class="fa fa-bullhorn"></i>&nbsp;Announcements</a></li> 
   
</ul>
</div>

<div class="frame1">
<ul class="nav nav-pills nav-stacked">
     <li  class="active"><a href="#"><i  class="fa fa-newspaper-o"></i>&nbsp;News</a></li> 
   
</ul>
</div>
</div>




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



















<!-- THIRD PART OF THE PAGE FOR ANNOUNCEMENTS AND NEWS -->
<div class="col-lg-3">
<div  class="ann">

   
<h3>ANNOUNCEMENTS</h3>
<marquee  onMouseOver="this.scrollAmount=1" onMouseOut="this.scrollAmount=2" scrollamount="2" direction="up" loop="true" width="100%">

	<li><a href="http://www.ndtv.com/article/cheat-sheet/barack-obama-s-thumbs-up-for-daredevil-stunt-riders-at-republic-day-parade-10-developments-653780?pfrom=home-lateststories"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Barack Obama's Thumbs Up for Daredevil Stunt Riders at Republic Day Parade: 10 Developments</i></a></li>
    <li><a href="http://sports.ndtv.com/australia-tri-series-2015/news/236589-tri-series-rain-gods-offer-india-lifeline-can-mahendra-singh-dhoni-co-take-it?pfrom=home-cricket"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Can MS Dhoni & Co. Take the Rain Gods' Lifeline? </a></li>
       <li><a href="http://auto.ndtv.com/news/indian-students-develop-vehicle-that-delivers-mileage-of-200km-l-733735?pfrom=home-auto"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Indian Students Develop Vehicle That Delivers Mileage of 200Km/l</a></li> 
           <li><a href="http://gadgets.ndtv.com/telecom/news/whatsim-lets-you-use-whatsapp-for-free-while-roaming-worldwide-652145?pfrom=home-editorpick"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Use WhatsApp for Free, Anywhere in the World</a></li>
       
</marquee>
</div>
<br>
<div  class="ann">

<h3>NEWS</h3>

<marquee  onMouseOver="this.scrollAmount=1" onMouseOut="this.scrollAmount=2" scrollamount="2" direction="up" loop="true" width="100%">

	<li><a href="http://www.ndtv.com/article/cheat-sheet/barack-obama-s-thumbs-up-for-daredevil-stunt-riders-at-republic-day-parade-10-developments-653780?pfrom=home-lateststories"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Barack Obama's Thumbs Up for Daredevil Stunt Riders at Republic Day Parade: 10 Developments</i></a></li>
    <li><a href="http://sports.ndtv.com/australia-tri-series-2015/news/236589-tri-series-rain-gods-offer-india-lifeline-can-mahendra-singh-dhoni-co-take-it?pfrom=home-cricket"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Can MS Dhoni & Co. Take the Rain Gods' Lifeline? </a></li>
       <li><a href="http://auto.ndtv.com/news/indian-students-develop-vehicle-that-delivers-mileage-of-200km-l-733735?pfrom=home-auto"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Indian Students Develop Vehicle That Delivers Mileage of 200Km/l</a></li> 
           <li><a href="http://gadgets.ndtv.com/telecom/news/whatsim-lets-you-use-whatsapp-for-free-while-roaming-worldwide-652145?pfrom=home-editorpick"><span class="glyphicon glyphicon-pushpin"></span> <i style="font-family: ; color:blue">Use WhatsApp for Free, Anywhere in the World</a></li>
       
</marquee>
</div>
</div>
 
 
</body>
</html>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/resources/css/one.css">






<title>University of Science: Timetable</title>
</head>
<body>
<div class="center">


<div class="content">
<a href="../"> <img src="${pageContext.request.contextPath}/resources/images/logo.png" width="127" height="102"  /></a>
<br>
<h2>University of Science</h2>
</div>
<br>
<a href="../about" class="button">About University</a>  
<div class="button2">Classes Timetables</div>
<a href="../recordbook/main" class="button">Student Record Book</a>
<a href="../newstudent/main" class="button">New Student</a>
<br><br>






<!-- MID -->

<div class="mid" align="left">

<br>

<h2> Hello ${firstName} ${secondName}! </h2>
<hr>
<br>

Your timetable for ${param.year} year of ${param.field} for group ${param.gr} will be available here soon! 



<br><br><br>
<a href="main"><input type="submit" value="Go back"/></a>

<br><br><br><br><br><br>
</div>





<br>

<br><br>
<div class="footer">University of Science 2018</div>



</div>
</body>
</html>
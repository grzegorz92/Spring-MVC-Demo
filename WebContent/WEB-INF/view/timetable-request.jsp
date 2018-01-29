<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/resources/css/one.css">






<title>University of Science: Timetable</title>
</head>
<body>
<div class="center">


<div class="content">
<a href="/university"> <img src="${pageContext.request.contextPath}/resources/images/logo.png" width="127" height="102"  /></a>
<br>
<h2>University of Science</h2>
</div>
<br>
<a href="/university/about" class="button">About University</a>  
<div class="button2">Classes Timetables</div>
<a href="/university/recordbook/main" class="button">Student Record Book</a>
<a href="/university/newstudent/main" class="button">New Student</a>
<br><br>






<!-- MID -->

<div class="mid" align="left">

<br><br>
Check your timetable:
<hr><br>
<form action="info" method="GET">

<table>

<tr>
<td>
First name:<br>
Second name:<br>
Year of study:<br>
Field of study:<br>
Group:

</td>

<td>
<input type="text" name="firstName" placeholder="Your first name"><br>
<input type="text" name="secondName" placeholder="Your second name"><br>
<select name="year">
				<option>first</option>
				<option>second</option>
				<option>third</option>
				<option>forth</option>
				<option>fifth</option>
				</select><br>

<select name="field">
				<option>Computer Science</option>
				<option>Electronics</option>
				<option>Telecommunications</option>
				<option>Power Engineering </option>
				<option>Electrical Engineering</option>
				</select><br>
				
A<input type="radio" name="gr" value="A" checked/>   &nbsp;&nbsp;B<input type="radio" name="gr" value="A"/>   &nbsp;&nbsp;C<input type="radio" name="gr" value="A"/>								


</td>
</tr>
</table>
<br><br><br>


<input type="submit" value="Check your timetable"/>								

</form>

</div>





<br>

<br><br>
<div class="footer">University of Science 2018</div>



</div>
</body>
</html>
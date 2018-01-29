<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/resources/css/one.css">






<title>University of Science: New Student</title>
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
<a href="/university/timetables/main" class="button">Classes Timetables</a>
<a href="/university/recordbook/main" class="button">Student Record Book</a>
<a href="main" class="button">New Student</a>
<br><br>






<!-- MID -->

<div class="mid" align="left">

<br><br>
<h3>Confirmation</h3>
Check if the following informations are correct. If so click "submit" button to proceed. If you want to correct something before you will apply please click "Back" button.
<br><br><br><br>

<b>

<table>
<tr>
<td>First name:</td>
<td>${newStudent.firstName}</td>
</tr>

<tr>
<td>Second name:</td>

<td>${newStudent.lastName}</td>
</tr>


<tr>
<td>Date of birth:</td>

<td>${newStudent.date}
</td>
</tr>

<tr>
<td>Place of birth:</td>
<td>${newStudent.placeOfBirth}
</td>
</tr>

<tr>
<td>Sex:</td>
<td>${newStudent.sex}</td>
</tr>

</table>


<hr>

<table>
<tr>
<td>Address:</td>
<td>${newStudent.street}, ${newStudent.houseNumber}</td>
</tr>


<tr>
<td>Postal Code:</td>

<td>${newStudent.postalCode}</td>
</tr>

<tr>
<td>City:</td>
<td>${newStudent.city}, ${newStudent.country}</td>
</tr>


</table>



<hr>

<table>
<tr>
<td>You want to study:</td>
<td>${newStudent.fieldOfStudy}</td>
</tr>

<tr>
<td>Language(s) you want to learn:</td>
<td>
<ul>
	<c:forEach var="temp" items="${newStudent.languages}">
	
	<li>${temp}</li>
	
	</c:forEach>
</ul>
</td>
</tr>
</table>


</b>

<br><br><hr><br><br>

<a href="form"><input type="submit" value="Back"/></a>
<a href="thankyou"><input type="submit" value="Apply!"/></a>


</div>





<br>

<br><br>
<div class="footer">University of Science 2018</div>



</div>
</body>
</html>
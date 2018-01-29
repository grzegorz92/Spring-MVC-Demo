<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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


<h2>Application form for candidates</h2>
<h4> To apply to our University please fill out the form below. </h4><br><br><br><br>



<form:form action="confirm" modelAttribute="newStudent">

<b>Personal info:</b><hr>
<table>
<tr>
<td>First name:</td>
<td>
	<form:input path="firstName" placeholder="Your first name?" />
	<form:errors path="firstName" cssClass="error"/>
</td>
</tr>

<tr>
<td>Second name:</td>

<td>
<form:input path="lastName" placeholder="Your second name?" />	
	<form:errors path="lastName" cssClass="error"/> 
</td>
</tr>


<tr>
<td>Date of birth:</td>

<td>	
	<form:input type="date" path="date"/>
	<form:errors path="date" cssClass="error"/>
</td>
</tr>

<tr>
<td>Place of birth:</td>
<td>	
	<form:input path="placeOfBirth" placeholder="City, Country"/>
	<form:errors path="placeOfBirth" cssClass="error"/>
</td>
</tr>

<tr>
<td>Sex:</td>
<td><form:select path="sex">
	<form:option value="Male" label="Male"/>
	<form:option value="Female" label="Female"/>
	</form:select></td>
</tr>

</table>
<br><br><br>

<b>Address:</b><hr>

<table>
<tr>
<td>Street:</td>
<td>
	<form:input path="street" placeholder="Street name" />
	<form:errors path="street" cssClass="error"/>
</td>
</tr>

<tr>
<td>Number:</td>

<td>
<form:input path="houseNumber"  placeholder="House number"/>	
	<form:errors path="houseNumber" cssClass="error"/> 
</td>
</tr>


<tr>
<td>Postal Code:</td>

<td>	
	<form:input path="postalCode" placeholder="ex. 12345, or 12-345"/>
	<form:errors path="postalCode" cssClass="error"/>
</td>
</tr>

<tr>
<td>City:</td>
<td>	
	<form:input path="city" placeholder="City"/>
	<form:errors path="city" cssClass="error"/>
</td>
</tr>

<tr>
<td>Country:</td>
<td><form:select path="country">
	<form:options items="${newStudent.countryList}"/>
	</form:select></td>
</tr>

</table>

<br><br><br>

<b>Studies:</b><hr>
<table>
<tr>
<td>What field of study do you want to choose?:</td>
<td><form:select path="fieldOfStudy">
				<form:option value="Computer Science" />
				<form:option value="Electronics" />
				<form:option value="Telecommunications" />
				<form:option value="Power Engineering" />
				<form:option value="Electrical Engineering" />
				</form:select></td>
</tr>

<tr>
<td>What languages are you interested to learn?:</td>
<td><form:checkbox path="languages" value="English"/>English<br>
	<form:checkbox path="languages" value="German"/>German<br>
	<form:checkbox path="languages" value="French"/>French<br>
	<form:checkbox path="languages" value="Polish"/>Polish<br>
	
</td>
</tr>
</table>
<br><br><br>	
	
	
	
	<br><br>
	<input type="submit" value="Submit"/>


</form:form>

</div>

<br>

<br><br>
<div class="footer">University of Science 2018</div>



</div>
</body>
</html>
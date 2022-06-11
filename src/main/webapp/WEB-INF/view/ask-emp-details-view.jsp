<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

	Name <form:input path="name"/>
	<br>
	Surname <form:input path="surname"/>
	<br>
	Salary <form:input path="salary"/>
	<br>
	Department <form:select path="department">
	<form:options items="${employee.departments}"/>	
	
    <!-- <form:option value="Information Technology" label="IT"></form:option>
	<form:option value="Human Resources" label="HR"></form:option>
	<form:option value="Sales" label="Sales"></form:option>	-->
	
	</form:select>
	<br>
	
	<input type="submit" value="OK">
	<br>
	
</form:form>
	
</body>

</html>
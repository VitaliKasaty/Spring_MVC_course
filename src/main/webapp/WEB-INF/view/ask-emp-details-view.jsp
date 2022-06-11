<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

	Name <form:input path="name"/> 
	<form:errors path="name"/>
	<br>
	Surname <form:input path="surname"/>
	<form:errors path="surname"/>
	<br>
	Salary <form:input path="salary"/>
	<form:errors path="salary"/>
	<br>
	Department <form:select path="department">
	<form:options items="${employee.departments}"/>	
    <!-- 
    <form:option value="Information Technology" label="IT"></form:option>
	<form:option value="Human Resources" label="HR"></form:option>
	<form:option value="Sales" label="Sales"></form:option>	
	-->	
	</form:select>
	<br>
	Which car do you want?
	<!-- 
	BMW <form:radiobutton path="carBrand" value ="BMW"/>
	Audi <form:radiobutton path="carBrand" value ="Audi"/>
	MB <form:radiobutton path="carBrand" value ="Mercedes-Benz"/>
	-->
	<form:radiobuttons path="carBrand" items="${employee.carBrands}"/>	
	<br>
	Foreign Language(s)
	<!-- 
	EN <form:checkbox path="languages" value="English"/>
	DE <form:checkbox path="languages" value="Deutch"/>
	FR <form:checkbox path="languages" value="French"/>
	-->
	<form:checkboxes items="${employee.languageList}" path="languages"/>
	<br>
	Phone number <form:input path="phoneNumber"/> 
	<form:errors path="phoneNumber"/>
	<br>
	<input type="submit" value="OK">
	<br>
	
</form:form>
	
</body>

</html>
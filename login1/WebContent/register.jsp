<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="register.obj" method="post" modelAttribute="register">
First Name:<f:input path="firstName"/>
<f:errors path="firstName" cssStyle="color:red"></f:errors>
<br>
Last Name:<f:input path="lastName"/>
<f:errors path="lastName" cssStyle="color:red"></f:errors>
<br>
e mail:<f:input path="email"/>
<f:errors path="email" cssStyle="color:red"></f:errors>
<br>
Gender:
<f:radiobutton path="gender" value="M" label="M"/>
<f:radiobutton path="gender" value="F" label="F"/>

Select Skills:
<f:checkboxes items="${skillList}" path="skillSet"/>

Select City:
<f:select path="city">
<f:option value="" label="Please select"></f:option>
<f:options items ="${cityList}"/>
</f:select>



<input type="submit" value="Submit">



</f:form>

</body>
</html>
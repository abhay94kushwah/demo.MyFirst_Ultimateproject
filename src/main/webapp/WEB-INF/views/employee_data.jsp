<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>


<h2>Your Employee name is  ${emp1.getName()}</h2>

<h2>Your Employee Age  is ${ emp1.getAge()}</h2>
<h2>Your Employee Department is  ${ emp1.getDepartment()} </h2>

<h2>Your Employee name is  ${emp2.getName()}</h2>

<h2>Your Employee Age  is ${ emp2.getAge()}</h2>
<h2>Your Employee Department is  ${ emp2.getDepartment()} </h2>

<h2>Your Employee name is  ${emp3.getName()}</h2>

<h2>Your Employee Age  is ${ emp3.getAge()}</h2>
<h2>Your Employee Department is  ${ emp3.getDepartment()} </h2>

</body>
</html>
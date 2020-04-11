<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>

</head>
<body>
      <c:set var="course" value="${c}"></c:set>
	  <c:forEach items="${s}" var="student">
	   <c:set var="fname" value="${student.getFname()}"></c:set>
				
	   <c:set var="lname" value="${student.getLname()}"></c:set>
	   <c:set var="courses" value="${student.getCourse()}">
	   </c:set>
	   </c:forEach>
	   
		<c:if test="${not fn:contains(courses, course}">
			<div style="color:red">
				<c:out value="${c}"></c:out>
				<br> registration failed for<br /> 
				<c:out value="${fname}"></c:out>
				<c:out value="${lname}"></c:out>
			</div>
		</c:if>
		<c:if test="${fn:contains(courses, course}" >
		<div style="color:red">
				<c:out value="${c}"></c:out>
				<br> registration successful for<br /> 
				<c:out value="${fname}"></c:out>
				<c:out value="${lname}"></c:out>
			</div>
		
		</c:if>
	
		<p class="message">Access denied!</p>
		<a href="/Spring3HibernateIntegration/login">Go back to login page</a> 

</body>
</html>
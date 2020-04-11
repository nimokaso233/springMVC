<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>HTTP Status 403 - Access is denied</h1>

	<c:choose>
		<c:when test="${! empty error}">
		  <h2>You do not have permission to access this page!</h2>
		</c:when>
		<c:otherwise>
		  <h2>email : ${student} <br/>
                    You do not have permission to access this page!</h2>
		</c:otherwise>
	</c:choose>
	
	<p class="message">Access denied!</p>
		<a href="/StudentCourse/login">Go back to login page</a> 

</body>
</html>
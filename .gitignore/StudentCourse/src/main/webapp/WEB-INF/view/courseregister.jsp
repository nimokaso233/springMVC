<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Add A Course</title>
</head>
<body>
<h2>Course Management</h2>
 <h6><a href="<c:url value='j_spring_security_logout'/>">Click here to logout</a></h6>

<form:form method="post" action="success" modelAttribute="student">
<table>
 <tr>
        <td><form:label path="name"><spring:message code="label.name"/></form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="dp"><spring:message code="label.dp"/></form:label></td>
        <td><form:input path="dp" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input name="Submit" type="submit" value="<spring:message code="label.submit"/>"/>&nbsp;
            <input name="Reset" type="reset">
        </td>
    </tr>



</table>


</form:form>
</body>
</html>
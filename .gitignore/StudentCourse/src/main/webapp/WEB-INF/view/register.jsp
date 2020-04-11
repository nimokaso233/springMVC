<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Add A student</title>
</head>
<body>
 
<h2>Student Management Screen</h2>
 <h6><a href="<c:url value='j_spring_security_logout'/>">Click here to logout</a></h6>
<form:form method="post" action="login" modelAttribute="student">
 
    <table>
    <tr>
        <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
        <td><form:input path="fname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="lname" /></td>
    </tr>
    <tr>
        <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="password"><spring:message code="label.password"/></form:label></td>
        <td><form:input path="psd" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input name="Register" type="submit" value="<spring:message code="label.add"/>"/>&nbsp;<input name="Reset" type="reset">
        </td>
    </tr>
</table> 
</form:form>
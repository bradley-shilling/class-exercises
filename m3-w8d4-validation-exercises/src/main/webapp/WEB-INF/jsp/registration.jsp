<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:set var="pageTitle" value="Registration"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>
<c:url var="registrationUrl" value="/register" />
<form:form action="${registrationUrl }" method="POST" modelAttribute="registration">

	<div class="form-group">
		<label for="firstName">First Name:</label>
		<form:input type="text" path="firstName"  class="form-control" />
		<form:errors path="firstName" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="lastName">Last Name:</label>
		<form:input type="text" path="lastName" class="form-control" />
		<form:errors path="lastName" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="email">Email:</label>
		<form:input type="text" path="email"  class="form-control" />
		<form:errors path="email" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="confirmEmail">Confirm Email:</label>
		<form:input type="text" path="confirmEmail" class="form-control" />
		<form:errors path="confirmEmail" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="password">Password:</label>
		<form:password path="password" class="form-control" />
		<form:errors path="password" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="confirmPassword">Confirm Password:</label>
		<form:password path="confirmPassword" class="form-control" />
		<form:errors path="confirmPassword" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="birthDate">Birth Date (yyyy-mm-dd):</label>
		<form:input type="text" path="birthDate" class="form-control" />
		<form:errors path="birthDate" cssClass="errors" />
	</div>
	<div class="form-group">
		<label for="numOfTickets">Number of Tickets:</label>
		<form:input type="text" path="numOfTickets" class="form-control" />
		<form:errors path="numOfTickets" cssClass="errors" />
	</div>
	
	<input type="hidden" name="honey" id="honey" >
	
	<input type="submit" class="btn btn-default" value="Register">


</form:form>

<%@include file="common/footer.jspf" %>

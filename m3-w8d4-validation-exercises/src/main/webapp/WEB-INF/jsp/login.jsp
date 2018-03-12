<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>
<c:url var="loginUrl" value="/login" />
<form:form action="${loginUrl }" method="POST" modelAttribute="login">

	<div class="form-group">
		<label for="email">Email:</label>
		<form:input type="text" path="email"  class="form-control" />
		<form:errors path="email" cssClass="errors" />
	</div>
	
	<div class="form-group">
		<label for="password">Password:</label>
		<form:password path="password" class="form-control" />
		<form:errors path="password" cssClass="errors" />
	</div>
	<input type="hidden" name="honey" id="honey" >
	
	<input type="submit" class="btn btn-default" value="Login">


</form:form>

<%@include file="common/footer.jspf" %>

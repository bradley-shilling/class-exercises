<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url value="/actorSearch" var="formAction" />
		<form method="GET" action="${formAction}">
			<!-- <label for="name">Your Name: </label> -->
			<input type="text" id="name" name="name" placeholder="Search"/>
			<input type="submit" value="Search" />
		</form>



<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <!-- What do we print here for each actor? -->
    <td><c:out value="${actor.firstName}" />&nbsp;<c:out value="${actor.lastName}" /></td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>
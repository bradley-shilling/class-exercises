<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<c:url value="/customerSearch" var="formAction" />
		<form method="GET" action="${formAction}">
			<label for="search">Name: </label>
			<input type="text" id="search" name="search" placeholder="Search"/>
			<label for="sort">Sort: </label>
			<select id="sort" name="sort">
				<option value="last_name">Last Name</option>
  				<option value="email">Email</option>
  				<option value="activebool">Active</option>
			</select>
			<input type="submit" value="Search" />
		</form>



<table class="table">
<tr>
<th>Name</th>
<th>Email</th>
<th>Active</th>
</tr>

<c:forEach items="${customer}" var="customer">
<tr>
<td><c:out value="${customer.firstName}" />&nbsp;<c:out value="${customer.lastName}" /></td>
<td><c:out value="${customer.email}" /></td>
<td><c:out value="${customer.active ?  'Active' : 'Inactive' }" /></td>
</tr>
</c:forEach>
</table>


<%@include file="common/footer.jspf"%>
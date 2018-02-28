<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		
		<ul>
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		 
		 
		
		<c:if test="${empty param.word}">
    			<c:set var="word" value="Hello." />
		</c:if>
		<c:if test="${not empty param.word}">
    			<c:set var="word" value="${param.word}" />
		</c:if>
		<c:if test="${empty param.count}">
    			<c:set var="count" value="20" /> 
		</c:if>
		<c:if test="${not empty param.count}">
    			<c:set var="count" value="${param.count}" />
		</c:if>
		 
		 
		 
		 <c:forEach begin="1" end="${count}" step="1" var="sizeDecrease">
				 <li style="font-size: ${count - sizeDecrease}px; line-height: ${count - sizeDecrease}px;"><c:out value="${word}" /></li>	
		</c:forEach>
		 
		</ul>
		
	</body>
</html>
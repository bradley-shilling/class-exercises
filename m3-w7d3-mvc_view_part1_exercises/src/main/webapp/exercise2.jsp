<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 
			 <c:set var="firstFibber" value="0" />
			 <c:set var="secondFibber" value="1" />
			 <c:set var="queuedFibber" value="0" />
			 
			 
			 <c:forEach begin="1" end="25" step="1" var="fib">
				 <li><c:out value="${firstFibber} is the ${fib} number in the Fibonacci sequence " /></li>
				 <c:set var="queuedFibber" value="${firstFibber + secondFibber}" />
				 <c:set var="firstFibber" value="${secondFibber}" />
				 <c:set var="secondFibber" value="${queuedFibber}" />
					
			</c:forEach>
			 
			 
			 <%--
			 for(int i=0; i < reallyCountToMe; i++) {
				if (firstFibber <= reallyCountToMe) {
					System.out.print(firstFibber + " ");
					qeuedFibber = (firstFibber + secondFibber);
					firstFibber = secondFibber;
					secondFibber = qeuedFibber;
				}
				
			} --%>
			 
			 
		</ul>
	</body>
</html>
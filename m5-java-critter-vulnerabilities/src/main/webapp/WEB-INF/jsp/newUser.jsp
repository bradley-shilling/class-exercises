<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<script type="text/javascript">
	$(document).ready(function () {
	
		$("form").validate({
			
			rules : {
				userName : {
					required : true
				},
				password : {
					required : true,
					minlength: 12,
				},
				confirmPassword : {
					required : true,		
					equalTo : "#password"  
				}
			},
			messages : {			
				confirmPassword : {
					equalTo : "Passwords do not match"
				}
			},
			errorClass : "error"
		});
	});
</script>

<c:url var="formAction" value="/users" />
<form:form method="POST" action="${formAction}" modelAttribute="user">
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<div class="form-group">
				<label for="userName">User Name: </label>
				<form:input path="userName" placeHolder="User Name" class="form-control" />
				<form:errors path="userName"/>
			</div>
			<div class="form-group">
				<label for="password">Password: </label>
				<form:password path="password" placeHolder="Password" class="form-control" />
				<form:errors path="password" />
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password: </label>
				<form:password path="confirmPassword" placeHolder="Re-Type Password" class="form-control" />	
				<form:errors path="confirmPassword" />
			</div>
			<button type="submit" class="btn btn-default">Create User</button>
		</div>
		<div class="col-sm-4"></div>
	</div>
</form:form>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
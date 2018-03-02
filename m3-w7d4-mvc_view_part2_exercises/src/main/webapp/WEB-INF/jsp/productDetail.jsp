<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--${product.name}-->
<c:set var="pageTitle" value="${product.name}" />
<%@ include file="includes/header.jspf" %>
<!-- Product Tiles View -->
       <!--  content here -->
    
     
       
       <div class="single-product">
       
  				<!-- image -->
       			
       			<c:url var="imageUrl"
					value="/img/${product.getImageName()}" />
				<img src="${imageUrl}" class="image">
				<div class="details">
				<!-- name -->
				<c:url var="linkUrl"
				value="/productDetail?productId=${product.getProductId()}" />
				<a href="${linkUrl }">
       			<strong><c:out value="${product.name}" /></strong>
				</a>
				
				
				<!-- best seller? -->
				<c:if test="${product.topSeller}">
       			<span class="red top-seller">Best Seller!!</span>
       			</c:if>
       			<br />
       			<!-- mfr -->	
       			<span class="mfr"><c:out value="by ${product.manufacturer}" /></span>
       			<br />
       			<span class="rating">
       			<!-- rating -->
       			<c:choose>
								<c:when
									test="${product.getAverageRating()  >= 0.5 && product.getAverageRating() < 1.5 }">
									<c:url var="ratingImageUrl" value="/img/1-star.png" />
									
									<img src="${ratingImageUrl}">
								</c:when>
								<c:when
									test="${product.getAverageRating()  >= 1.5 && product.getAverageRating() < 2.5 }">
									<c:url var="ratingImageUrl" value="/img/2-star.png" />
									
									<img src="${ratingImageUrl}">
								</c:when>
								<c:when
									test="${product.getAverageRating()  >= 2.5 && product.getAverageRating() < 3.5 }">
									<c:url var="ratingImageUrl" value="/img/3-star.png" />
									
									<img src="${ratingImageUrl}">
								</c:when>
								<c:when
									test="${product.getAverageRating()  >= 3.5 && product.getAverageRating() < 4.5 }">
									<c:url var="ratingImageUrl" value="/img/4-star.png" />
									
									<img src="${ratingImageUrl}">
								</c:when>
								<c:when
									test="${product.getAverageRating()  >= 4.5 && product.getAverageRating() <= 5 }">
									<c:url var="ratingImageUrl" value="/img/5-star.png" />
									
									<img src="${ratingImageUrl}">
								</c:when>
								<c:otherwise>
									<c:out value="this product sucks" />
									
								</c:otherwise>
							</c:choose>
							</span>
       			
       			
       			<div class="middle">
       			 <!-- price -->		
				<span class="price"><c:out value="$${product.price}" /></span>
				<br />
				
				<!-- weight -->
       			<strong>Weight </strong> <c:out value="${product.weightInLbs} pounds" />
       			<br />
       			</div>
				
				<!-- weight -->
       			<strong>Description: </strong> <c:out value="${product.description}" />
				
       			</div>
       			
			</div>	
		
       

<%@ include file="includes/footer.jspf" %>
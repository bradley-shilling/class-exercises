<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="Product Table View" />
<%@ include file="includes/header.jspf" %>

    
    	<h2 class="main-title">Toy Department</h2>
<table cellspacing="0" cellpadding="0">
       <!-- Use the request attribute "products" (List<product>) -->
       <!-- image -->
       <tr>
       			<th>
       			&nbsp;
       			</th>
       	<c:forEach var="product" items="${productList}">
       			<td>
       			<c:url var="linkUrl"
				value="/productDetail" >
				<c:param name="productId" value="${product.productId}" />
				</c:url>
				<a href="${linkUrl }">
       			<c:url var="imageUrl"
					value="/img/${product.getImageName()}" />
				<img src="${imageUrl}" class="image">
				</a>
				<!-- best seller? -->
				<c:if test="${product.topSeller}">
       			<div class="red top-seller">Best Seller!!</div>
       			</c:if>
				</td>
       	</c:forEach>
       </tr>
      
       
       <!-- name -->
       <tr>
       			<th>
       			Name
       			</th>
       			
       			
       	<c:forEach var="product" items="${productList}">
       			<td>
       			<c:url var="linkUrl"
				value="/productDetail" >
				<c:param name="productId" value="${product.productId}" />
				</c:url>
				<a href="${linkUrl }">
       			<c:out value="${product.name}" />
				</a>
				</td>
       	</c:forEach>

       </tr>
       
       
       
       <!-- rating-->
       <tr>
       			<th>
       			Rating
       			</th>
       	<c:forEach var="product" items="${productList}">
       			<td>
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
				</td>
       	</c:forEach>
       </tr>
       
       
       <!-- mfr -->
       <tr>
       			<th>Mfr</th>		
       	<c:forEach var="product" items="${productList}">
       			<td><span class="mfr"><c:out value="${product.manufacturer}" /></span></td>
       	</c:forEach>
       </tr>
       
       
       <!-- price -->
       <tr>
       			<th>Price</th>		
       	<c:forEach var="product" items="${productList}">
       			<td><span class="price"><c:out value="$${product.price}" /></span></td>
       	</c:forEach>
       </tr>
       
       <!-- weight -->
       <tr>
       			<th>wt (in lbs.)</th>		
       	<c:forEach var="product" items="${productList}">
       			<td><c:out value="${product.weightInLbs}" /></td>
       	</c:forEach>
       </tr>
       </table>
    
    
    
<%@ include file="includes/footer.jspf" %>
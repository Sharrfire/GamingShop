<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>GoodGames- The gaming store</title>
<meta name="description"
	content="GoodGames - Bootstrap template for communities and games store">
<meta name="keywords"
	content="game, gaming, template, HTML template, responsive, Bootstrap, premium">
<meta name="author" content="_nK">
<link rel="icon" type="image/png" href="assets/images/favicon.png">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,700%7cOpen+Sans:400,700"
	rel="stylesheet" type="text/css">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="assets/vendor/bootstrap/dist/css/bootstrap.min.css">
<!-- FontAwesome -->
<script defer src="assets/vendor/fontawesome-free/js/all.js"></script>
<script defer src="assets/vendor/fontawesome-free/js/v4-shims.js"></script>
<!-- IonIcons -->
<link rel="stylesheet"
	href="assets/vendor/ionicons/css/ionicons.min.css">
<!-- Flickity -->
<link rel="stylesheet"
	href="assets/vendor/flickity/dist/flickity.min.css">
<!-- Photoswipe -->
<link rel="stylesheet" type="text/css"
	href="assets/vendor/photoswipe/dist/photoswipe.css">
<link rel="stylesheet" type="text/css"
	href="assets/vendor/photoswipe/dist/default-skin/default-skin.css">
<!-- Seiyria Bootstrap Slider -->
<link rel="stylesheet"
	href="assets/vendor/bootstrap-slider/dist/css/bootstrap-slider.min.css">
<!-- Summernote -->
<link rel="stylesheet" type="text/css"
	href="assets/vendor/summernote/dist/summernote-bs4.css">
<!-- GoodGames -->
<link rel="stylesheet" href="assets/css/goodgames.css">
<!-- Custom Styles -->
<link rel="stylesheet" href="assets/css/custom.css">
<!-- END: Styles -->
<!-- jQuery -->
<script src="assets/vendor/jquery/dist/jquery.min.js"></script>
</head>

<jsp:include page="header.jsp"></jsp:include>




<div class="nk-main">

	<div class="container">

		<div class="nk-store nk-store-checkout">
			<h3 class="nk-decorated-h-2">
				<span><span class="text-main-1">Billing</span> Details</span>
			</h3>

			<!-- START: Billing Details -->
			<div class="nk-gap"></div>
									<p class="text-danger">${mess}</p>
			
			<form action="sendMail" class="nk-form" method="post">
				<div class="row vertical-gap">
				
					<div class="col-lg-6">
						<div class="row vertical-gap">
							<div class="col-sm-6">
								<label for="fname">First Name <span class="text-main-1">*</span>:
								</label> <input type="text" class="form-control required" name="fname"
									id="fname">
							</div>
							<div class="col-sm-6">
								<label for="lname">Last Name <span class="text-main-1">*</span>:
								</label> <input type="text" class="form-control required" name="lname"
									id="lname">
							</div>
						</div>
						<div class="nk-gap-1"></div>
						<div class="row vertical-gap">
							<div class="col-sm-6">
								<label for="email">Email Address <span
									class="text-main-1">*</span>:
								</label> <input type="email" class="form-control required" name="email"
									id="email">
							</div>
							<div class="col-sm-6">
								<label for="phone">Phone <span class="text-main-1">*</span>:
								</label> <input type="tel" class="form-control required" name="phone"
									id="phone">
							</div>
						</div>

					
					</div>
					<div class="col-lg-6">
						<label for="address">Address <span class="text-main-1">*</span>:
						</label> <input type="text" class="form-control required" name="address"
							id="address">

						<div class="nk-gap-1"></div>
						<label for="city">Town / City <span class="text-main-1">*</span>:
						</label> <input type="text" class="form-control required" name="city"
							id="city">

					</div>
				</div>
				<div class="nk-gap-2"></div>
					<div class="nk-gap-1"></div>
					<label for="notes">Order Notes:</label>
					<textarea class="form-control" name="notes" id="notes"
							  placeholder="Order Notes" rows="6"></textarea>


				<div class="nk-gap-2"></div>



				<!-- START: Order Products -->
				<div class="nk-gap-3"></div>
				<h3 class="nk-decorated-h-2">
					<span><span class="text-main-1">Your</span> Order</span>
				</h3>
				<div class="nk-gap"></div>
				<div class="table-responsive">
					<table class="nk-table nk-table-sm">
						<thead class="thead-default">
						<tr>
							<th class="nk-product-cart-title">Product</th>
							<th class="nk-product-cart-total">Total</th>
						</tr>
						</thead>
						<tbody>

						<c:forEach var="d" items="${data}">
							<tr>
								<td class="nk-product-cart-title">${d.name}</td>
								<td class="nk-product-cart-total">${d.price}$</td>
							</tr>

						</c:forEach>

						<tr class="nk-store-cart-totals-shipping">
							<td>Shipping</td>
							<td>Free Shipping</td>
						</tr>
						<tr class="nk-store-cart-totals-total">
							<td>Total</td>
							<td>${total}$</td>
						</tr>
						</tbody>
					</table>
				</div>
				<!-- END: Order Products -->




				<input type="submit" class="nk-btn nk-btn-rounded nk-btn-color-main-1" value="Place Order">
			</form>
			<!-- END: Billing Details -->

<%--			<div class="nk-gap-2"></div>--%>
<%--			<form action="#" class="nk-form">--%>
<%--				<div class="nk-gap-1"></div>--%>
<%--				<label for="notes">Order Notes:</label>--%>
<%--				<textarea class="form-control" name="notes" id="notes"--%>
<%--					placeholder="Order Notes" rows="6"></textarea>--%>
<%--			</form>--%>

			<div class="nk-gap-2"></div>


<%--			<a class="nk-btn nk-btn-rounded nk-btn-color-main-1" href="checkout">Place--%>
<%--				Order</a>--%>
		</div>
	</div>

	<div class="nk-gap-2"></div>

	<jsp:include page="footer.jsp" />





</div>

<jsp:include page="searchModal.jsp" />
<jsp:include page="script.jsp" />


</body>
</html>

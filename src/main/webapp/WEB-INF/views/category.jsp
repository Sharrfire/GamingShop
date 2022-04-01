<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<title>GoodGames | Community and Store HTML Game Template</title>

	<meta name="description"
		  content="GoodGames - Bootstrap template for communities and games store">
	<meta name="keywords"
		  content="game, gaming, template, HTML template, responsive, Bootstrap, premium">
	<meta name="author" content="_nK">

	<link rel="icon" type="image/png" href="assets/images/favicon.png">

	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- START: Styles -->

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
	<style>
		.nk-product-cat-2 .nk-product-image {
			width: 255px;
			margin: 15px 0 15px 35px;
		}
	</style>

</head>
<jsp:include page="header.jsp" />

<body>



<div class="nk-main">

	<!-- START: Breadcrumbs -->
	<div class="nk-gap-1"></div>
	<div class="container">
		<ul class="nk-breadcrumbs">


			<li><a href="home">Home</a></li>

			<li><span class="fa fa-angle-right"></span></li>

			<li><a href="#">Category</a></li>


			<li><span class="fa fa-angle-right"></span></li>

			<li><span>${cate.cname} Games</span></li>

		</ul>
	</div>
	<div class="nk-gap-1"></div>
	<!-- END: Breadcrumbs -->




	<div class="container">




		<div class="nk-gap-2"></div>
		<!-- START: Products -->
		<div class="row vertical-gap">
			<c:forEach var="o" items="${listProductByID}">

				<div class="col-lg-3">
					<div class="nk-product-cat-2">
						<a class="nk-product-image" href="product?id=${o.id}"> <img
								src="${o.image}"
								alt="${o.name}">
						</a>
						<div class="nk-product-cont">
							<h3 class="nk-product-title h5">
								<a href="product?id=${o.id}">${o.name}</a>
							</h3>
							<div class="nk-gap-1"></div>
							<div class="nk-product-price">${o.price}$</div>
							<div class="nk-gap-1"></div>
							<a href="#"
							   class="nk-btn nk-btn-rounded nk-btn-color-dark-3 nk-btn-hover-color-main-1">Add
								to Cart</a>
						</div>
					</div>
				</div>
			</c:forEach>










		</div>
		<!-- END: Products -->

		<!-- START: Pagination -->
		<div class="nk-gap-3"></div>
		<div class="nk-pagination nk-pagination-center">
			<a href="#" class="nk-pagination-prev"> <span
					class="ion-ios-arrow-back"></span>
			</a>
			<nav>
				<a class="nk-pagination-current" href="#">1</a> <a href="#">2</a> <a
					href="#">3</a> <a href="#">4</a> <span>...</span> <a href="#">14</a>
			</nav>
			<a href="#" class="nk-pagination-next"> <span
					class="ion-ios-arrow-forward"></span>
			</a>
		</div>
		<!-- END: Pagination -->

	</div>

	<div class="nk-gap-2"></div>




	<jsp:include page="footer.jsp" />
</div>




<jsp:include page="searchModal.jsp" />
<jsp:include page="script.jsp" />


</body>
</html>

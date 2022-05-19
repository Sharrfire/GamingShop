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
												<p class="text-danger">${mess}</p>

<body>

	<div class="nk-main">
		<div class="container">

			<!-- START: Image Slider -->

			<div class="nk-image-slider" data-autoplay="8000">
				<div class="nk-image-slider-item">
					<img src="assets/images/slide-1.jpg" alt=""
						class="nk-image-slider-img"
						data-thumb="assets/images/slide-1-thumb.jpg">				
				</div>
				<div class="nk-image-slider-item">
					<img src="assets/images/slide-2.jpg" alt=""
						class="nk-image-slider-img"
						data-thumb="assets/images/slide-2-thumb.jpg">
					
				</div>
				<div class="nk-image-slider-item">
					<img src="assets/images/slide-3.jpg" alt=""
						class="nk-image-slider-img"
						data-thumb="assets/images/slide-3-thumb.jpg">
				</div>
				<div class="nk-image-slider-item">
					<img src="assets/images/slide-4.jpg" alt=""
						class="nk-image-slider-img"
						data-thumb="assets/images/slide-4-thumb.jpg">
				
				</div>
				<div class="nk-image-slider-item">
					<img src="assets/images/slide-5.jpg" alt=""
						class="nk-image-slider-img"
						data-thumb="assets/images/slide-5-thumb.jpg">
				</div>

				<div class="nk-image-slider-bg"
					style="background-image: url(&quot;assets/images/slide-5.jpg&quot;);"></div>
				<div class="nk-image-slider-bg-transition"
					style="background-image: url(&quot;assets/images/slide-5.jpg&quot;); opacity: 0; transform: matrix(1, 0, 0, 1, 0, 0); z-index: -2;"></div>
				
				<div class="nk-image-slider-thumbs"
					style="touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
					<ul style="transform: matrix(1, 0, 0, 1, -78.75, 0);">
						<li class=""
							style="background-image: url('assets/images/slide-1-thumb.jpg');"><div
								class="nk-image-slider-thumbs-overlay"></div>
							<div class="nk-image-slider-thumbs-count">2</div></li>
						<li class=""
							style="background-image: url('assets/images/slide-2-thumb.jpg');"><div
								class="nk-image-slider-thumbs-overlay"></div></li>
						<li class=""
							style="background-image: url('assets/images/slide-3-thumb.jpg');"><div
								class="nk-image-slider-thumbs-overlay"></div></li>
						<li class=""
							style="background-image: url('assets/images/slide-4-thumb.jpg');"><div
								class="nk-image-slider-thumbs-overlay"></div></li>
						<li class="nk-image-slider-thumbs-active"
							style="background-image: url('assets/images/slide-5-thumb.jpg');"><div
								class="nk-image-slider-thumbs-overlay"></div></li>
					</ul>
				</div>
			</div>

			<!-- END: Image Slider -->



			<!-- START: Latest News -->
			<div class="nk-gap-2"></div>
			<h3 class="nk-decorated-h-2">
				<span><span class="text-main-1">Game of</span> The Year</span>
			</h3>
			<div class="nk-gap"></div>
			<div class="nk-news-box">
				<div class="nk-news-box-list">
					<div class="nano">
						<div class="nano-content">
					<c:forEach var="pg" items="${listGOTY}">

							<div class="nk-news-box-item nk-news-box-item-active">
								<div class="nk-news-box-item-img">
									<img src="${pg.image}"
										alt="${pg.name}">
								</div>
								<img src="${pg.image}"
									alt="${pg.name}"
									class="nk-news-box-item-full-img">
								<h3 class="nk-news-box-item-title">${pg.name}</h3>

								<span class="nk-news-box-item-categories"> <span
									class="bg-main-4">MMO</span>
								</span>

								<div class="nk-news-box-item-text">
									<p>${pg.shortDescription}</p>
								</div>
								<a href="product?id=${pg.id}" class="nk-news-box-item-url">Read More</a>
								
							</div>
				</c:forEach>

						</div>
					</div>
				</div>	<div class="nk-news-box-each-info">
					<div class="nano">
						<div class="nano-content">
							<!-- There will be inserted info about selected news-->
							<div class="nk-news-box-item-image">
								<img src="${pg.image}" alt="">
							</div>
							<h3 class="nk-news-box-item-title">Smell magic in the air.
								Or maybe barbecue</h3>
							<div class="nk-news-box-item-text">
								<p>With what mingled joy and sorrow do I take up the pen to
									write to my dearest friend! Oh, what a change between to-day
									and yesterday! Now I am friendless and alone...</p>
							</div>
							<a href="product" class="nk-news-box-item-more">Read More</a>
							
						</div>
					</div>
				</div>
			
			</div>

			<div class="nk-gap-2"></div>

			<!-- END: Latest News -->



			<!-- START: Top 10 Best Sellers -->
			<div class="nk-gap-3"></div>
			<h3 class="nk-decorated-h-2">
				<span><span class="text-main-1">Top 10</span> Best Sellers</span>
			</h3>
			<div class="nk-gap"></div>
			<div class="nk-carousel nk-carousel-x4" data-autoplay="5000"
				data-dots="false" data-cell-align="left" data-arrows="true">
				<div class="nk-carousel-inner">
					
					<c:forEach var="pt" items="${listT10}">
						<div>
							<div class="pl-5 pr-5">
								<div class="nk-product-cat-3">
									<a class="nk-product-image" href="product?id=${pt.id}"> <img style="width: 115px; height: 172px"
										src="${pt.image}"
										alt="${pt.name}">
									</a>
									<div class="nk-product-cont">
										<div class="nk-gap-1"></div>
										<h3 class="nk-product-title h5">
											<a href="product?id=${pt.id}">${pt.name}</a>
											
										</h3>
										<div class="nk-gap-1"></div>
										<div class="nk-product-price">${pt.price}$</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
					
				</div>
			</div>
			<!-- END: Top 10 Best Sellers -->

			<!-- START: New Product -->
			<div class="nk-gap-3"></div>
			<h3 class="nk-decorated-h-2">
				<span><span class="text-main-1">New</span> Product</span>
			</h3>
			<div class="nk-gap"></div>
			<div class="row vertical-gap">
				<c:forEach var="o" items="${listLatest}">
					<div class="col-lg-4 col-md-6">
						<div class="nk-product-cat">
							<a class="nk-product-image" href="product?id=${o.id}"> <img  style="width: 115px; height: 155px"
								src="${o.image}" alt="${o.name}r">
							</a>
							<div class="nk-product-cont">
								<h3 class="nk-product-title h5">
									<a href="product?id=${o.id}">${o.name}</a>
								</h3>

								<div class="nk-gap-1"></div>
								<div class="nk-product-price">${o.price}$</div>
							</div>
						</div>
					</div>
				</c:forEach>




			</div>
			<!-- END: New Product -->
		</div>

		<div class="nk-gap-2"></div>

		<jsp:include page="footer.jsp" />




	</div>

	<jsp:include page="searchModal.jsp" />
	<jsp:include page="script.jsp" />


</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

.add-to-cart-button {
	color: white
}
</style>

</head>
<jsp:include page="header.jsp"></jsp:include>
<body>

	<div class="nk-main">

		<!-- START: Breadcrumbs -->
		<div class="nk-gap-1"></div>
		<div class="container">
			<ul class="nk-breadcrumbs">


				<li><a href="home">Home</a></li>

				<li><span class="fa fa-angle-right"></span></li>

				<li><a href="category?cid=${c.cid}">${c.cname}</a></li>
				<li><span class="fa fa-angle-right"></span></li>

				<li><span>${p.name}</span></li>

			</ul>
		</div>
		<div class="nk-gap-1"></div>
		<!-- END: Breadcrumbs -->




		<div class="container">
			<div class="row vertical-gap">
				<div class="col-lg-12">
					<div class="nk-store-product">
						<div class="row vertical-gap">
							<div class="col-md-6">
								<!-- START: Product Photos -->
								<div class="nk-popup-gallery">
									<div class="nk-gallery-item-box">
										<a href="${p.image}" class="nk-gallery-item"
											data-size="1200x1200">
											<div class="nk-gallery-item-overlay">
												<span class="ion-eye"></span>
											</div> <img src="${p.image}" alt="${p.name}">
										</a>
									</div>

									<div class="nk-gap-1"></div>


								</div>
								<!-- END: Product Photos -->
							</div>
							<div class="col-md-6">

								<h2 class="nk-product-title h3">${p.name}</h2>
								<p>${p.shortDescription}</p>
								<!-- START: Add to Cart -->
								<div class="nk-gap-2"></div>
								<form action="#" class="nk-product-addtocart">
									<div class="nk-product-price">${p.price}$</div>
									<div class="nk-gap-1"></div>
									<div class="input-group">
										<!--  
                          <input type="number" class="form-control" value="1" min="1" max="21">
                          <button class="nk-btn nk-btn-rounded nk-btn-color-main-1">Add to Cart</button>
                         -->
										<button class="nk-btn nk-btn-rounded nk-btn-color-main-1">
<%--											<a class="add-to-cart-button" href="cart?id=${p.id}">Add--%>
<%--												to Cart</a>--%>
											<a class="add-to-cart-button" href="addCart?id=${p.id }">Add
												to Cart</a>
										</button>


									</div>
								</form>
								<div class="nk-gap-3"></div>
								<!-- END: Add to Cart -->

							</div>
						</div>

						<div class="nk-gap-2"></div>
						<!-- START: Tabs -->
						<div class="nk-tabs">
							<ul class="nav nav-tabs" role="tablist">
								<li class="nav-item"><a class="nav-link active"
									href="#tab-description" role="tab" data-toggle="tab">Description</a>
								</li>
								<li class="nav-item"><a class="nav-link"
									href="#tab-reviews" role="tab" data-toggle="tab">Reviews</a></li>
							</ul>

							<div class="tab-content">

								<!-- START: Tab Description -->
								<div role="tabpanel" class="tab-pane fade show active"
									id="tab-description">
									<div class="nk-gap"></div>
									<div class="nk-gap"></div>
									<p>${p.description}</p>


								</div>
								<!-- END: Tab Description -->

								<!-- START: Tab Reviews -->
								<div role="tabpanel" class="tab-pane fade" id="tab-reviews">
									<div class="nk-gap-2"></div>
									<!-- START: Reply -->
									<h3 class="h4">Add a Review</h3>
									<div class="nk-reply">
										<form action="#" class="nk-form">
											<div class="row vertical-gap sm-gap">
												<div class="col-sm-6">
													<input type="text" class="form-control required"
														name="name" placeholder="Name *">
												</div>
												<div class="col-sm-6">
													<input type="text" class="form-control required"
														name="title" placeholder="Title *">
												</div>
											</div>
											<div class="nk-gap-1"></div>
											<textarea class="form-control required" name="message"
												rows="5" placeholder="Your Review *" aria-required="true"></textarea>
											<div class="nk-gap-1"></div>
											<div class="nk-rating">
												<input type="radio" id="review-rate-5" name="review-rate"
													value="5"> <label for="review-rate-5"> <span><i
														class="far fa-star"></i></span> <span><i
														class="fa fa-star"></i></span>
												</label> <input type="radio" id="review-rate-4" name="review-rate"
													value="4"> <label for="review-rate-4"> <span><i
														class="far fa-star"></i></span> <span><i
														class="fa fa-star"></i></span>
												</label> <input type="radio" id="review-rate-3" name="review-rate"
													value="3"> <label for="review-rate-3"> <span><i
														class="far fa-star"></i></span> <span><i
														class="fa fa-star"></i></span>
												</label> <input type="radio" id="review-rate-2" name="review-rate"
													value="2"> <label for="review-rate-2"> <span><i
														class="far fa-star"></i></span> <span><i
														class="fa fa-star"></i></span>
												</label> <input type="radio" id="review-rate-1" name="review-rate"
													value="1"> <label for="review-rate-1"> <span><i
														class="far fa-star"></i></span> <span><i
														class="fa fa-star"></i></span>
												</label>
											</div>
											<button
												class="nk-btn nk-btn-rounded nk-btn-color-dark-3 float-right">Submit</button>
										</form>
									</div>
									<!-- END: Reply -->

									<div class="clearfix"></div>
									<div class="nk-gap-2"></div>
									<div class="nk-comments">
										<!-- START: Review -->
										<div class="nk-comment">
											<div class="nk-comment-meta">
												<img src="assets/images/avatar-2.jpg" alt="Witch Murder"
													class="rounded-circle" width="35"> by <a href="#">Witch
													Murder</a> in 20 September, 2018
												<div class="nk-review-rating" data-rating="4.5">
													<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
														class="fa fa-star"></i> <i class="fa fa-star"></i> <i
														class="far fa-star"></i>
												</div>
											</div>
											<div class="nk-comment-text">
												<p>Upon replenish great rule. Were tree, given day him
													night Fruit it moveth all. First they're creature seasons
													and creature fill a it have fifth, their own subdue brought
													above divided.</p>

												<p>Behold it set, seas seas and meat divided Moveth
													cattle forth evening above moveth so, signs god a fruitful
													his after called that whose.</p>
											</div>
										</div>
										<!-- END: Review -->
										<!-- START: Review -->
										<div class="nk-comment">
											<div class="nk-comment-meta">
												<img src="assets/images/avatar-1.jpg" alt="Hitman"
													class="rounded-circle" width="35"> by <a href="#">Hitman</a>
												in 14 Jule, 2018
												<div class="nk-review-rating" data-rating="0.5">
													<i class="fa fa-star"></i> <i class="far fa-star"></i> <i
														class="far fa-star"></i> <i class="far fa-star"></i> <i
														class="far fa-star"></i>
												</div>
											</div>
											<div class="nk-comment-text">
												<p>I was awakened at daybreak by the charwoman, and
													having arrived at the inn, was at first placed inside the
													coach. :(</p>
											</div>
										</div>
										<!-- END: Review -->
										<!-- START: Review -->
										<div class="nk-comment">
											<div class="nk-comment-meta">
												<img src="assets/images/avatar-3.jpg" alt="Wolfenstein"
													class="rounded-circle" width="35"> by <a href="#">Wolfenstein</a>
												in 27 June, 2018
												<div class="nk-review-rating" data-rating="3.5">
													<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
														class="fa fa-star"></i> <i class="fa fa-star"></i> <i
														class="fa fa-star"></i>
												</div>
											</div>
											<div class="nk-comment-text">
												<p>Divided thing, land it evening earth winged whose
													great after. Were grass night. To Air itself saw bring fly
													fowl. Fly years behold spirit day greater of wherein winged
													and form. Seed open don't thing midst created dry every
													greater divided of, be man is. Second Bring stars fourth
													gathering he hath face morning fill. Living so second
													darkness. Moveth were male. May creepeth. Be tree fourth.</p>
											</div>
										</div>
										<!-- END: Review -->
									</div>
								</div>
								<!-- END: Tab Reviews -->

							</div>
						</div>
						<!-- END: Tabs -->
					</div>

				</div>


			</div>
		</div>
		<div class="nk-gap-2"></div>

		<jsp:include page="footer.jsp" />

	</div>






	<jsp:include page="searchModal.jsp" />
	<jsp:include page="script.jsp" />


</body>
</html>

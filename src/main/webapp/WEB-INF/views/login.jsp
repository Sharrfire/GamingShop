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
</style>
<jsp:include page="header.jsp"></jsp:include>
</head>
<!--
START: Navbar Mobile

Additional Classes:
.nk-navbar-left-side
.nk-navbar-right-side
.nk-navbar-lg
.nk-navbar-overlay-content
-->
<div id="nk-nav-mobile"
	class="nk-navbar nk-navbar-side nk-navbar-right-side nk-navbar-overlay-content d-lg-none">
	<div class="nano">
		<div class="nano-content">
			<a href="/" class="nk-nav-logo"> <img
				src="assets/images/logo.png" alt="" width="120">
			</a>
			<div class="nk-navbar-mobile-content">
				<ul class="nk-nav">
					<!-- Here will be inserted menu from [data-mobile-menu="#nk-nav-mobile"] -->
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END: Navbar Mobile -->




<body>


	<div class="nk-main">

		<!-- START: Breadcrumbs -->
		<div class="nk-gap-1"></div>
		<div class="container">
			<ul class="nk-breadcrumbs">
			<li><a href="home">Home</a></li>
				<li><span class="fa fa-angle-right"></span></li>
				<li><span>Login</span></li>
			</ul>
		</div>
		<!-- END: Breadcrumbs -->
		<div class="container">
			<!-- START: Login Modal -->
			<div class="nk-gap-1"></div>
			<form method="POST" action="login"
				class="nk-form text-white">
				<div class="row vertical-gap">
					<div class="col-md-6">
						<p class="text-danger">${mess}</p>
							
						<label for="">Username <span class="text-main-1"></span>:
						</label> <input type="text" value="" name="username" class=" form-control"
							placeholder="">
						<div class="nk-gap"></div>

						<label for="">Password <span class="text-main-1"></span>:
						
						</label> <input type="password" name="pass" value=""
							class="required form-control" placeholder="">
							
							
						<div class="nk-gap"></div>
						<label for="">Remember me<span class="text-main-1"></span>:
							</label> <input type="checkbox" name="rememberMe" value="Y" />

					<button  type="submit" value=""
							class="nk-btn nk-btn-rounded nk-btn-color-white nk-btn-block">Sign In</button>
					</div>
					
					<div class="col-md-6">
						Or social account:
						<div class="nk-gap"></div>

						<ul class="nk-social-links-2">
							<li><a class="nk-social-facebook" href="#"><span
									class="fab fa-facebook"></span></a></li>
							<li><a class="nk-social-google-plus" href="#"><span
									class="fab fa-google-plus"></span></a></li>
							<li><a class="nk-social-twitter" href="#"><span
									class="fab fa-twitter"></span></a></li>
						</ul>
					</div>
				</div>

				<div class="nk-gap-1"></div>
				<div class="row vertical-gap">
					<div class="col-md-6">
						<div class="mnt-5">
							<small><a href="forgotPass">Forgot your password?</a></small>
						</div>
						<div class="mnt-5">
							<small><a href="signup">Not a member? Sign up</a></small>
						</div>
					</div>
				</div>
			</form>

			<!-- END: Login Modal -->
		</div>

		<div class="nk-gap-2"></div>




		<jsp:include page="footer.jsp" />
	</div>
	<jsp:include page="searchModal.jsp" />
	<jsp:include page="script.jsp" />


</body>
</html>

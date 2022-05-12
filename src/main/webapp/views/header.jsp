<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Title</title>
</head>


<!-- START: Header -->
<header class="nk-header nk-header-opaque">
	<!-- START: Top Contacts -->
	<div class="nk-contacts-top">
		<div class="container">
			<div class="nk-contacts-left">
				<ul class="nk-social-links">
					<li><a class="nk-social-rss" href="#"><span
							class="fa fa-rss"></span></a></li>
					<li><a class="nk-social-twitch" href="#"><span
							class="fab fa-twitch"></span></a></li>
					<li><a class="nk-social-steam" href="#"><span
							class="fab fa-steam"></span></a></li>
					<li><a class="nk-social-facebook" href="#"><span
							class="fab fa-facebook"></span></a></li>
					<li><a class="nk-social-google-plus" href="#"><span
							class="fab fa-google-plus"></span></a></li>
					<li><a class="nk-social-twitter" href="#" target="_blank"><span
							class="fab fa-twitter"></span></a></li>
					<li><a class="nk-social-pinterest" href="#"><span
							class="fab fa-pinterest-p"></span></a></li>

				</ul>
			</div>
			<div class="nk-contacts-right">
				<ul class="nk-contacts-icons">




					<c:if test="${sessionScope.acc ==null}">
						<li><a href="login"> <strong>Login</strong></a></li>
					</c:if>

					<c:if test="${sessionScope.acc.isSell ==1}">
						<li><a href="productManager"> <strong>Manager
									Product</strong></a></li>
					</c:if>
					<c:if test="${sessionScope.acc !=null}">
						<li><strong>Hello ${sessionScope.acc.user} </strong></li>

						<li><a href="logout"> <strong>Logout</strong>
						</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</div>
	<!-- END: Top Contacts -->
	<!--
        START: Navbar

        Additional Classes:
            .nk-navbar-sticky
            .nk-navbar-transparent
            .nk-navbar-autohide
    -->
	<nav
		class="nk-navbar nk-navbar-top nk-navbar-sticky nk-navbar-autohide">
		<div class="container">
			<div class="nk-nav-table">
				<a href="home" class="nk-nav-logo"> <img
					src="assets/images/logo.png" alt="GoodGames" width="199">
				</a>
				<ul class="nk-nav nk-nav-right d-none d-lg-table-cell"
					data-nav-mobile="#nk-nav-mobile">
					<li><a href="home"> Home </a></li>

					<li><a href="#" data-toggle="modal" data-target="#modalSearch">
							Search </a></li>

					<li class=" nk-drop-item"><a href="#"> Category </a>
						<ul class="dropdown">
							<c:forEach var="cate" items="${listCate}">
								<li><a href="category?cid=${cate.cid}" name="${cate.cid}">
										${cate.cname }</a></li>
							</c:forEach>
						</ul></li>

					<li><a href="print"> Cart </a></li>
					<li><a href="checkout"> Checkout </a></li>


				</ul>
				<ul class="nk-nav nk-nav-right nk-nav-icons">

					<li class="single-icon d-lg-none"><a href="#"
						class="no-link-effect" data-nav-toggle="#nk-nav-mobile"> <span
							class="nk-icon-burger"> <span class="nk-t-1"></span> <span
								class="nk-t-2"></span> <span class="nk-t-3"></span>
						</span>
					</a></li>


				</ul>
			</div>
		</div>
	</nav>
	<!-- END: Navbar -->

</header>

<!-- END: Header -->



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






</html>

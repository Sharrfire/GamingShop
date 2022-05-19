<%@page import="entity.Cart"%>
<%@page import="entity.Product"%>
<%@page import="java.util.Collection"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


</head>

<!--
    Additional Classes:
        .nk-page-boxed
-->
<body>

<jsp:include page="header.jsp"/>

<div class="nk-main">

    <!-- START: Breadcrumbs -->
    <div class="nk-gap-1"></div>
    <div class="container">
        <ul class="nk-breadcrumbs">


            <li><a href="home">Home</a></li>

            <li>
                <svg class="svg-inline--fa fa-angle-right fa-w-8"
                     aria-hidden="true" data-prefix="fa" data-icon="angle-right"
                     role="img" xmlns="http://www.w3.org/2000/svg"
                     viewBox="0 0 256 512" data-fa-i2svg="">
                    <path fill="currentColor"
                          d="M224.3 273l-136 136c-9.4 9.4-24.6 9.4-33.9 0l-22.6-22.6c-9.4-9.4-9.4-24.6 0-33.9l96.4-96.4-96.4-96.4c-9.4-9.4-9.4-24.6 0-33.9L54.3 103c9.4-9.4 24.6-9.4 33.9 0l136 136c9.5 9.4 9.5 24.6.1 34z"></path>
                </svg>
                <!-- <span class="fa fa-angle-right"></span> --></li>

            <li><span>Cart</span></li>

        </ul>
    </div>
    <div class="nk-gap-1"></div>
    <!-- END: Breadcrumbs -->
    <div class="container">
        <div class="nk-store nk-store-cart">
            <div class="table-responsive">

                <!-- START: Products in Cart -->
                <table class="table nk-store-cart-products">
                    <tbody>
                    <tr>
                        <td class="nk-product-cart-title">
                            <h5 class="h6">Image</h5>
                        </td>
                        <td class="nk-product-cart-title">
                            <h5 class="h6">Product</h5>
                        </td>
                        <td class="nk-product-cart-price">
                            <h5 class="h6">Price</h5>
                        </td>
                        <td class="nk-product-cart-quantity">
                            <h5 class="h6">Quantity</h5>
                        </td>
                        <td class="nk-product-cart-remove">
                            <h5 class="h6">Action</h5>
                        </td>
                    </tr>
					<% Cart c= Cart.getCart(session);
						Collection<Product> data= c.getData();
						request.setAttribute("data", data);
					%>

                    <c:forEach items="${data}" var="o">
                        <tr>
                            <td class="nk-product-cart-thumb"><a href="product?id=${o.id}"
                                                                 class="nk-image-box-1 nk-post-image"> <img
                                    src="${o.image}" alt="${o.name}" width="115" height="auto">
                            </a></td>
                            <td class="nk-product-cart-title">
                                <div class="nk-gap-1"></div>
                                <h2 class="nk-post-title h4">
                                    <p>${o.name}</p>
                                </h2>
                            </td>
                            <td class="nk-product-cart-price">
                                <div class="nk-gap-1"></div>
                                <strong>${o.price}$</strong>
                            </td>
                            <td class="nk-product-cart-quantity">
                                <div class="nk-gap-1"></div>
                                <div class="nk-form">
                                    <a href="sub?id=${o.id}">
                                        <button class="btnSub">-</button>
                                    </a>
                                    <strong>${total}</strong> <a href="cart?id=${o.id}">
                                    <button
                                            class="btnAdd">+
                                    </button>
                                </a>
                                </div>
                            </td>
                            <td class="nk-product-cart-remove"><a
                                    href="removeProduct?id=${o.id}"><span
                                    class="ion-android-close"></span></a></td>
                        </tr>
                    </c:forEach>
                    
                    </tbody>
                </table>
                <%--                <!-- END: Products in Cart -->--%>
            </div>
            <div class="nk-gap-1"></div>
            <a class="nk-btn nk-btn-rounded nk-btn-color-white float-right"
               href="category">Buy More</a>

            <div class="clearfix"></div>
            <div class="nk-gap-2"></div>
            <div class="row vertical-gap">

                <div class="col-md-12">


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


                            <tr class="nk-store-cart-totals-total">
                                <td>Total</td>
                                <td>${vat}$</td>
                            </tr>


                            </tbody>
                        </table>
                    </div>
                    <!-- END: Order Products -->

                </div>
            </div>

            <div class="nk-gap-2"></div>
            <a class="nk-btn nk-btn-rounded nk-btn-color-main-1 float-right"
               href="checkout">Checkout</a>
            <div class="clearfix"></div>
            <div class="nk-gap-2"></div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>


</div>


<jsp:include page="searchModal.jsp"/>
<jsp:include page="script.jsp"/>


</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>


<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>GoodGames | Community and Store HTML Game Template</title>

    <meta name="description" content="GoodGames - Bootstrap template for communities and games store">
    <meta name="keywords" content="game, gaming, template, HTML template, responsive, Bootstrap, premium">
    <meta name="author" content="_nK">

    <link rel="icon" type="image/png" href="assets/images/favicon.png">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- START: Styles -->

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700%7cOpen+Sans:400,700" rel="stylesheet"
          type="text/css">

    <!-- Bootstrap -->
    <link rel="stylesheet" href="assets/vendor/bootstrap/dist/css/bootstrap.min.css">

    <!-- FontAwesome -->
    <script defer src="assets/vendor/fontawesome-free/js/all.js"></script>
    <script defer src="assets/vendor/fontawesome-free/js/v4-shims.js"></script>

    <!-- IonIcons -->
    <link rel="stylesheet" href="assets/vendor/ionicons/css/ionicons.min.css">

    <!-- Flickity -->
    <link rel="stylesheet" href="assets/vendor/flickity/dist/flickity.min.css">

    <!-- Photoswipe -->
    <link rel="stylesheet" type="text/css" href="assets/vendor/photoswipe/dist/photoswipe.css">
    <link rel="stylesheet" type="text/css" href="assets/vendor/photoswipe/dist/default-skin/default-skin.css">

    <!-- Seiyria Bootstrap Slider -->
    <link rel="stylesheet" href="assets/vendor/bootstrap-slider/dist/css/bootstrap-slider.min.css">

    <!-- Summernote -->
    <link rel="stylesheet" type="text/css" href="assets/vendor/summernote/dist/summernote-bs4.css">

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
    <div class="container">
        <div class="nk-store nk-store-cart">
            <div class="table-responsive">

                <!-- START: Products in Cart -->
                <table class="table nk-store-cart-products">
                    <tbody>

                    <tr>
                        <td class="nk-product-cart-thumb">
                            <a href="store-product.html" class="nk-image-box-1 nk-post-image">
                                <img src="assets/images/product-2-xs.jpg" alt="However, I have reason" width="115">
                            </a>
                        </td>
                        <td class="nk-product-cart-title">
                            <h5 class="h6">Product:</h5>
                            <div class="nk-gap-1"></div>

                            <h2 class="nk-post-title h4">
                                <a href="store-product.html">However, I have reason</a>
                            </h2>
                        </td>
                        <td class="nk-product-cart-price">
                            <h5 class="h6">Price:</h5>
                            <div class="nk-gap-1"></div>

                            <strong>€ 32.00</strong>
                        </td>
                        <td class="nk-product-cart-quantity">
                            <h5 class="h6">Quantity:</h5>
                            <div class="nk-gap-1"></div>

                            <div class="nk-form">
                                <input type="number" class="form-control" value="1" min="1" max="21">
                            </div>
                        </td>
                        <td class="nk-product-cart-total">
                            <h5 class="h6">Total:</h5>
                            <div class="nk-gap-1"></div>

                            <strong>€ 32.00</strong>
                        </td>
                        <td class="nk-product-cart-remove"><a href="#"><span class="ion-android-close"></span></a></td>
                    </tr>

                    <tr>
                        <td class="nk-product-cart-thumb">
                            <a href="store-product.html" class="nk-image-box-1 nk-post-image">
                                <img src="assets/images/product-4-xs.jpg" alt="She was bouncing" width="115">
                            </a>
                        </td>
                        <td class="nk-product-cart-title">
                            <h5 class="h6">Product:</h5>
                            <div class="nk-gap-1"></div>

                            <h2 class="nk-post-title h4">
                                <a href="store-product.html">She was bouncing</a>
                            </h2>
                        </td>
                        <td class="nk-product-cart-price">
                            <h5 class="h6">Price:</h5>
                            <div class="nk-gap-1"></div>

                            <strong>€ 20.00</strong>
                        </td>
                        <td class="nk-product-cart-quantity">
                            <h5 class="h6">Quantity:</h5>
                            <div class="nk-gap-1"></div>

                            <div class="nk-form">
                                <input type="number" class="form-control" value="1" min="1" max="21">
                            </div>
                        </td>
                        <td class="nk-product-cart-total">
                            <h5 class="h6">Total:</h5>
                            <div class="nk-gap-1"></div>

                            <strong>€ 20.00</strong>
                        </td>
                        <td class="nk-product-cart-remove"><a href="#"><span class="ion-android-close"></span></a></td>
                    </tr>

                    </tbody>
                </table>
                <!-- END: Products in Cart -->

            </div>
            <div class="nk-gap-1"></div>
            <a class="nk-btn nk-btn-rounded nk-btn-color-white float-right" href="#">Update Cart</a>

            <div class="clearfix"></div>
            <div class="nk-gap-2"></div>
            <div class="row vertical-gap">
                <div class="col-md-6">

                    <!-- START: Calculate Shipping -->
                    <h3 class="nk-title h4">Calculate Shipping</h3>
                    <form action="#" class="nk-form" novalidate="novalidate">
                        <label for="country-sel">Country <span class="text-main-1">*</span>:</label>
                        <select name="country" class="form-control required" id="country-sel">
                            <option value="">Select a country...</option>
                        </select>

                        <div class="nk-gap-1"></div>
                        <div class="row vertical-gap">
                            <div class="col-sm-6">
                                <label for="state">State / Country <span class="text-main-1">*</span>:</label>
                                <input type="text" class="form-control required" name="state" id="state">
                            </div>
                            <div class="col-sm-6">
                                <label for="zip">Postcode / ZIP <span class="text-main-1">*</span>:</label>
                                <input type="tel" class="form-control required" name="zip" id="zip">
                            </div>
                        </div>

                        <div class="nk-gap-1"></div>
                        <a class="nk-btn nk-btn-rounded nk-btn-color-white float-right" href="#">Update Totals</a>
                    </form>
                    <!-- END: Calculate Shipping -->

                </div>
                <div class="col-md-6">
                    <!-- START: Cart Totals -->
                    <h3 class="nk-title h4">Cart Totals</h3>
                    <table class="nk-table nk-table-sm">
                        <tbody>
                        <tr class="nk-store-cart-totals-subtotal">
                            <td>
                                Subtotal
                            </td>
                            <td>
                                € 52.00
                            </td>
                        </tr>
                        <tr class="nk-store-cart-totals-shipping">
                            <td>
                                Shipping
                            </td>
                            <td>
                                Free Shipping
                            </td>
                        </tr>
                        <tr class="nk-store-cart-totals-total">
                            <td>
                                Total
                            </td>
                            <td>
                                € 52.00
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <!-- END: Cart Totals -->
                </div>
            </div>

            <div class="nk-gap-2"></div>
            <a class="nk-btn nk-btn-rounded nk-btn-color-main-1 float-right" href="store-checkout.html">Proceed to Checkout</a>
            <div class="clearfix"></div>
            <div class="nk-gap-2"></div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>


</div>



<jsp:include page="searchModal.jsp"/>
<jsp:include page="loginModal.jsp"/>
<jsp:include page="script.jsp"/>


</body>
</html>

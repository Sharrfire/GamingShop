<%--
  Created by IntelliJ IDEA.
  User: Sharrfire
  Date: 12-Nov-21
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<!-- START: Footer -->
<footer class="nk-footer">

    <div class="container">
        <div class="nk-gap-3"></div>
        <div class="row vertical-gap">
            <div class="col-md-6">
                <div class="nk-widget">
                    <h4 class="nk-widget-title"><span class="text-main-1">Contact</span> With Us</h4>
                    <div class="nk-widget-content">
                        <form action="php/ajax-contact-form.php" class="nk-form nk-form-ajax">
                            <div class="row vertical-gap sm-gap">
                                <div class="col-md-6">
                                    <input type="email" class="form-control required" name="email"
                                           placeholder="Email *">
                                </div>
                                <div class="col-md-6">
                                    <input type="text" class="form-control required" name="name"
                                           placeholder="Name *">
                                </div>
                            </div>
                            <div class="nk-gap"></div>
                            <textarea class="form-control required" name="message" rows="5"
                                      placeholder="Message *"></textarea>
                            <div class="nk-gap-1"></div>
                            <button class="nk-btn nk-btn-rounded nk-btn-color-white">
                                <span>Send</span>
                                <span class="icon"><i class="ion-paper-airplane"></i></span>
                            </button>
                            <div class="nk-form-response-success"></div>
                            <div class="nk-form-response-error"></div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="nk-widget">
                    <div class="nk-widget-content">
                        <div class="row vertical-gap sm-gap">
                            <div class="col-lg-6">
                                <div class="nk-widget-post-2">
                                    <div class="address"><h4 class="nk-widget-title"><span class="text-main-1">Address</span>
                                    </h4><h6>84/418 Bien Hoa City, Dong Nai Province</h6><h6>Phone : 0704614563</h6>
                                        <h6>Email : 17130209@st.hcmuaf.edu.vn</h6></div>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="nk-widget-post-2">
                                    <div class="address"><h4 class="nk-widget-title"><span class="text-main-1">Contact </span>Time
                                    </h4><h6>Monday - Friday : 7am - 10pm</h6>
                                        <h6>Saturday - Sunday: 8am - 10pm</h6>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="nk-gap-3"></div>
    </div>

    <div class="nk-copyright">
        <div class="container">
            <div class="nk-copyright-left">
                <a target="_blank" href="https://www.templateshub.net">Templates Hub</a>
            </div>
            <div class="nk-copyright-right">
                <ul class="nk-social-links-2">
                    <li><a class="nk-social-rss" href="#"><span class="fa fa-rss"></span></a></li>
                    <li><a class="nk-social-twitch" href="#"><span class="fab fa-twitch"></span></a></li>
                    <li><a class="nk-social-steam" href="#"><span class="fab fa-steam"></span></a></li>
                    <li><a class="nk-social-facebook" href="#"><span class="fab fa-facebook"></span></a></li>
                    <li><a class="nk-social-google-plus" href="#"><span class="fab fa-google-plus"></span></a></li>
                    <li><a class="nk-social-twitter" href="#" target="_blank"><span
                            class="fab fa-twitter"></span></a></li>
                    <li><a class="nk-social-pinterest" href="#"><span class="fab fa-pinterest-p"></span></a></li>

                    <!-- Additional Social Buttons
                        <li><a class="nk-social-behance" href="#"><span class="fab fa-behance"></span></a></li>
                        <li><a class="nk-social-bitbucket" href="#"><span class="fab fa-bitbucket"></span></a></li>
                        <li><a class="nk-social-dropbox" href="#"><span class="fab fa-dropbox"></span></a></li>
                        <li><a class="nk-social-dribbble" href="#"><span class="fab fa-dribbble"></span></a></li>
                        <li><a class="nk-social-deviantart" href="#"><span class="fab fa-deviantart"></span></a></li>
                        <li><a class="nk-social-flickr" href="#"><span class="fab fa-flickr"></span></a></li>
                        <li><a class="nk-social-foursquare" href="#"><span class="fab fa-foursquare"></span></a></li>
                        <li><a class="nk-social-github" href="#"><span class="fab fa-github"></span></a></li>
                        <li><a class="nk-social-instagram" href="#"><span class="fab fa-instagram"></span></a></li>
                        <li><a class="nk-social-linkedin" href="#"><span class="fab fa-linkedin"></span></a></li>
                        <li><a class="nk-social-medium" href="#"><span class="fab fa-medium"></span></a></li>
                        <li><a class="nk-social-odnoklassniki" href="#"><span class="fab fa-odnoklassniki"></span></a></li>
                        <li><a class="nk-social-paypal" href="#"><span class="fab fa-paypal"></span></a></li>
                        <li><a class="nk-social-reddit" href="#"><span class="fab fa-reddit"></span></a></li>
                        <li><a class="nk-social-skype" href="#"><span class="fab fa-skype"></span></a></li>
                        <li><a class="nk-social-soundcloud" href="#"><span class="fab fa-soundcloud"></span></a></li>
                        <li><a class="nk-social-slack" href="#"><span class="fab fa-slack"></span></a></li>
                        <li><a class="nk-social-tumblr" href="#"><span class="fab fa-tumblr"></span></a></li>
                        <li><a class="nk-social-vimeo" href="#"><span class="fab fa-vimeo"></span></a></li>
                        <li><a class="nk-social-vk" href="#"><span class="fab fa-vk"></span></a></li>
                        <li><a class="nk-social-wordpress" href="#"><span class="fab fa-wordpress"></span></a></li>
                        <li><a class="nk-social-youtube" href="#"><span class="fab fa-youtube"></span></a></li>
                    -->
                </ul>
            </div>
        </div>
    </div>
</footer>
<!-- END: Footer -->

</html>

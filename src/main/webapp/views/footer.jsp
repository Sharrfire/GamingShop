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

  
        </div>
    </div>
</footer>
<!-- END: Footer -->

</html>

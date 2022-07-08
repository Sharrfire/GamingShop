package control;

import dao.CategoryDAO;
import entity.Cart;
import entity.Category;
import entity.Product;

import javax.mail.internet.MimeMultipart;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@WebServlet("/checkoutSubmit")
public class CheckoutSubmitControl extends HttpServlet {
    public static final String HOST_NAME = "smtp.gmail.com";
    public static final int TSL_PORT = 587; // Port for TLS/STARTTLS
    public static final String APP_EMAIL = "dinhngocthai0205@gmail.com"; // your email
    public static final String APP_PASSWORD = "mwmdmnzepubcoeop"; // your password

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //Get params
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String lname = request.getParameter("lname");
        String fname = request.getParameter("fname");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String notes = request.getParameter("notes");

        CategoryDAO cdao = new CategoryDAO();
        HttpSession session1 = request.getSession();
        Cart cart = Cart.getCart(session1);
        double total = cart.total();
        Collection<Product> data = cart.getData();
        List<Category> listCate = cdao.getAllCategory();
        //set variable

        request.setAttribute("data", data);
        request.setAttribute("total", total);
        request.setAttribute("listCate", listCate);
        String listProduct = " ";
        for (Product p : data) {
            listProduct += p.getName() + ", \n  ";
        }
        // Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", HOST_NAME);
        props.put("mail.smtp.port", TSL_PORT);
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        // get Session
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(APP_EMAIL, APP_PASSWORD);
            }
        });
        // compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("Your order is successfully");
            if(notes==null){
                message.setText("Billing detail: \n" +
                                " Name : " + fname + lname + "\n"
                                + " Phone: " + phone + "\n"
                                + " Address: " + address + "\n"
                                + " City: " + city + "\n"
                                + "Your order: " + listProduct + "\n"
                                + "Total: "+ total + "$"+"\n"
                        , "UTF-8");
            }else{
                message.setText("Billing detail: \n" +
                        " Name : " + fname + lname + "\n"
                                + " Phone: " + phone + "\n"
                                + " Address: " + address + "\n"
                                + " City: " + city + "\n"
                                + " Notes: " + notes + "\n"
                                + "Your order: " + listProduct + "\n"
                                + "Total: "+ total + "$"+"\n"
                        , "UTF-8");
            }
            // send message
            Transport.send(message);
            System.out.println("Message sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        //RemoveData from cart
        data.removeAll(data);
        response.sendRedirect("home");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Product;

/**
 * Servlet implementation class OrderControl
 */
@WebServlet("/order")
public class OrderControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		  Cookie arr[] = request.getCookies();
	        List<Product> list = new ArrayList<>();
	        DAO dao = new DAO();
	        for (Cookie o : arr) {
	            if (o.getName().equals("id")) {
	                String txt[] = o.getValue().split(",");
	                for (String s : txt) {
	                    list.add(dao.getProductByID(s));
	                }
	            }
	        }
	        for (int i = 0; i < list.size(); i++) {
	            int count = 1;
	            for (int j = i+1; j < list.size(); j++) {
	                if(list.get(i).getId() == list.get(j).getId()){
	                    count++;
	                    list.remove(j);
	                    j--;
	                    list.get(i).setAmount(count);
	                }
	            }
	        }
	        for (Cookie o : arr) {
	            o.setMaxAge(0);
	            response.addCookie(o);
	        }
	        response.sendRedirect("Home.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package control;

import dao.DAO;
import entity.Cart;
import entity.Category;
import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Servlet implementation class CartControl
 */
@WebServlet("/checkout")
public class CheckoutControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckoutControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO dao = new DAO();

		List<Category> listCate = dao.getAllCategory();

		HttpSession session = request.getSession();
		Cart cart = Cart.getCart(session);

		double total = cart.total();

		Collection<Product> data = cart.getData();
		request.setAttribute("data", data);
		request.setAttribute("listCate", listCate);
		request.setAttribute("total", total);



		request.setAttribute("listCate", listCate);
		request.getRequestDispatcher("/views/checkout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}

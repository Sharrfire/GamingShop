package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
import entity.Cart;
import entity.Product;

/**
 * Servlet implementation class AddCartControl
 */
@WebServlet("/addCart")
public class AddCartControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCartControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		ProductDAO productDao = new ProductDAO();
		Product p = productDao.getProductByID(id);
		if (p == null || id == null) {
			response.sendRedirect("home");
			return;
		}

		HttpSession session = request.getSession();
		Cart cart = Cart.getCart(session);
		cart.put(p);
		cart.commit(session);
		response.sendRedirect("cart");

	}

}

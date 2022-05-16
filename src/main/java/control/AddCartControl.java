package control;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.Cart;
import entity.Category;
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
		DAO dao = new DAO();
		Product p = dao.getProductByID(id);
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

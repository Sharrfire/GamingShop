package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.Cart;
import entity.Product;

/**
 * Servlet implementation class RemoveCartControl
 */
@WebServlet("/removeCart")
public class RemoveCartControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveCartControl() {
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
		if (id == null)
			response.sendRedirect("home");
		HttpSession session = request.getSession();
		Cart cart = Cart.getCart(session);
		cart.remove(id);
		cart.commit(session);
		response.sendRedirect("cart");

	}

}

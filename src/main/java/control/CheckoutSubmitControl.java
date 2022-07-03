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

import dao.CategoryDAO;
import dao.DAO;
import entity.Cart;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class CheckoutSubmitControl
 */
@WebServlet("/CheckoutSubmit")
public class CheckoutSubmitControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckoutSubmitControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		CategoryDAO cdao = new CategoryDAO();

		HttpSession session = request.getSession();
		String fname = request.getParameter("fname");

		Cart cart = Cart.getCart(session);

		double total = cart.total();

		Collection<Product> data = cart.getData();
		List<Category> listCate = cdao.getAllCategory();


			request.setAttribute("data", data);
			request.setAttribute("total", total);
			request.setAttribute("listCate", listCate);
		
			data.removeAll(data);
			response.sendRedirect("home");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

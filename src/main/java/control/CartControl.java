package control;

import java.io.IOException;
import java.text.DecimalFormat;
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
 * Servlet implementation class CartControl
 */
@WebServlet("/cart")
public class CartControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartControl() {
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
		Cart cart = Cart.getCart(session);

		double total = cart.total();
		Collection<Product> data = cart.getData();
		boolean checkData= data.isEmpty();
		request.setAttribute("data", data);
		List<Category> listCate = cdao.getAllCategory();
		request.setAttribute("listCate", listCate);
		request.setAttribute("total", total);
		request.setAttribute("check", checkData);


		request.getRequestDispatcher("/views/cart.jsp").forward(request, response);
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

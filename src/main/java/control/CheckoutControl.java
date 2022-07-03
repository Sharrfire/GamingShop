package control;

import dao.CategoryDAO;
import dao.ProductDAO;
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

		CategoryDAO cdao = new CategoryDAO();
		List<Category> listCate = cdao.getAllCategory();
		HttpSession session = request.getSession();
		Cart cart = Cart.getCart(session);
		double total = cart.total();
		Collection<Product> data = cart.getData();
		boolean checkData = data.isEmpty();
		request.setAttribute("listCate", listCate);

//Check Cart is empty
		if (data.isEmpty()) {
			request.setAttribute("mess", "Your cart is empty");
			request.setAttribute("check", checkData);
			request.getRequestDispatcher("/views/cart.jsp").forward(request, response);
		} else {
			request.setAttribute("data", data);
			request.setAttribute("total", total);
			request.getRequestDispatcher("/views/checkout.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

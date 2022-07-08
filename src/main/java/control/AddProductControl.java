package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CategoryDAO;
import dao.ProductDAO;
import entity.Account;

/**
 * Servlet implementation class addProductControl
 */
@WebServlet("/addProduct")
public class AddProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductControl() {
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
		ProductDAO productDao = new ProductDAO();

		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String image = request.getParameter("image");
		String shortDescription = request.getParameter("shortDescription");
		String description = request.getParameter("description");
		String soldAmount = request.getParameter("soldAmount");
		String category = request.getParameter("category");
		int soldAmountInteger = Integer.parseInt(soldAmount);
		int categorytInteger = Integer.parseInt(category);

		HttpSession session = request.getSession();
		Account a = (Account) session.getAttribute("acc");
		int sid = a.getId();
		productDao.insertProduct(name, Double.parseDouble(price), image, shortDescription, description, soldAmountInteger,
				categorytInteger, sid);


		response.sendRedirect("productManager");

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

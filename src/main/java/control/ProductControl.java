package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class ProductControl
 */
@WebServlet("/product")
public class ProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pID = request.getParameter("id");
		// b1: get data from dao
		DAO dao = new DAO();
		List<Category> listCate = dao.getAllCategory();
		Product p= dao.getProductByID(pID);
		Category c= dao.getCategoryByProductID(pID);

		// b2: set data to jsp
		request.setAttribute("listCate", listCate);
		request.setAttribute("p", p);
		request.setAttribute("c", c);


		request.getRequestDispatcher("/WEB-INF/views/product.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public static void main(String[] args) {
		DAO dao = new DAO();

		Category c1 = dao.getCategoryByProductID("1");

		System.out.println(c1.toString());

	}


}

package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class productManagerControl
 */
@WebServlet("/productManager")
public class ProductManagerControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductManagerControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		Account a= (Account) session.getAttribute("acc");

		if(a == null) {
			DAO dao = new DAO();
			List<Product> list = dao.getAllProduct();
			List<Product> listT10 = dao.getTop10Product();
			List<Product> listGOTY = dao.getGOTY();
			List<Product> listLatest = dao.getLast();
			List<Category> listCate = dao.getAllCategory();

			// b2: set data to jsp
			request.setAttribute("listP", list);
			request.setAttribute("listT10", listT10);
			request.setAttribute("listGOTY", listGOTY);
			request.setAttribute("listLatest", listLatest);
			request.setAttribute("listCate", listCate);
			request.setAttribute("mess", "Back to home!");
			request.getRequestDispatcher("/views/home.jsp").forward(request, response);
		}else {


			int id= a.getId();
			DAO dao = new DAO();
			List<Product> listP= dao.getProductBySellID(id);
			List<Category> listCC= dao.getAllCategory();

			request.setAttribute("listP", listP);
			request.setAttribute("listCC", listCC);

			request.getRequestDispatcher("/views/ManagerProduct.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

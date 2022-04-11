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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pID = request.getParameter("id");
		// b1: get data from dao
		DAO dao = new DAO();
		List<Category> listCate = dao.getAllCategory();
		Product p = dao.getProductByID(pID);
		String cID= String.valueOf(p.getcID());
		Category c= dao.getCategoryByProductID(cID);
		// b2: set data to jsp
		request.setAttribute("c", c);
		request.setAttribute("p", p);
		request.setAttribute("listCate", listCate);
	

		request.getRequestDispatcher("/views/product.jsp").forward(request, response);
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


	public static void main(String[] args) {
		DAO dao = new DAO();
//		Product p1 = dao.getProductByID("8");
//		Category c = dao.getCategoryByProductID(String.valueOf(p1.getcID()) );
//		System.out.println(c.toString());

//		List<Product> listP = dao.getProductBySellID(3);
//		List<Category> listC = dao.getAllCategory();
//		Account a1 = dao.login("thai", "123");
//		System.out.println(p1.toString());

//		for (Product p : listP) {
//			System.out.println(p.toString());
//		}
//        for (Category cate : listC) {
//            System.out.println(c.toString());
//        }

	}
}

package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dao.DAO;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class LoadProduct
 */
@WebServlet("/loadProduct")
public class LoadProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pID = request.getParameter("pid");
		// b1: get data from dao
		DAO dao = new DAO();
		CategoryDAO cdao= new CategoryDAO();

		List<Category> listCate = cdao.getAllCategory();
		Product p = dao.getProductByID(pID);
		// b2: set data to jsp
		request.setAttribute("detail", p);
		request.setAttribute("listCC", listCate);
	

		request.getRequestDispatcher("/views/edit.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

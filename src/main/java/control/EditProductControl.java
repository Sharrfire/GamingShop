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
 * Servlet implementation class LoadProduct
 */
@WebServlet("/edit")
public class EditProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProductControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pid = request.getParameter("id");
		String pname = request.getParameter("name");
		String pimage = request.getParameter("image");
		String price  = request.getParameter("price");
		String pshortDescription = request.getParameter("shortDescription");
		String pDescription = request.getParameter("description");
		String pcategory = request.getParameter("category");

		// b1: get data from dao
		DAO dao = new DAO();
		dao.editProductName(pname,price, pimage, pshortDescription, pDescription,pcategory, pid);
	
//		(String name, String price,String image,String shortDescription,String description,String category,String pid) {

		response.sendRedirect("productManager");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

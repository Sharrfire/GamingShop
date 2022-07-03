
package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dao.ProductDAO;
import entity.Product;
import entity.Category;

import java.io.IOException;
import java.util.List;

@WebServlet("/home")

public class HomeControl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// b1: get data from dao
		ProductDAO productDao = new ProductDAO();
		CategoryDAO cdao= new CategoryDAO();
		List<Product> list = productDao.getAllProduct();
		List<Product> listT10 = productDao.getTop10Product();
		List<Product> listGOTY = productDao.getGOTY();
		List<Product> listLatest = productDao.getLast();
		List<Category> listCate = cdao.getAllCategory();

		// b2: set data to jsp
		request.setAttribute("listP", list);
		request.setAttribute("listT10", listT10);
		request.setAttribute("listGOTY", listGOTY);
		request.setAttribute("listLatest", listLatest);
		request.setAttribute("listCate", listCate);

		request.getRequestDispatcher("/views/home.jsp").forward(request, response);
		// 404 -> url
		// 500 -> jsp properties
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

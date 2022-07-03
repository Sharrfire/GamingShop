package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAO;
import dao.CategoryDAO;
import dao.ProductDAO;
import entity.Account;
import entity.Category;

/**
 * Servlet implementation class SignUpControl
 */
@WebServlet("/signup")
public class SignUpControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String test;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpControl() {
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
		CategoryDAO cdao = new CategoryDAO();
		AccountDAO adao= new AccountDAO();

		List<Category> listCate = cdao.getAllCategory();
		request.setAttribute("listCate", listCate);

		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String re_pass = request.getParameter("repass");
		if(pass==null) {
			request.getRequestDispatcher("/views/signUp.jsp").forward(request, response);
		}else {
			Account a = adao.checkAcountExist(username);
			if(!pass.equals(re_pass)) {
				request.setAttribute("mess", "Pass and RePass must be the same");
				request.getRequestDispatcher("/views/signUp.jsp").forward(request, response);
			}else if(a==null) {
				adao.signup(username, pass);
				response.sendRedirect("login");

			}else {
				request.setAttribute("mess", "Pass and RePass must be the same");
				request.getRequestDispatcher("/views/signUp.jsp").forward(request, response);

			}
		
		}

	}
	// signup

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

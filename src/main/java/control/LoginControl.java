package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CategoryDAO;
import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/login")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= request.getParameter("username");
		String pass= request.getParameter("pass");
		DAO dao= new DAO();
		CategoryDAO cdao= new CategoryDAO();

		List<Category> listCate = cdao.getAllCategory();
		// b2: set data to jsp
		request.setAttribute("listCate", listCate);
		
		Boolean checkValid=dao.checkLogin(username, pass);
		Account a= dao.login(username, pass);
		if(pass==null) { //fix truong hop message loi xuat hien khi moi load trang
			request.getRequestDispatcher("/views/login.jsp").forward(request, response);
		}else {
		if(a==null) {
			request.setAttribute("mess", "Wrong Username or password");
			request.getRequestDispatcher("/views/login.jsp").forward(request, response);

		}else {
			HttpSession session=request.getSession();
			session.setAttribute("acc", a);
			session.setMaxInactiveInterval(300);
			response.sendRedirect("home");
		}
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

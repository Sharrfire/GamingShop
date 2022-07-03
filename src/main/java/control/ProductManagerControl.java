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
import dao.ProductDAO;
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
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        ProductDAO productDao = new ProductDAO();
        CategoryDAO cdao = new CategoryDAO();

        List<Product> listT10 = productDao.getTop10Product();
        List<Product> listGOTY = productDao.getGOTY();
        List<Product> listLatest = productDao.getLast();
        List<Category> listCate = cdao.getAllCategory();
        List<Product> listP = productDao.getAllProduct();


        // b2: set data to jsp

        request.setAttribute("listP", listP);
        request.setAttribute("listT10", listT10);
        request.setAttribute("listGOTY", listGOTY);
        request.setAttribute("listLatest", listLatest);
        request.setAttribute("listCate", listCate);

        request.setAttribute("mess", "Back to home!");
        if (a == null) {
            request.getRequestDispatcher("/views/home.jsp").forward(request, response);
        } else {
            int id = a.getId();
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

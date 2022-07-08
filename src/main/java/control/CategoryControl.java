package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dao.ProductDAO;
import dao.PaginationDAO;
import entity.Category;
import entity.Product;

/**
 * Servlet implementation class categoryControl
 */
@WebServlet("/category")
public class CategoryControl extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryControl() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cateID = request.getParameter("cid");
        String pageIndex = request.getParameter("index");
//        System.out.println(pageIndex);
        if (pageIndex == null)
            pageIndex = "1";
        if (cateID == null) {
            doGet_DisplayAll(request, response);
        } else {
            PaginationDAO pdao = new PaginationDAO();
            CategoryDAO cdao = new CategoryDAO();
            Category c = cdao.getCategoryByID(cateID);
            int cateIdToInt= Integer.parseInt(cateID);
            int id = Integer.parseInt(pageIndex);
            int numberPage = pdao.getNumberPageByCateId(cateIdToInt);





            List<Category> listCate = cdao.getAllCategory();
            List<Product> listProductByID = pdao.getByIdPaginProduct(cateID, id);

            // b2: set data to jsp
            request.setAttribute("numberPage", numberPage);
            request.setAttribute("listProductByID", listProductByID);
            request.setAttribute("cate", c);
            request.setAttribute("listCate", listCate);
            request.setAttribute("pageIndex", pageIndex);
            request.setAttribute("cateID", cateID);

            request.getRequestDispatcher("/views/category.jsp").forward(request, response);

        }

    }

    protected void doGet_DisplayAll(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        CategoryDAO cdao = new CategoryDAO();
        PaginationDAO pdao = new PaginationDAO();
        String pageIndex = request.getParameter("index");

        if (pageIndex == null)
            pageIndex = "1";
        int id = Integer.parseInt(pageIndex);
        int numberPage = pdao.getNumberPage();
        List<Product> listProductByID = pdao.getAllPaginProduct(id);
        List<Category> listCate = cdao.getAllCategory();
        request.setAttribute("listCate", listCate);
        request.setAttribute("listProductByID", listProductByID);
        request.setAttribute("numberPage", numberPage);
        request.setAttribute("pageIndex", pageIndex);

        request.getRequestDispatcher("views/category.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

    public static void main(String[] args) {

        PaginationDAO pdao = new PaginationDAO();
//	Product p1 = dao.getProductByID("1");
        List<Product> listP = pdao.getAllPaginProduct(1);

        for (Product p : listP) {
            System.out.println(p.toString());
        }
    }

}

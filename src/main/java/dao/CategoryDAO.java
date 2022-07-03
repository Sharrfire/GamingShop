package dao;

import context.DBContext;
import entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // Get Category By Product ID
    public Category getCategoryByProductID(String id) {
        String query = "SELECT * FROM category INNER JOIN product WHERE product.cID=?  and  product.cID=category.cID limit 1";
        try {
            new DBContext();
            conn = DBContext.getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(rs.getInt(1), rs.getString(2));

            }
        } catch (Exception e) {
        }
        return null;
    }

    // Get CategoryByID
    public Category getCategoryByID(String cid) {
        String query = "SELECT * from Category WHERE cid=?";
        try {
            new DBContext();
            conn = DBContext.getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    // Get All Category
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            new DBContext();
            conn = DBContext.getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        CategoryDAO cdao= new CategoryDAO();
        Category c= cdao.getCategoryByID("1");
        System.out.println(c);
    }
}

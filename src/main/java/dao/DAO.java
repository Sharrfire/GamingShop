package dao;

import entity.Account;
import entity.Category;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;

/**
 *
 * @author trinh
 */
public class DAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	// Get All
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		String query = "select * from product";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}
	// Get Top 10

	public List<Product> getTop10Product() {
		List<Product> list = new ArrayList<Product>();
		String query = "select * from product  ORDER BY soldAmount DESC LIMIT 8";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	// Get Game of the Year
	public List<Product> getGOTY() {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product ORDER BY RAND() LIMIT 5";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	// Get Latest product
	public List<Product> getLast() {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product  ORDER BY ID  DESC LIMIT 12";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	// Get Latest product
	public List<Product> getProductByCID(String cid) {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product WHERE CID = ?";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	// Search Product by name
	public List<Product> getProductByName(String txtSearch) {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product WHERE name LIKE ?";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1,"%"+txtSearch+"%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}


	// Get Product by ID
	public Product getProductByID(String id) {
		String query = "SELECT * FROM product WHERE ID = ?";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
			}
		} catch (Exception e) {
		}
		return null;
	}

	// Get Category By Product ID
	public Category getCategoryByProductID(String id) {
		String query = "SELECT * FROM category INNER JOIN product WHERE product.cID=category.cID and product.cID=? limit 1";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
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


	// Get  CategoryByID
	public Category getCategoryByID(String cid) {
		String query = "SELECT * from Category WHERE cid=?";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
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
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Category(rs.getInt(1), rs.getString(2)));
			}
		} catch (Exception e) {
		}
		return list;
	}


	// Get Account
	public Account login(String username,String pass) {
		String query = "SELECT * from account WHERE username=? AND pass=?";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, pass);

			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5) );
			}
		} catch (Exception e) {
		}
		return null;
	}

	// Check Account
	public boolean checkLogin(String username,String pass) {
		String query = "SELECT * from account WHERE username=? AND pass=?";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, pass);

			rs = ps.executeQuery();
			while (rs.next()) {
				if(username.equalsIgnoreCase(rs.getString(2))&& pass.equals(rs.getString(3)));
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}
	// Check Account exist
	public Account checkAcountExist(String username) {
		String query = "SELECT * from account WHERE username=? ";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);

			rs = ps.executeQuery();
			while (rs.next()) {
			}
		} catch (Exception e) {
		}
		return 	null	;
	}
	// Signup
	public void signup(String username,String pass) {
		String query = "INSERT into account (username,pass,isSell,isAdmin)  VALUES (?,?,0, 0)";
		try {
			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, pass);
			ps.executeUpdate();

		} catch (Exception e) {
		}
	}




	public static void main(String[] args) {
		DAO dao = new DAO();

		List<Product> listP = dao.getProductByName("unch");
		List<Category> listC = dao.getAllCategory();
		Product p1 = dao.getProductByID("1");
		Account a1= dao.login("thai", "123");
		Category c1=dao.getCategoryByID("1");
		System.out.println(c1.toString());



//		System.out.println(c1.toString());
//        for (Product p : listP) {
//            System.out.println(p.toString());
//        }
//        for (Category c : listC) {
//            System.out.println(c.toString());
//        }

	}

}
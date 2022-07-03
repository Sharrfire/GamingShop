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

public class DAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	/*------------------------------ ----------------------------- ----------------------------- -----------------------------
	 *  ----------------------------- -----------------------------Start Account method ----------------------------- -----------------------------
	 * ------------------------------ ----------------------------- ----------------------------- -----------------------------*/

	// Get Account
	public Account login(String username, String pass) {
		String query = "SELECT * from account WHERE username=? AND pass=?";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, pass);

			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}
		} catch (Exception e) {
		}
		return null;
	}

	// Check Account
	public boolean checkLogin(String username, String pass) {
		String query = "SELECT * from account WHERE username=? AND pass=?";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, pass);

			rs = ps.executeQuery();
			while (rs.next()) {
				if (username.equalsIgnoreCase(rs.getString(2)) && pass.equals(rs.getString(3)))
					;
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
		return null;
	}

	// Signup
	public void signup(String username, String pass) {
		String query = "INSERT into account (username,pass,isSell,isAdmin)  VALUES (?,?,0, 0)";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, pass);
			ps.executeUpdate();

		} catch (Exception e) {
		}
	}

	/*------------------------------ ----------------------------- ----------------------------- -----------------------------
	 *  ----------------------------- -----------------------------End Account method ----------------------------- -----------------------------
	 * ------------------------------ ----------------------------- ----------------------------- -----------------------------*/

	/*------------------------------ ----------------------------- ----------------------------- -----------------------------
	 *  ----------------------------- -----------------------------Start Product method ----------------------------- -----------------------------
	 * ------------------------------ ----------------------------- ----------------------------- -----------------------------*/

	// Get All
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		String query = "select * from product";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
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
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
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
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
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
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	// Get product by category ID
	public List<Product> getProductByCID(String cid) {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product WHERE CID = ?";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	// Get product by sell ID
	public List<Product> getProductBySellID(int id) {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product WHERE sell_ID = ?";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
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
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + txtSearch + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
		}
		return list;
	}

//	// Get Product by ID
//	public Product getProductByID(String id) {
//		String query = "SELECT * FROM product WHERE ID = ?";
//		try {
//			conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
//			ps = conn.prepareStatement(query);
//			ps.setString(1, id);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
//						rs.getString(6), rs.getInt(7), rs.getInt(8));
//			}
//		} catch (Exception e) {
//		}
//		return null;
//	}

	// Get Product by ID
	public Product getProductByID(String id) {
		String query = "SELECT * FROM product WHERE ID = ?";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			Product p;
			while (rs.next()) {
				p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8));
				return p;
			}
		} catch (Exception e) {
		}
		return null;
	}

	// Insert Product by ID
	public void insertProduct(String name, double price, String image, String shortDescription, String description,
							  int soldAmount, int category, int sID) {
		// remove quote
		String newName = name.replaceAll("\'", "");
		String newShortDescription = shortDescription.replaceAll("\'", "");
		String newDescription = description.replaceAll("\'", "");

		String query = "Insert into PRODUCT (NAME, PRICE,IMAGE,shortDescription,description,soldAmount,cID,sell_ID)values ( ?, ?, ?,?,?,?,?,?);"
				+ "";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, newName);
			ps.setDouble(2, price);
			ps.setString(3, image);
			ps.setString(4, newShortDescription);
			ps.setString(5, newDescription);
			ps.setInt(6, soldAmount);
			ps.setInt(7, category);
			ps.setInt(8, sID);

			ps.executeUpdate();
		} catch (Exception e) {
		}
	}

	// Edit Product by ID
	public void editProduct(String name, double price, String image, String shortDescription, String description,
							int category, String pid) {
		// remove quote
		String newName = name.replaceAll("\'", "");
		String newShortDescription = shortDescription.replaceAll("\'", "");
		String newDescription = description.replaceAll("\'", "");

		String query = "UPDATE product" + "SET NAME = ?" + "PRICE = ?" + "IMAGE = ?" + "shortDescription =?"
				+ "description = ?" + "category = ?"

				+ "WHERE ID=?;";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, newName);
			ps.setDouble(2, price);
			ps.setString(3, image);
			ps.setString(4, newShortDescription);
			ps.setString(5, newDescription);
			ps.setInt(6, category);
			ps.setString(7, pid);

			ps.executeUpdate();
		} catch (Exception e) {
		}
	}

	// Delete Product by ID
	public void deleteProduct(String pid) {
		String query = "DELETE  FROM product WHERE id= ?";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, pid);
			ps.executeUpdate();
		} catch (Exception e) {
		}
	}

	public void editProductName(String name, String price, String image, String shortDescription, String description,
								String category, String pid) {

		// remove quote
		String newName = name.replaceAll("\'", "");
		String newShortDescription = shortDescription.replaceAll("\'", "");
		String newDescription = description.replaceAll("\'", "");

		String query = "UPDATE product\r\n" + "SET NAME = ?," + "PRICE = ?," + "IMAGE = ?," + "shortDescription = ?,"
				+ "description = ?," + "cID = ?" + "WHERE ID=?;";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, newName);
			ps.setDouble(2, Double.parseDouble(price));
			ps.setString(3, image);
			ps.setString(4, newShortDescription);
			ps.setString(5, newDescription);
			ps.setString(6, category);
			ps.setString(7, pid);

			ps.executeUpdate();
			System.out.println("Complete");
		} catch (Exception e) {
			System.out.println("Fail");

		}
	}
	/*------------------------------ ----------------------------- ----------------------------- -----------------------------
	 *  ----------------------------- -----------------------------End Product method ----------------------------- -----------------------------
	 * ------------------------------ ----------------------------- ----------------------------- -----------------------------*/


	/*------------------------------ ----------------------------- ----------------------------- -----------------------------
	 *  ----------------------------- -----------------------------Start Pagination method ----------------------------- -----------------------------
	 * ------------------------------ ----------------------------- ----------------------------- -----------------------------*/
	public int getNumberPage() {

		String query = "SELECT COUNT(*) FROM product";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				int total = rs.getInt(1);
				int countPage = 0;
				countPage = total / 12;
				if(total%5!=0) {
					countPage++;
				}
				return	countPage;
			}
		} catch (Exception e) {
		}
		return 0;
	}
	public List<Product> getPaging(int index) {
		List<Product> list = new ArrayList<Product>();
		String query = " SELECT *  FROM product ORDER BY ID ASC LIMIT ?,5;";

		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setInt(1, (index-1)*12);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
		}
		return list;
	}
	// Get All
	public List<Product> getAllPaginProduct(int index) {
		List<Product> list = new ArrayList<Product>();
		String query = "select * from product limit ?,12";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setInt(1, (index-1)*12);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
		}
		return list;
	}
	public List<Product> getByIdPaginProduct(String cid,int index) {
		List<Product> list = new ArrayList<Product>();
		String query = "select * from product where cid=? limit ?,12";
		try {
			new DBContext();
			conn = DBContext.getMySQLConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			ps.setInt(2, (index-1)*12);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
		}
		return list;
	}

	/*------------------------------ ----------------------------- ----------------------------- -----------------------------
	 *  ----------------------------- -----------------------------End Pagination method ----------------------------- -----------------------------
	 * ------------------------------ ----------------------------- ----------------------------- -----------------------------*/

	public static void main(String[] args) {
		DAO dao = new DAO();


	}

}
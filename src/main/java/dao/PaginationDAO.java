package dao;

import context.DBContext;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaginationDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

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
            System.out.println(e);
        }
        return 0;
    }
    public int getTotalProduct() {
        String query = "SELECT COUNT(*) FROM product";
        try {
            new DBContext();
            conn = DBContext.getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int total = rs.getInt(1);

                return	total;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }



    public int getNumberPageByCateId(int cid) {

        String query = "SELECT COUNT(*) FROM product where cid=?";

        try {
            new DBContext();
            conn = DBContext.getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                int total = rs.getInt(1);
                int countPage = 0;
                countPage = total / 12;

                if(total%12!=0) {
                    countPage++;
                };
                return	countPage;
            }
        } catch (Exception e) {
            System.out.println(e);

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
            System.out.println(e);

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
            System.out.println(e);

        }
        return list;
    }

    public static void main(String[] args) {
        PaginationDAO pdao= new PaginationDAO();
        System.out.println(pdao.getByIdPaginProduct("2",2));
    }
}

package dao;

import context.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import entity.Account;

public class AccountDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

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
    public boolean checkAcountExist(String username) {
        String query = "SELECT * from account WHERE username=? ";
        try {
            conn = new DBContext().getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                username.equalsIgnoreCase(rs.getString(2));
                return true;
            }
        } catch (Exception e) {
        }
        return false;
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
    public List<Account> getAllUser() {
        List<Account> list = new ArrayList<Account>();
        String query = "select * from Account";
        try {
            new DBContext();
            conn = DBContext.getMySQLConnection();// mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {

        AccountDAO udao = new AccountDAO();
        boolean checkAcountExist= udao.checkAcountExist("thai");
        System.out.println(checkAcountExist);

    }
}

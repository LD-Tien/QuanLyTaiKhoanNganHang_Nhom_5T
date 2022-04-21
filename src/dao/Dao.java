package dao;


import java.util.*;
import java.sql.*;
import model.Account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author M S I
 */
public class Dao {

    private Connection connection;
    private Statement st;
    private ResultSet rs;

    public Dao() throws SQLException {
        connection = SQLServerConnection.getSQLServerConnection();
        st = connection.createStatement();
        rs = null;
    }

    public Account getAccountByMaThe(String maThe) throws SQLException {
        String sql = "Select * From Account Where MaThe = " + maThe;
        rs = st.executeQuery(sql);
        if (rs.next()) {
            Account acc = new Account();
            acc.setMaThe(rs.getString("MaThe"));
            acc.setHoTen(rs.getString("HoTen"));
            acc.setSdt(rs.getString("SDT"));
            acc.setNgaySinh(rs.getString("NgaySinh"));
            acc.setDiaChi(rs.getString("DiaChi"));
            acc.setEmail(rs.getString("Email"));
            acc.setGioiTinh(rs.getString("GioiTinh"));
            acc.setTenDangNhap(rs.getString("TenDangNhap"));
            acc.setAnh(rs.getBytes("Anh"));
            acc.setCmnd(rs.getString("CMND"));
            acc.setMaKhau(rs.getString("MatKhau"));
            return acc;
        }
        return null;
    }

    public void UpdateAccount(Account acc) throws SQLException {
        String sql = "Update Account Set Anh = ? Where MaThe = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setBytes(1, acc.getAnh());
        ps.setString(2, acc.getMaThe());
        ps.executeUpdate();
    }
}

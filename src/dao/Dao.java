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

    public Account getAccountByMaThe309(String maThe) throws SQLException {
        Connection connection309 = SQLServerConnection.getSQLServerConnection();
        Statement st309 = connection309.createStatement();
        ResultSet rs309 = null;
        String sql = "Select * From Account Where MaThe = " + maThe;
        rs309 = st309.executeQuery(sql);

        if (rs309.next()) {
            Account acc309 = new Account();
            acc309.setMaThe(rs309.getString("MaThe"));
            acc309.setHoTen(rs309.getString("HoTen"));
            acc309.setSdt(rs309.getString("SDT"));
            acc309.setNgaySinh(rs309.getString("NgaySinh"));
            acc309.setDiaChi(rs309.getString("DiaChi"));
            acc309.setEmail(rs309.getString("Email"));
            acc309.setGioiTinh(rs309.getString("GioiTinh"));
            acc309.setTenDangNhap(rs309.getString("TenDangNhap"));
            acc309.setAnh(rs309.getBytes("Anh"));
            acc309.setCmnd(rs309.getString("CMND"));
            acc309.setMaKhau(rs309.getString("MatKhau"));
            return acc309;
        }
        return null;
    }

    public void UpdateAccount309(Account acc) throws SQLException {
        Connection connection309 = SQLServerConnection.getSQLServerConnection();
        Statement st309 = connection309.createStatement();
        String sql = "Update Account Set Anh = ? Where MaThe = ?";
        PreparedStatement ps309 = connection309.prepareStatement(sql);
        ps309.setBytes(1, acc.getAnh());
        ps309.setString(2, acc.getMaThe());
        ps309.executeUpdate();
    }
}

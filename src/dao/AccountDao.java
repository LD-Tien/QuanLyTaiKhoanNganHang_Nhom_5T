package dao;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

public class AccountDao {

    public Account getAccountByMaThe309(String maThe){
            Connection connection309 = SQLServerConnection.getSQLServerConnection();
        try {
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
                st309.close();
                rs309.close();
                connection309.close();
                return acc309;
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                connection309.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean UpdateAccount309(Account acc309){
        Connection connection309 = SQLServerConnection.getSQLServerConnection();
        String sql = "Update Account Set Anh = ?, HoTen = ?, SDT = ?, NgaySinh = ?, DiaChi = ?, Email = ?, GioiTinh = ?, TenDangNhap = ?, CMND = ?, MatKhau = ?  Where MaThe = ?";
        PreparedStatement ps309;
        try {
            ps309 = connection309.prepareStatement(sql);
            ps309.setBytes(1, acc309.getAnh());
            ps309.setString(2, acc309.getHoTen());
            ps309.setString(3, acc309.getSdt());
            ps309.setString(4, acc309.getNgaySinh());
            ps309.setString(5, acc309.getDiaChi());
            ps309.setString(6, acc309.getEmail());
            ps309.setString(7, acc309.getGioiTinh());
            ps309.setString(8, acc309.getTenDangNhap());
            ps309.setString(9, acc309.getCmnd());
            ps309.setString(10, acc309.getMaKhau());
            ps309.setString(11, acc309.getMaThe());
            boolean b = ps309.executeUpdate()>0;
            ps309.close();
            connection309.close();
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                connection309.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean DangKi336 (Account Acc) throws Exception{
             
        String sql ="set dateformat dmy  insert into Account (Matkhau,Tendangnhap,HoTen,CMND,SDT,Email,DiaChi,gioitinh,ngaysinh,Anh) values(?,?,?,?,?,?,?,?,?,?)";
        try(
            Connection con =SQLServerConnection.getSQLServerConnection();
            PreparedStatement pstmt= con.prepareStatement(sql);
            ){
        pstmt.setString(1,Acc.getMaKhau());
        pstmt.setString(2,Acc.getTenDangNhap());
        pstmt.setString(3,Acc.getHoTen());
        pstmt.setString(4,Acc.getCmnd());
        pstmt.setString(5,Acc.getSdt());
        pstmt.setString(6,Acc.getEmail());
        pstmt.setString(7,Acc.getDiaChi());
        pstmt.setString(8,Acc.getGioiTinh());
        pstmt.setString(9,Acc.getNgaySinh());
        pstmt.setBytes(10, Acc.getAnh());
       
       
        return pstmt.executeUpdate()>0;
        }

    }   
}

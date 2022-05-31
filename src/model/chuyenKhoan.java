/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class chuyenKhoan {
    private String soTaiKhoanChuyen;
    private String soTaiKhoanNhan;
    private Date ngayChuyen;
    private String noiDung;
    private Double sotien;
    private String tenNganHangden;

    public chuyenKhoan() {
    }

    public chuyenKhoan(String soTaiKhoanChuyen, String soTaiKhoanNhan, Date ngayChuyen, String noiDung, Double sotien, String tenNganHangden) {
        this.soTaiKhoanChuyen = soTaiKhoanChuyen;
        this.soTaiKhoanNhan = soTaiKhoanNhan;
        this.ngayChuyen = ngayChuyen;
        this.noiDung = noiDung;
        this.sotien = sotien;
        this.tenNganHangden = tenNganHangden;
    }


    public String getSoTaiKhoanChuyen() {
        return soTaiKhoanChuyen;
    }

    public void setSoTaiKhoanChuyen(String soTaiKhoanChuyen) {
        this.soTaiKhoanChuyen = soTaiKhoanChuyen;
    }

    public String getSoTaiKhoanNhan() {
        return soTaiKhoanNhan;
    }

    public void setSoTaiKhoanNhan(String soTaiKhoanNhan) {
        this.soTaiKhoanNhan = soTaiKhoanNhan;
    }

    public Date getNgayChuyen() {
        return ngayChuyen;
    }

    public void setNgayChuyen(Date ngayChuyen) {
        this.ngayChuyen = ngayChuyen;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Double getSotien() {
        return sotien;
    }

    public void setSotien(Double sotien) {
        this.sotien = sotien;
    }

    public String getTenNganHangden() {
        return tenNganHangden;
    }

    public void setTenNganHangden(String tenNganHangden) {
        this.tenNganHangden = tenNganHangden;
    }
    
}

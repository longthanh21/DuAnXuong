/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanxuong1;

import java.util.Date;

/**
 *
 * @author LongThank
 */
public class HoaDon {
    private Integer stt;
    private String maHD;
    private String ngayTao;
    private Integer tenNV;
    private String tinhTrang;

    public HoaDon() {
    }

    public HoaDon(Integer stt, String maHD, String ngayTao, Integer tenNV, String tinhTrang) {
        this.stt = stt;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tinhTrang = tinhTrang;
    }

    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getTenNV() {
        return tenNV;
    }

    public void setTenNV(Integer tenNV) {
        this.tenNV = tenNV;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}

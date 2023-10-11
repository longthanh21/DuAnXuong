/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanxuong1;

import java.util.ArrayList;

/**
 *
 * @author LongThank
 */
public class QuanLyHoaDon {
    ArrayList<HoaDon> listHoaDon = new ArrayList<>();
    public QuanLyHoaDon(){
        listHoaDon.add(new HoaDon(1,"HD1","2022-10-22",1,"Chưa thanh toán"));
        listHoaDon.add(new HoaDon(2,"HD2","2022-10-23",1,"Đã thanh toán"));
        listHoaDon.add(new HoaDon(3,"HD3","2022-10-23",1,"Đã hủy"));
    }
    ArrayList<HoaDon> getlistHoaDon(){
        return listHoaDon;
    }
    Boolean addNew(HoaDon hoaDon){
        listHoaDon.add(hoaDon);
        return true;
    }
    ArrayList<HoaDon> chon(String check){
        ArrayList<HoaDon> ketQua = new ArrayList<>();
        for (HoaDon hoaDon : listHoaDon) {
            if (hoaDon.getTinhTrang().equals(check)) {
                ketQua.add(hoaDon);
            }
        }
        return ketQua;
    }
}

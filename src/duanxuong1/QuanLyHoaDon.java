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
        listHoaDon.add(new HoaDon(1,"HD1","2022-10-22",1,"Chua thanh toan"));
        listHoaDon.add(new HoaDon(2,"HD2","2022-10-23",1,"Da thanh toan"));
        listHoaDon.add(new HoaDon(3,"HD3","2022-10-23",1,"Huy"));
    }
    ArrayList<HoaDon> getlistHoaDon(){
        return listHoaDon;
    }
    Boolean addNew(HoaDon hoaDon){
        listHoaDon.add(hoaDon);
        return true;
    }
}

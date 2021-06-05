/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SANPHAM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class SANPHAMService {
    public static List<SANPHAM> getAllSanPham() {
        return Model.SANPHAMModel.getAllSanPham();
    }
    public static int setSanPham(String ten, int soluong, String donvi, int gianhap, int giaban) {
        return Model.SANPHAMModel.setSanPham(ten, soluong, donvi, gianhap, giaban);
    }
    
    public static int updateSanPham(String tencu, String tenmoi, int soluong, String donvi, int gianhap, int giaban) {
        return Model.SANPHAMModel.updateSanPham(tencu, tenmoi, soluong, donvi, gianhap, giaban);
    }
    
    public static int deleteSanPham(String tensp) {
        return Model.SANPHAMModel.deleteSanPham(tensp);
    }
    
    public static boolean checkExistedSP(String tensp) {
        List<SANPHAM> sps = Model.SANPHAMModel.getAllSanPham();
        for (SANPHAM sanpham:sps) {
            if (sanpham.getTenSanPham().equals(tensp)) {
                return true;
            }
        }
        return false;
    }
}

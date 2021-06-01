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
    
//    public static List<Object[]> getSanPham() {
//        List<Object[]> spList = new ArrayList<>();
//        List<SANPHAM> sps = Model.SANPHAMModel.getAllSanPham();
//        for (SANPHAM sanpham:sps) {
//            Object o[] = {sanpham.getTenSanPham(), }
//        }
//        return spList;
//    }
}

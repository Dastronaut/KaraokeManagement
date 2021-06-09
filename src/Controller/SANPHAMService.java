package Controller;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import Model.DataModel.SANPHAM;
import java.util.ArrayList;
import java.util.List;

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
    
    public static List<String> getAllnameSP() {
        List<SANPHAM> sps = Model.SANPHAMModel.getAllSanPham();
        List<String> namesps = new ArrayList<>();
        for (SANPHAM sp:sps) {
            namesps.add(sp.getTenSanPham());
        }
        return namesps; 
    }
}

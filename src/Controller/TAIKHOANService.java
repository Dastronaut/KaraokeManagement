package Controller;

import Model.TAIKHOANModel;
import Model.DataModel.TAIKHOAN;
import java.util.List;
public class TAIKHOANService {
    public static List<TAIKHOAN> getAllTaikhoans() {
        return Model.TAIKHOANModel.getAllTaikhoans();
    }
    public static boolean checkLogin(String usString, String pwString) {
        List<TAIKHOAN> lgs = TAIKHOANModel.getAllTaikhoans();
        return lgs.stream().anyMatch(lg -> (lg.getUsername().equals(usString) && lg.getMatKhau().equals(pwString)));
    }
    
    public static int insertTaiKhoan(String usString, String pwString, String tenString, String sdtString, String loaitk) {
        return TAIKHOANModel.insertTaiKhoan(usString, pwString, tenString, sdtString, loaitk);
    }
    
    public static boolean checkNewUser(String usString, String sdtString) {
        List<TAIKHOAN> lgs = TAIKHOANModel.getAllTaikhoans();
        return lgs.stream().anyMatch(lg -> (lg.getUsername().equals(usString) || lg.getSoDienThoai().equals(sdtString)));
    }
    public static int updateTaiKhoan(String usString, String pwString, String tenString, String sdtString, String loaitk) {
        return TAIKHOANModel.updateTaiKhoan(usString, pwString, tenString, sdtString, loaitk);
    }
    public static int deleteTaiKhoan(String username) {
        return Model.TAIKHOANModel.deleteTaiKhoan(username);
    }
}
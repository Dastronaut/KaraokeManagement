package Controller;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import Model.TAIKHOANModel;
import Model.DataModel.TAIKHOAN;
import java.util.List;

public class TAIKHOANService {
    public static List<TAIKHOAN> getAllTaikhoans() {
        return Model.TAIKHOANModel.getAllTaikhoans();
    }
   
    public static Object[] checkLogin(String usString, String pwString) {
        return Model.TAIKHOANModel.checkLogin(usString, pwString);
    }
    
    public static int insertTaiKhoan(TAIKHOAN account) {
        return TAIKHOANModel.insertTaiKhoan(account);
    }
    
    public static boolean checkNewUser(String usString, String sdtString) {
        return TAIKHOANModel.checkNewUser(usString, sdtString);
    }
    public static int updateTaiKhoan(TAIKHOAN account) {
        return TAIKHOANModel.updateTaiKhoan(account);
    }
    public static int deleteTaiKhoan(String username) {
        return Model.TAIKHOANModel.deleteTaiKhoan(username);
    }
}
package Controller;

import Model.LoginModel;
import Model.TAIKHOAN;
import java.util.List;
public class LoginService {
    public static boolean checkLogin(String usString, String pwString) {
        List<TAIKHOAN> lgs = LoginModel.getAllLogins();
        return lgs.stream().anyMatch(lg -> (lg.getUsername().equals(usString) && lg.getMatKhau().equals(pwString)));
    }
    
    public static int setRegister(String usString, String pwString, String tenString, String sdtString, String loaitk) {
        return LoginModel.setRegister(usString, pwString, tenString, sdtString, loaitk);
    }
    
    public static boolean checkNewUser(String usString) {
        List<TAIKHOAN> lgs = LoginModel.getAllLogins();
        return lgs.stream().anyMatch(lg -> (lg.getUsername().equals(usString)));
    }
}
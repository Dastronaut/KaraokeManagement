package Controller;

import Model.PHONG;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PHONGService {
    public static List<PHONG> getAllPhongs() {
        return Model.PHONGModel.getAllPhongs();
    }
    
    public static void setGiaPhong(String tenphong, int giaphong) {
        Model.PHONGModel.setGiaPhong(tenphong, giaphong);
    }
    
    public static boolean checkRoomStatus(String tenphong) {
        List<PHONG> ps = Model.PHONGModel.getAllPhongs();
        for (PHONG phong:ps) {
            if (phong.getTenPhong().equals(tenphong)) {
                return phong.isTinhTrang();
            }
        }
        return false;
    }
}

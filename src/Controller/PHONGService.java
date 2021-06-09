package Controller;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import Model.DataModel.PHONG;
import java.util.List;

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
    
    private static float toHours(String s) {
        String[] hourMin = s.split(":");
        int hour = Integer.parseInt(hourMin[0]);
        int mins = Integer.parseInt(hourMin[1]);
        float mintohour = mins / 60.0f;
        return (hour + mintohour);
    }
    
    public static float getTienPhong(String tenphong, String giovao, String giora) {
        float giodung = 0;
        int giaphong = 0;
        giovao = giovao.substring(11, 16);
        List<PHONG> ps = Model.PHONGModel.getAllPhongs();
        for (PHONG phong:ps) {
            if (phong.getTenPhong().equals(tenphong)) {
                giaphong = phong.getGiaPhong();
                break;
            }
        }
        giodung = (toHours(giora)-toHours(giovao))*giaphong;
        return giodung;
    }
    
    public static List<String> getRecentRoom(String today) {
        return Model.PHONGModel.getRecentRoom(today);
    }
    
    
}

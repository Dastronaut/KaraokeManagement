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
        return Model.PHONGModel.checkRoomStatus(tenphong);
    }
    
    public static float getTienPhong(String tenphong, String giovao, String giora) {
        return Model.PHONGModel.getTienPhong(tenphong, giovao, giora);
    }
    
    public static int getGiaPhong(String tenphong) {
        return Model.PHONGModel.getGiaPhong(tenphong);
    }
    public static List<String> getRecentRoom(String today) {
        return Model.PHONGModel.getRecentRoom(today);
    }
    
    public static List<String> getEmptyRoom() {
        return Model.PHONGModel.getEmptyRoom();
    }
    
    public static void switchRoomButton(String phongchuyen, String phongdich, String giovao) {
        Model.PHONGModel.switchRoomButton(phongchuyen, phongdich, giovao);
    }
    
    public static void setEmptyRoom(String tenphong) {
        Model.PHONGModel.setEmptyRoom(tenphong);
    }
}

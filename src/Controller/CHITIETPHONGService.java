package Controller;

public class CHITIETPHONGService {
    public static void setChiTietPhong(String tenphong, boolean tinhtrang, String giovao, String giora, int tiengio, int tiendv) {
        Model.CHITIETPHONGModel.setChiTietPhong(tenphong, tinhtrang, giovao, giora, tiengio, tiendv);
    }
    
    public static void updateChiTietPhong(String tenphong, String giovao, String giora, int tiengio, int tiendv) {
        Model.CHITIETPHONGModel.updateChiTietPhong(tenphong, giovao, giora, tiengio, tiendv);
    }
}

package Controller;

import java.util.List;

/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class CHITIETPHONGService {
    public static void setChiTietPhong(String tenphong, boolean tinhtrang, String giovao, String giora, int tiengio, int tiendv, int phuthu, int giamgia, int tratruoc) {
        Model.CHITIETPHONGModel.setChiTietPhong(tenphong, tinhtrang, giovao, giora, tiengio, tiendv, phuthu, giamgia, tratruoc);
    }
    
    public static int updateChiTietPhong(String tenphong, boolean tinhtrang, String giovao, String giora, int tiengio, int tiendv, int phuthu, int giamgia, int tratruoc) {
        return Model.CHITIETPHONGModel.updateChiTietPhong(tenphong, giovao, giora, tiengio, tiendv, phuthu, giamgia, tratruoc);
    }
    
    public static List<Object[]> getBillbyDate(String datefrom, String dateto) {
        return Model.CHITIETPHONGModel.getBillbyDate(datefrom, dateto);
    }
}

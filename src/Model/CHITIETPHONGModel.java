package Model;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CHITIETPHONGModel {
    public static void setChiTietPhong(String tenphong, boolean tinhtrang, String giovao, String giora, int tiengio, int tiendv, int phuthu, int giamgia, int tratruoc) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String idphong = "", query;
            query = "SELECT * FROM karaokemanagement.PHONG WHERE TenPhong = '" + tenphong + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idphong = rs.getString("ID_Phong");
            }
            query = "UPDATE karaokemanagement.PHONG SET TinhTrang = " + tinhtrang + " WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            query = "INSERT INTO karaokemanagement.CHITIETPHONG(ID_Phong, GioVao, GioRa, TienGio, TienDV, PhuThu, GiamGia, TraTruoc) VALUES ('"
                    + idphong + "', '" + giovao + "', '" + giora + "', " + tiengio + ", " + tiendv + ", " + phuthu 
                    + ", " + giamgia + ", " + tratruoc + ")";
            stmt.executeUpdate(query);
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
    }
    
    public static int updateChiTietPhong(String tenphong, String giovao, String giora, int tiengio, int tiendv, int phuthu, int giamgia, int tratruoc) {
        int idorder = -1;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String idphong = "", query;
            // Tìm ID_Phong theo Tên phòng
            query = "SELECT ID_Phong FROM karaokemanagement.PHONG WHERE TenPhong = '" + tenphong + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idphong = rs.getString("ID_Phong");
            }         
            // Tìm ID_Order theo ID_Phong và giờ ra
            query = "SELECT * FROM karaokemanagement.CHITIETPHONG WHERE ID_Phong = '" + idphong + "' AND GioVao = '" 
                    + giovao + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                idorder = rs.getInt("ID_Order");
            }
            // Cập nhật tình trạng phòng
            query = "UPDATE karaokemanagement.PHONG SET TinhTrang = " + true + " WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            // Cập nhật ChiTietPhong sau khi đã tính tiền
            query = "UPDATE karaokemanagement.CHITIETPHONG SET GioRa = '" + giora + "', TienGio = " + tiengio + ", TienDV = " + tiendv
                    + ", PhuThu = " + phuthu + ", GiamGia = " + giamgia + ", TraTruoc = " + tratruoc + " WHERE ID_Order = " + idorder;
            stmt.executeUpdate(query);
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return idorder;
    }
    
    public static List<Object[]> getBillbyDate(String datefrom, String dateto) {
        List<Object[]> ls = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query;
            query = "SELECT PHONG.TenPhong, CHITIETPHONG.TienDV, CHITIETPHONG.TienGio, CHITIETPHONG.PhuThu, CHITIETPHONG.GiamGia, CHITIETPHONG.TraTruoc, "
                    + "(CHITIETPHONG.TienDV + CHITIETPHONG.TienGio + CHITIETPHONG.PhuThu - CHITIETPHONG.GiamGia - CHITIETPHONG.TraTruoc), CHITIETPHONG.GioVao "
                    + "FROM CHITIETPHONG LEFT JOIN PHONG USING (ID_Phong) WHERE GioVao >= '" + datefrom + "' AND GioRa <= '" + dateto + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Object[] o = new Object[]{
                  rs.getString(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(7),
                    rs.getString(8)
                };
                ls.add(o);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return ls;
    }
    
    public static Object[] displayDetailPhong(String tenphong) {
        Object[] o = null;
        Connection conn;
        try {
            conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            int idorder = 0;
            String query;
            query = "SELECT CTP.ID_Order from CHITIETPHONG AS CTP LEFT JOIN PHONG AS P ON CTP.ID_PHONG = P.ID_PHONG WHERE P.TENPHONG = '"
                    + tenphong + "' and date(ctp.giovao) = current_date() order by ctp.id_order desc limit 1";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idorder = rs.getInt("ID_Order");
            }
            query = "SELECT CTP.GioVao, CTP.GioRa, CTP.TienGio, CTP.TienDV, CTP.PhuThu, CTP.GiamGia from CHITIETPHONG AS CTP WHERE CTP.ID_Order = "
                    + idorder;
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                o = new Object[]{
                    rs.getString("GioVao"),
                    rs.getString("GioRa"),
                    rs.getInt("TienGio"),
                    rs.getInt("TienDV"),
                    rs.getInt("PhuThu"),
                    rs.getInt("GiamGia"),
                };
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return o;
    }
    
    public static List<Object[]> displayDetailOrder(String tenphong) {
        List<Object[]> listOrder = new ArrayList<>();
        Connection conn;
        try {
            conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            int idorder = 0;
            String query;
            query = "SELECT CTP.ID_Order from CHITIETPHONG AS CTP LEFT JOIN PHONG AS P ON CTP.ID_PHONG = P.ID_PHONG WHERE P.TenPhong = '"
                    + tenphong + "' and date(ctp.giovao) = current_date() order by ctp.ID_Order desc limit 1";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idorder = rs.getInt("ID_Order");
            }
            query = "SELECT SP.TenSanPham, SP.DonVi, SP.GiaBan, CTO.SoLuong FROM SANPHAM AS SP RIGHT JOIN CHITIETORDER AS CTO ON SP.ID_SanPham = CTO.ID_SanPham WHERE CTO.ID_Order = "
                    + idorder;
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Object[] o = new Object[]{
                    rs.getString("TenSanPham"),
                    rs.getString("DonVi"),
                    rs.getInt("GiaBan"),
                    rs.getInt("SoLuong"),
                };
                listOrder.add(o);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return listOrder;
    }
    
    public static void endRoomButton(String tenphong, String giovao) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String idorder = "", idphong = "", query;
            query = "SELECT CHITIETPHONG.ID_Order, PHONG.ID_Phong FROM CHITIETPHONG JOIN PHONG ON CHITIETPHONG.ID_Phong = PHONG.ID_Phong "
                    + "WHERE PHONG.TinhTrang = false AND CHITIETPHONG.GioVao = '" + giovao + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idorder = rs.getString("ID_Order");
                idphong = rs.getString("ID_Phong");
            }
            query = "DELETE FROM CHITIETPHONG WHERE ID_Order = '" + idorder + "'"; 
            stmt.executeUpdate(query);
            query = "UPDATE PHONG SET TinhTrang = true WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
    }
}

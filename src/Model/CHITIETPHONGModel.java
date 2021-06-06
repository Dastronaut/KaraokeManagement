package Model;

import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CHITIETPHONGModel {
    public static void setChiTietPhong(String tenphong, boolean tinhtrang, String giovao, String giora, int tiengio, int tiendv) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String idphong = "", query = "";
            query = "SELECT * FROM karaokemanagement.PHONG WHERE TenPhong = '" + tenphong + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idphong = rs.getString("ID_Phong");
            }
            query = "UPDATE karaokemanagement.PHONG SET TinhTrang = " + tinhtrang + " WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            query = "INSERT INTO karaokemanagement.CHITIETPHONG(ID_Phong, GioVao, GioRa, TienGio, TienDV) VALUES ('"
                    + idphong + "', '" + giovao + "', '" + giora + "', '" + tiengio + "', '" + tiendv + "')";
            stmt.executeUpdate(query);
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
    }
    
    public static void updateChiTietPhong(String tenphong, String giovao, String giora, int tiengio, int tiendv) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String idphong = "", query = "";
            int idorder = 0;
            // Tìm ID_Phong theo Tên phòng
            query = "SELECT * FROM karaokemanagement.PHONG WHERE TenPhong = '" + tenphong + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idphong = rs.getString("ID_Phong");
            }         
            // Tìm ID_Order theo ID_Phong và giờ ra
            query = "SELECT * FROM karaokemanagement.CHITIETPHONG WHERE ID_Phong = '" + idphong + "' AND GioVao = '" 
                    + giovao + "' AND GioRa = '" + giovao + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                idorder = rs.getInt("ID_Order");

            }
            // Cập nhật tình trạng phòng
            query = "UPDATE karaokemanagement.PHONG SET TinhTrang = " + true + " WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            // Cập nhật ChiTietPhong sau khi đã tính tiền
            query = "UPDATE karaokemanagement.CHITIETPHONG SET GioRa = '" + giora + "', TienGio = " + tiengio + ", TienDV = " + tiendv
                    + " WHERE ID_Order = " + idorder;
            stmt.executeUpdate(query);
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
    }
}

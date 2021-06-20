package Model;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import Model.DataModel.PHONG;
import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class PHONGModel {
    public static List<PHONG> getAllPhongs() {
        List<PHONG> ps = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM karaokemanagement.PHONG";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                PHONG p = new PHONG(rs.getString("ID_Phong"), rs.getString("TenPhong"), rs.getInt("GiaPhong"), rs.getBoolean("TinhTrang"));
                ps.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return ps;
    }
    
    public static void setGiaPhong(String tenPhong, int giaphong) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE PHONG SET GiaPhong = " + giaphong + " WHERE TenPhong = '" + tenPhong + "'";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
    }
    
    public static List<String> getRecentRoom(String today) {
        List<String> namerList = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT DISTINCT TenPhong FROM PHONG JOIN CHITIETPHONG ON PHONG.ID_Phong = CHITIETPHONG.ID_Phong WHERE CHITIETPHONG.GioVao > '" + today + " 00:00:00'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                namerList.add(rs.getString("TenPhong"));
            }
            stmt.close();
        } catch (SQLException e) {
        }
        return namerList;
    }
}

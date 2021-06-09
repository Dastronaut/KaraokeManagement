package Model;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import Model.DataModel.SANPHAM;
import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class SANPHAMModel {
    public static List<SANPHAM> getAllSanPham() {
        List<SANPHAM> sps = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM karaokemanagement.SANPHAM";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                SANPHAM p = new SANPHAM(rs.getInt("ID_SanPham"), rs.getString("TenSanPham"), rs.getString("Donvi"),
                        rs.getInt("SoLuong"), rs.getInt("GiaNhap"), rs.getInt("GiaBan"));
                sps.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return sps;
    }
    
    public static int setSanPham(String ten, int soluong, String donvi, int gianhap, int giaban) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "INSERT INTO SANPHAM(TenSanPham, DonVi, SoLuong, GiaNhap, GiaBan) VALUES ('" + ten + "', '" 
                    + donvi + "', " + soluong + ", " + gianhap + ", " + giaban + ")";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
    
    public static int updateSanPham(String tencu, String tenmoi, int soluong, String donvi, int gianhap, int giaban) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE karaokemanagement.SANPHAM SET TenSanPham = '" + tenmoi + "', DonVi = '"
                    + donvi + "', SoLuong = " + soluong + ", GiaNhap = " + gianhap + ", GiaBan = " + giaban + " WHERE TenSanPham = '" + tencu + "'";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
    
    public static int deleteSanPham(String ten) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement(); 
            String query = "DELETE from SANPHAM where TenSanPham = '" + ten + "'";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
    
    
}

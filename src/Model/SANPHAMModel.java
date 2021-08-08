package Model;

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
 * @author Trần Kim Tiến Đạt
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
    
    public static int setSanPham(SANPHAM sanpham) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "INSERT INTO SANPHAM(TenSanPham, DonVi, SoLuong, GiaNhap, GiaBan) VALUES ('" + sanpham.getTenSanPham() + "', '" 
                    + sanpham.getDonVi() + "', " + sanpham.getSoLuong() + ", " + sanpham.getGiaNhap() + ", " + sanpham.getGiaBan()+ ")";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
    
    public static int updateSanPham(SANPHAM sanpham, String tenmoi) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE karaokemanagement.SANPHAM SET TenSanPham = '" + tenmoi + "', DonVi = '"
                    + sanpham.getDonVi() + "', SoLuong = " + sanpham.getSoLuong() + ", GiaNhap = " + sanpham.getGiaNhap() + ", GiaBan = " 
                    + sanpham.getGiaBan() + " WHERE TenSanPham = '" + sanpham.getTenSanPham() + "'";
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

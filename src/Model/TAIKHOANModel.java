package Model;

import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.DataModel.TAIKHOAN;

public class TAIKHOANModel {
    public static List<TAIKHOAN> getAllTaikhoans() {
        List<TAIKHOAN> lgs = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM karaokemanagement.taikhoan";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                TAIKHOAN lg = new TAIKHOAN(rs.getString("Username"), rs.getString("MatKhau"), rs.getString("Ten"), rs.getString("SoDienThoai"), rs.getString("LoaiTaiKhoan"));
                lgs.add(lg);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return lgs;
    }
    
    public static int insertTaiKhoan(String usString, String pwString, String tenString, String sdtString, String loaitk) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "INSERT INTO TAIKHOAN VALUES ( '" + usString + "', '" + pwString + "','" + tenString + "', '" + sdtString + "', '" + loaitk + "' )";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
    
    public static int updateTaiKhoan(String usString, String pwString, String tenString, String sdtString, String loaitk) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE TAIKHOAN SET MatKhau = '" + pwString + "', Ten = '" + tenString + "', SoDienThoai = '"
                    + sdtString + "', LoaiTaiKhoan = '" + loaitk + "' WHERE Username = '" + usString + "'";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
    
    public static int deleteTaiKhoan(String username) {
        int rs = 0;
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "DELETE FROM karaokemanagement.TAIKHOAN WHERE Username = '" + username + "'";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
        return rs;
    }
}

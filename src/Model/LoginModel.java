package Model;

import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Login;

public class LoginModel {
    public static List<Login> getAllLogins() {
        List<Login> lgs = new ArrayList<Login>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM karaokemanagement.taikhoan";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Login lg = new Login(rs.getString("Username"), rs.getString("MatKhau"), rs.getString("Ten"), rs.getString("SoDienThoai"), rs.getString("LoaiTaiKhoan"));
                lgs.add(lg);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return lgs;
    }
    
    public static int setRegister(String usString, String pwString, String tenString, String sdtString, String loaitk) {
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
}

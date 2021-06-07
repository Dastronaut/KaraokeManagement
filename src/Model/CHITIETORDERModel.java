package Model;

import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CHITIETORDERModel {
//    public static List<CHITIETORDER> getAllSanPham() {
//        List<CHITIETORDER> sps = new ArrayList<CHITIETORDER>();
//        try {
//            Connection conn = getJDBCConnection();
//            Statement stmt = conn.createStatement();
//            
//            String query = "SELECT * FROM karaokemanagement.CHITIETORDER";
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                CHITIETORDER p = new CHITIETORDER(rs.getInt("ID_SanPham"), rs.getString("TenSanPham"), rs.getString("Donvi"),
//                        rs.getInt("SoLuong"), rs.getInt("GiaNhap"), rs.getInt("GiaBan"));
//                sps.add(p);
//            }
//            rs.close();
//            stmt.close();
//        } catch (SQLException e) {
//        }
//        return sps;
//    }
    
    public static void insertChiTietOrder(int idorder, HashMap<String, Integer> spdvHashMap) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query = "";
            int idsp = 0;
            List<SANPHAM> sps = SANPHAMModel.getAllSanPham();
            for (String tensp:spdvHashMap.keySet()) {
                for (SANPHAM sp:sps) {
                    if (sp.getTenSanPham().equals(tensp)) {
                        idsp = sp.getID_SanPham();
                        break;
                    }
                }
                query = "INSERT INTO karaokemanagement.CHITIETORDER(ID_Order, ID_SanPham, SoLuong) VALUES (" + idorder 
                        + ", " + idsp + ", " + spdvHashMap.get(tensp) + ")";
                stmt.executeUpdate(query);
            }
            stmt.close();
        } catch (SQLException e) {
        }
    }
}

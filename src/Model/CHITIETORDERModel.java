package Model;

import Model.DataModel.SANPHAM;
import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CHITIETORDERModel {
    public static void insertChiTietOrder(int idorder, HashMap<String, Integer> spdvHashMap) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query;
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
    
    public static Object[] getSoldbySP(String tensp) {
        Object[] sanpham = new Object[]{};
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT SANPHAM.TenSanPham, CHITIETORDER.SOLUONG, (SANPHAM.GiaBan*CHITIETORDER.SOLUONG) "
                    + "FROM SANPHAM INNER JOIN CHITIETORDER ON SANPHAM.ID_SanPham = CHITIETORDER.ID_SanPham AND SANPHAM.TenSanPham = '" + tensp + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                sanpham = new Object[]{
                rs.getObject(1),
                rs.getObject(2),
                rs.getObject(3)
            };
            }
            stmt.close();
        } catch (SQLException e) {
        }
        return sanpham;
    }
}

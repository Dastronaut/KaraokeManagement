/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
        List<SANPHAM> sps = new ArrayList<SANPHAM>();
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
}

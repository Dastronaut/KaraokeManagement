/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 */
public class CHITIETORDER {
    private int ID_ChiTietOrder;
    private int ID_Order;
    private int ID_SanPham;
    private int SoLuong;
    private int TienGio;
    private int TienDV;

    public int getID_ChiTietOrder() {
        return ID_ChiTietOrder;
    }

    public int getID_Order() {
        return ID_Order;
    }

    public int getID_SanPham() {
        return ID_SanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getTienDV() {
        return TienDV;
    }

    public int getTienGio() {
        return TienGio;
    }

    public void setID_ChiTietOrder(int ID_ChiTietOrder) {
        this.ID_ChiTietOrder = ID_ChiTietOrder;
    }

    public void setID_Order(int ID_Order) {
        this.ID_Order = ID_Order;
    }

    public void setID_SanPham(int ID_SanPham) {
        this.ID_SanPham = ID_SanPham;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setTienDV(int TienDV) {
        this.TienDV = TienDV;
    }

    public void setTienGio(int TienGio) {
        this.TienGio = TienGio;
    } 

}

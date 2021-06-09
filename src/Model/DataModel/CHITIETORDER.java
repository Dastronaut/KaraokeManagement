package Model.DataModel;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class CHITIETORDER {
    private int ID_ChiTietOrder;
    private int ID_Order;
    private int ID_SanPham;
    private int SoLuong;

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

}

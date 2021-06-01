package Model;

/**
 *
 * @author USER
 */
public class SANPHAM {
    private int ID_SanPham;
    private String TenSanPham;
    private String DonVi;
    private int SoLuong;
    private int GiaNhap;
    private int GiaBan;

    public SANPHAM() {
    }

    public SANPHAM(int ID_SanPham, String TenSanPham, String DonVi, int SoLuong, int GiaNhap, int GiaBan) {
        this.ID_SanPham = ID_SanPham;
        this.TenSanPham = TenSanPham;
        this.DonVi = DonVi;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    
    public String getDonVi() {
        return DonVi;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public int getID_SanPham() {
        return ID_SanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public void setID_SanPham(int ID_SanPham) {
        this.ID_SanPham = ID_SanPham;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }
}

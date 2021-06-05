package Model;

public class PHONG {
    private String ID_Phong;
    private String TenPhong;
    private int GiaPhong;
    private boolean TinhTrang;
    public PHONG() {
    }

    public PHONG(String ID_Phong, String TenPhong, int GiaPhong, boolean TinhTrang) {
        this.ID_Phong = ID_Phong;
        this.TenPhong = TenPhong;
        this.GiaPhong = GiaPhong;
        this.TinhTrang = TinhTrang;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public int getGiaPhong() {
        return GiaPhong;
    }

    public String getID_Phong() {
        return ID_Phong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }   
   
    public void setGiaPhong(int GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public void setID_Phong(String ID_Phong) {
        this.ID_Phong = ID_Phong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }
}

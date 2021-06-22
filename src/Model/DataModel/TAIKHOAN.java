package Model.DataModel;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
public class TAIKHOAN {
    private String Username;
    private String MatKhau;
    private String Ten;
    private String SoDienThoai;
    private String LoaiTaiKhoan;
    
    public TAIKHOAN() {
    }

    public TAIKHOAN(String Username, String MatKhau, String Ten, String SoDienThoai, String LoaiTaiKhoan) {
        this.Username = Username;
        this.MatKhau = MatKhau;
        this.Ten = Ten;
        this.SoDienThoai = SoDienThoai;
        this.LoaiTaiKhoan = LoaiTaiKhoan;
    }

    public String getUsername() {
        return Username;
    }

    public String getLoaiTaiKhoan() {
        return LoaiTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getTen() {
        return Ten;
    }

    public void setLoaiTaiKhoan(String LoaiTaiKhoan) {
        this.LoaiTaiKhoan = LoaiTaiKhoan;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }    
}

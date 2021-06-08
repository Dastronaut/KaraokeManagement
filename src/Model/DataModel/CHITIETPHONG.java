package Model.DataModel;

public class CHITIETPHONG {
    private int ID_Order;
    private String ID_Phong;
    private String GioVao;
    private String GioRa;
    private int TienGio;
    private int TienDV;

    public CHITIETPHONG() {
    }

    public CHITIETPHONG(int ID_Order, String ID_Phong, String GioVao, String GioRa, int TienGio, int TienDV) {
        this.ID_Order = ID_Order;
        this.ID_Phong = ID_Phong;
        this.GioVao = GioVao;
        this.GioRa = GioRa;
        this.TienGio = TienGio;
        this.TienDV = TienDV;
    }

    public String getGioRa() {
        return GioRa;
    }

    public String getGioVao() {
        return GioVao;
    }

    public int getID_Order() {
        return ID_Order;
    }

    public String getID_Phong() {
        return ID_Phong;
    }

    public int getTienDV() {
        return TienDV;
    }

    public int getTienGio() {
        return TienGio;
    }

    public void setGioRa(String GioRa) {
        this.GioRa = GioRa;
    }

    public void setGioVao(String GioVao) {
        this.GioVao = GioVao;
    }

    public void setID_Order(int ID_Order) {
        this.ID_Order = ID_Order;
    }

    public void setID_Phong(String ID_Phong) {
        this.ID_Phong = ID_Phong;
    }

    public void setTienDV(int TienDV) {
        this.TienDV = TienDV;
    }

    public void setTienGio(int TienGio) {
        this.TienGio = TienGio;
    }
}

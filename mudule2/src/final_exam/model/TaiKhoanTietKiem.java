package final_exam.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{

    int soTienGui;
    String ngayGui;
    int laiSuat;
    String kyHan;

    public TaiKhoanTietKiem(int idTaiKhoan, String maTaiKhoan, String chuTaiKhoan, String ngayTao, int soTienGui, String ngayGui, int laiSuat, String kyHan) {
        super(idTaiKhoan, maTaiKhoan, chuTaiKhoan, ngayTao);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    public TaiKhoanTietKiem(int soTienGui, String ngayGui, int laiSuat, String kyHan) {
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    public TaiKhoanTietKiem() {
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(int soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                ", idTaiKhoan='" + idTaiKhoan +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", chuTaiKhoan='" + chuTaiKhoan + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                ", soTienGui=" + soTienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat=" + laiSuat +'\'' +
                ", kyHan='" + kyHan + '\'' +
                        '}';
    }
    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",idTaiKhoan,maTaiKhoan,chuTaiKhoan,ngayTao,soTienGui,ngayGui,laiSuat,kyHan);
    }
}

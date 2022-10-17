package final_exam.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    int soThe;
    int soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(int idTaiKhoan, String maTaiKhoan, String chuTaiKhoan, String ngayTao, int soThe, int soTienTrongTaiKhoan) {
        super(idTaiKhoan, maTaiKhoan, chuTaiKhoan, ngayTao);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(int soThe, int soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan() {
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public void setSoTienTrongTaiKhoan(int soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public int getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                ", idTaiKhoan='" + idTaiKhoan +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", chuTaiKhoan='" + chuTaiKhoan + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                "soThe=" + soThe + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +

                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",idTaiKhoan,maTaiKhoan,chuTaiKhoan,ngayTao,soThe,soTienTrongTaiKhoan);
    }
}

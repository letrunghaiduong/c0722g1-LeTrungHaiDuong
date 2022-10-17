package final_exam.model;

public abstract class TaiKhoanNganHang {
    int idTaiKhoan;
    String maTaiKhoan;
    String chuTaiKhoan;
    String ngayTao;

    public TaiKhoanNganHang(int idTaiKhoan, String maTaiKhoan, String chuTaiKhoan, String ngayTao) {
        this.idTaiKhoan = idTaiKhoan;
        this.maTaiKhoan = maTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.ngayTao = ngayTao;
    }

    public TaiKhoanNganHang() {
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "idTaiKhoan='" + idTaiKhoan + '\'' +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", chuTaiKhoan='" + chuTaiKhoan + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                '}';
    }
    public abstract String getInfo();
}

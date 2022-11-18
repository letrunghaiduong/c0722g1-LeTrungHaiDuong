package model;

public class BenhAn {
    private String maBenhAn;
    private String maBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;
    private String phuongPhapDieuTri;
    private String bacSiDieuTri;
    private BenhNhan benhNhan;

    public BenhAn(String maBenhAn, String maBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.bacSiDieuTri = bacSiDieuTri;
    }

    public BenhAn() {
    }

    public BenhAn(String maBenhAn, String maBenhNhan, BenhNhan benhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.bacSiDieuTri = bacSiDieuTri;
        this.benhNhan = benhNhan;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String getPhuongPhapDieuTri() {
        return phuongPhapDieuTri;
    }

    public void setPhuongPhapDieuTri(String phuongPhapDieuTri) {
        this.phuongPhapDieuTri = phuongPhapDieuTri;
    }

    public String getBacSiDieuTri() {
        return bacSiDieuTri;
    }

    public void setBacSiDieuTri(String bacSiDieuTri) {
        this.bacSiDieuTri = bacSiDieuTri;
    }
}

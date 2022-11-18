package repostory.impl;

import model.BenhAn;
import model.BenhNhan;
import repostory.BaseRepostory;
import repostory.IBenhAnRepostory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepostory implements IBenhAnRepostory {
    private static final String SELECT_ALL ="select ba.*,bn.ten_benh_nhan from benh_an ba\n" +
            "join benh_nhan bn\n" +
            "on ba.ma_benh_nhan = bn.ma_benh_nhan;";
    private static final String UPDATE = "update benh_an set ma_benh_nhan = ?,ngay_nhap_vien = ? , ngay_ra_vien = ?," +
            " ly_do_nhap_vien = ? where ma_benh_an = ?;";
    @Override
    public List<BenhAn> findAll() {
        List<BenhAn> benhAnList = new ArrayList<>();
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_nhan");
                String ngayNhapVien = resultSet.getString("ngay_nhap_vien");
                String ngayRaVien = resultSet.getString("ngay_ra_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                String phuongPhapDieuTri = resultSet.getString("phuong_phap_dieu_tri");
                String bacSiDieuTri = resultSet.getString("bac_si_dieu_tri");
                BenhNhan benhNhan = new BenhNhan(maBenhNhan,tenBenhNhan);
                BenhAn benhAn = new BenhAn(maBenhAn,maBenhNhan,benhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien,
                        phuongPhapDieuTri,bacSiDieuTri);
                benhAnList.add(benhAn);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhAnList;
    }

    @Override
    public boolean update(BenhAn benhAn) {
        Connection connection = BaseRepostory.getConnectDB();
        try {
            PreparedStatement ps =connection.prepareStatement(UPDATE);
            ps.setString(1,benhAn.getMaBenhNhan());
            ps.setString(2,benhAn.getNgayNhapVien());
            ps.setString(3,benhAn.getNgayRaVien());
            ps.setString(4,benhAn.getLyDoNhapVien());
            ps.setString(5,benhAn.getMaBenhAn());
            return ps.executeUpdate() >0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}

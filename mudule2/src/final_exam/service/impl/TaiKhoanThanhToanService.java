package final_exam.service.impl;

import MVC.model.Student;
import final_exam.model.TaiKhoanThanhToan;
import final_exam.model.TaiKhoanTietKiem;
import final_exam.service.ITaiKhoanThanhToanService;
import final_exam.utils.KiemTraException;
import final_exam.utils.WrongInputException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanService implements ITaiKhoanThanhToanService {
    Scanner scanner = new Scanner(System.in);
    List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
    @Override
    public void themMoi() throws IOException {
        taiKhoanThanhToanList = docFileTaiKhoanThanhToan();
        TaiKhoanThanhToan taiKhoanThanhToan = this.info();
        taiKhoanThanhToanList.add(taiKhoanThanhToan);
        System.out.println("Thêm mới thành công");
        ghiFile(taiKhoanThanhToanList);
    }

    @Override
    public void xoa() throws IOException {
        taiKhoanThanhToanList = docFileTaiKhoanThanhToan();
        System.out.print("Mời bạn nhập mã tài khoản: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if (taiKhoanThanhToanList.get(i).getIdTaiKhoan() == (id)) {
                System.out.println("Bạn có chắc muốn xóa tài khoản này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    taiKhoanThanhToanList.remove(i);
                    System.out.println("Xóa thành công");
                }
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        ghiFile(taiKhoanThanhToanList);

    }

    @Override
    public void hienThi() throws IOException {
        taiKhoanThanhToanList = docFileTaiKhoanThanhToan();
        for (TaiKhoanThanhToan taiKhoanThanhToan: taiKhoanThanhToanList){
            System.out.println(taiKhoanThanhToan.toString());
        }
    }

    @Override
    public void timkiem() throws IOException {
        taiKhoanThanhToanList = docFileTaiKhoanThanhToan();
        boolean check = false;
        System.out.println("Mời bạn nhập tên chủ tài khoản cần tìm");
        String tenTaiKhoan = scanner.nextLine();
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if (taiKhoanThanhToanList.get(i).getChuTaiKhoan().contains(tenTaiKhoan)) {
                System.out.println(taiKhoanThanhToanList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tài khoản ");
        }
    }

    private List<TaiKhoanThanhToan> docFileTaiKhoanThanhToan() throws IOException {
        File file = new File("src\\final_exam\\data\\tai_khoan_thanh_toan.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        TaiKhoanThanhToan taiKhoanThanhToan;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null){
            info = line.split(",");
            taiKhoanThanhToan = new TaiKhoanThanhToan(Integer.parseInt(info[0]), info[1],info[2],info[3],Integer.parseInt(info[4]),Integer.parseInt(info[5]));
            taiKhoanThanhToanList.add(taiKhoanThanhToan);
        }
        reader.close();
        return taiKhoanThanhToanList;
    }
    private void ghiFile(List<TaiKhoanThanhToan> taiKhoanThanhToanList)throws IOException{
        File file = new File("src\\final_exam\\data\\tai_khoan_thanh_toan.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (TaiKhoanThanhToan taiKhoanThanhToan: taiKhoanThanhToanList){
            writer.write(taiKhoanThanhToan.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    public TaiKhoanThanhToan info(){
        int idTaiKhoan;
        String maTaiKhoan;
        String chuTaiKhoan;
        String ngayTao;
        int soThe;
        int soTienTrongTaiKhoan;
        while (true){
            try {
                System.out.println("Mời bạn nhập id: ");
                idTaiKhoan = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Id không hợp lệ, nhập lại: ");
            }
        }
        System.out.println("Mời bạn nhập mã tài khoản: ");
        maTaiKhoan= scanner.nextLine();
        while (true){
            try {
                System.out.println("Mời bạn nhập tên chủ tài khoản: ");
                chuTaiKhoan = scanner.nextLine();
                KiemTraException.kiemTraTenTaiKhoan(chuTaiKhoan);
                break;
            }catch ( WrongInputException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập ngày tạo tài khoản: ");
                ngayTao = scanner.nextLine();
                KiemTraException.kiemTraNgayThang(ngayTao);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập số thẻ : ");
                soThe = Integer.parseInt(scanner.nextLine());
                KiemTraException.kiemTraSoThe(soThe);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập số tiền trong tài khoản : ");
                soTienTrongTaiKhoan = Integer.parseInt(scanner.nextLine());
                KiemTraException.kiemTraTienGui(soTienTrongTaiKhoan);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }

        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(idTaiKhoan,maTaiKhoan,chuTaiKhoan,ngayTao,soThe,soTienTrongTaiKhoan);
        return taiKhoanThanhToan;
    }
}

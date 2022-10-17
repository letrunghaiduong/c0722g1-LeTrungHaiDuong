package final_exam.service.impl;
import final_exam.model.TaiKhoanTietKiem;
import final_exam.service.ITaiKhoanTietKiemService;
import final_exam.utils.KiemTraException;
import final_exam.utils.WrongInputException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanTietKiemService {
    private static Scanner scanner = new Scanner(System.in);
    List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
    @Override
    public void themMoi() throws IOException {
        taiKhoanTietKiemList = docFileTaiKhoanTietKiem();
        TaiKhoanTietKiem taiKhoanTietKiem = this.info();
        taiKhoanTietKiemList.add(taiKhoanTietKiem);
        System.out.println("Thêm mới thành công");
        ghiFile(taiKhoanTietKiemList);
    }

    @Override
    public void xoa() throws IOException {
        taiKhoanTietKiemList = docFileTaiKhoanTietKiem();
        System.out.print("Mời bạn nhập mã tài khoản: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if (taiKhoanTietKiemList.get(i).getIdTaiKhoan() == (id)) {
                System.out.println("Bạn có chắc muốn xóa tài khoản này không? Nhập Y: yes, N: no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    taiKhoanTietKiemList.remove(i);
                    System.out.println("Xóa thành công");
                }
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
        ghiFile(taiKhoanTietKiemList);

    }

    @Override
    public void hienThi() throws IOException {
        taiKhoanTietKiemList = docFileTaiKhoanTietKiem();
        for (TaiKhoanTietKiem taiKhoanTietKiem: taiKhoanTietKiemList){
            System.out.println(taiKhoanTietKiem.toString());
        }

    }

    @Override
    public void timkiem() throws IOException {
        taiKhoanTietKiemList = docFileTaiKhoanTietKiem();
        boolean check = false;
        System.out.println("Mời bạn nhập tên chủ tài khoản cần tìm");
        String tenTaiKhoan = scanner.nextLine();
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if (taiKhoanTietKiemList.get(i).getChuTaiKhoan().contains(tenTaiKhoan)) {
                System.out.println(taiKhoanTietKiemList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tài khoản ");
        }
    }

    private List<TaiKhoanTietKiem> docFileTaiKhoanTietKiem() throws IOException {
        File file = new File("src\\final_exam\\data\\tai_khoan_tiet_kiem.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        TaiKhoanTietKiem taiKhoanTietKiem;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null){
            info = line.split(",");
            taiKhoanTietKiem = new TaiKhoanTietKiem(Integer.parseInt(info[0]), info[1],info[2],info[3],Integer.parseInt(info[4]),info[5],Integer.parseInt(info[6]),info[7]);
            taiKhoanTietKiemList.add(taiKhoanTietKiem);
        }
        reader.close();
        return taiKhoanTietKiemList;
    }
    private void ghiFile(List<TaiKhoanTietKiem> taiKhoanTietKiemList)throws IOException{
        File file = new File("src\\final_exam\\data\\tai_khoan_tiet_kiem.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (TaiKhoanTietKiem taiKhoanTietKiem: taiKhoanTietKiemList){
            writer.write(taiKhoanTietKiem.getInfo());
            writer.newLine();
        }
        writer.close();
    }
    public TaiKhoanTietKiem info(){
        int idTaiKhoan;
        String maTaiKhoan;
        String chuTaiKhoan;
        String ngayTao;
        int soTienGui;
        String ngayGui;
        int laiSuat;
        String kyHan;
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
                System.out.println("Mời bạn nhập số tiền gửi: ");
                soTienGui = Integer.parseInt(scanner.nextLine());
                KiemTraException.kiemTraTienGui(soTienGui);
                break;
            }catch (WrongInputException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập ngày gửi: ");
                ngayGui = scanner.nextLine();
                KiemTraException.kiemTraNgayThang(ngayGui);
                break;
            }catch (WrongInputException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập lãi suất: ");
                laiSuat = Integer.parseInt(scanner.nextLine());
                KiemTraException.kiemTraLaiSuat(soTienGui);
                break;
            }catch (WrongInputException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Mời bạn nhập kỳ hạn: ");
        kyHan = scanner.nextLine();
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(idTaiKhoan,maTaiKhoan,chuTaiKhoan,ngayTao,soTienGui,ngayGui,laiSuat,kyHan);
        return taiKhoanTietKiem;
    }
}

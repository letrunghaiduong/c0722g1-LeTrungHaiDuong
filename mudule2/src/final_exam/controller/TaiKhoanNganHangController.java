package final_exam.controller;

import final_exam.service.ITaiKhoanThanhToanService;
import final_exam.service.ITaiKhoanTietKiemService;
import final_exam.service.impl.TaiKhoanThanhToanService;
import final_exam.service.impl.TaiKhoanTietKiemService;

import java.io.IOException;
import java.util.Scanner;

public class TaiKhoanNganHangController {
    private static ITaiKhoanTietKiemService taiKhoanTietKiemService = new TaiKhoanTietKiemService();
    private static ITaiKhoanThanhToanService taiKhoanThanhToanService = new TaiKhoanThanhToanService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() throws IOException {
        while (true){
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG -----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Thêm mới tài khoản tiết kiệm");
                    System.out.println("2. Thêm mới tài khoản thanh toán");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1){
                        case 1:
                            taiKhoanTietKiemService.themMoi();
                            break;
                        case 2:
                            taiKhoanThanhToanService.themMoi();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Xóa tài khoản tiết kiệm");
                    System.out.println("2. Xóa mới tài khoản thanh toán");
                    int choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2){
                        case 1:
                            taiKhoanTietKiemService.xoa();
                            break;
                        case 2:
                            taiKhoanThanhToanService.xoa();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Xem danh sách tài khoản tiết kiệm");
                    System.out.println("2. Xem danh sách tài khoản thanh toán");
                    int choose3 = Integer.parseInt(scanner.nextLine());
                    switch (choose3){
                        case 1:
                            taiKhoanTietKiemService.hienThi();
                            break;
                        case 2:
                            taiKhoanThanhToanService.hienThi();
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                    System.out.println("1. Tìm kiếm tài khoản tiết kiệm");
                    System.out.println("2. Tìm kiếm tài khoản thanh toán");
                    int choose4 = Integer.parseInt(scanner.nextLine());
                    switch (choose4){
                        case 1:
                            taiKhoanTietKiemService.timkiem();
                            break;
                        case 2:
                            taiKhoanThanhToanService.timkiem();
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}

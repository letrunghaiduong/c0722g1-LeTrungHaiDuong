package case_study.service.impl;

import case_study.model.Booking;
import case_study.model.Customer;
import case_study.service.IBookingService;
import case_study.ultil.Check;
import case_study.ultil.WrongInPutException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingService implements IBookingService {
    FacilityService facilityService = new FacilityService();
    CustomerService customerService = new CustomerService();
    List<Booking> bookingList = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewBooking() throws IOException {
        System.out.println("*********DANH SÁCH KHÁCH HÀNG*******");
        customerService.displayCustomer();
        System.out.println("***********DANH SÁCH DỊCH VỤ*********");
        facilityService.displayFacility();
        Booking booking = this.infoBooking();
        bookingList.add(booking);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayBooking() {
        for (int i = 0; i < bookingList.size(); i++){
            System.out.println(bookingList.get(i));
        }
    }

    private Booking infoBooking() throws IOException {
        int bookingCode;
        LocalDate startDay;
        LocalDate endDate;
        int customerCode;
        String serviceName;
        String servceCode;
        while (true){
            try {
                System.out.println("Nhập mã booking: ");
                bookingCode = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã không hợp lệ, nhập lại: ");
            }
        }
        while (true){
            try {
                System.out.println("Nhập ngày bắt đầu: ");
                startDay = LocalDate.parse(scanner.nextLine(),formatter);
                break;
            }catch (Exception e){
                System.out.println("Ngày sai định dạng, nhập lại: ");
            }
        }
        while (true){
            try {
                System.out.println("Nhập ngày bắt đầu: ");
                endDate = LocalDate.parse(scanner.nextLine(),formatter);
                break;
            }catch (Exception e){
                System.out.println("Ngày sai định dạng, nhập lại: ");
            }
        }
        while (true){
            try {
                System.out.println("Nhập mã khách hàng: ");
                customerCode = Integer.parseInt(scanner.nextLine());
                Check.checkCodeCustomerBooking(customerCode);
                break;
            }catch (NumberFormatException e){
                System.out.println("Mã khách hàng không hợp lệ, nhập lại");
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập dịch vụ muốn thuê: ");
                serviceName = scanner.nextLine();
                Check.checkNameService(serviceName);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập mã dịch vụ: ");
                servceCode = scanner.nextLine();
                Check.checkServiceCodeBooking(servceCode);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        Booking booking = new Booking(bookingCode,startDay,endDate,customerCode,serviceName,servceCode);
        return booking;
    }
}

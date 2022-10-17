package case_study.ultil;

import case_study.model.Facility;
import case_study.service.impl.CustomerService;
import case_study.service.impl.FacilityService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Check {
    public static void checkName(String name) throws WrongInPutException {
        String nameRegex = "^[a-zA-Z\\s]*$";
        if (!name.matches(nameRegex)){
            throw new WrongInPutException("Tên không hợp lệ, nhập lại");
        }
    }
    public static void checkDateOfBirth(String day) throws WrongInPutException{
        String birthdayRegex = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        if (!day.matches(birthdayRegex)){
            throw new WrongInPutException("Ngày sinh không hợp lệ, nhập lại");
        }
    }
    public static void checkGender(String gender) throws WrongInPutException {
        String genderRegex = "(Nam|Nu)";
        if (!gender.matches(genderRegex)){
            throw new WrongInPutException("Giới tính không hợp lệ, nhập lại");
        }
    }
    public static void checkIdentityCard(String identityCard) throws WrongInPutException{
        String identityCardRegex = "[0-9]{5,}";
        if (!identityCard.matches(identityCardRegex)){
            throw new WrongInPutException("Số CMND không hợp lệ, nhập lại: ");
        }
    }
    public static void checkPhoneNumber(String phoneNumber) throws WrongInPutException{
        String phoneNumberRegex = "0[0-9]{5,}";
        if (!phoneNumber.matches(phoneNumberRegex)){
            throw new WrongInPutException("Số điện thoại không hợp lệ, nhập lại:");
        }
    }
    public static void checkEmail(String email) throws WrongInPutException{
        String emailRegex = "^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$";
        if (!email.matches(emailRegex)){
            throw new WrongInPutException("Email không hợp lệ, nhập lại: ");
        }
    }
    public static void checkLevel(String level) throws WrongInPutException{
        String levelRegex = "(Trung cấp|Cao đẳng|Đại học|Sau đại học)";
        if (!level.matches(levelRegex)){
            throw new WrongInPutException("Trình độ không hợp lệ, nhập lại");
        }
    }
    public static void checkPosition(String position) throws WrongInPutException{
        String positionRegex = "(Lễ tân|Phục vụ|Chuyên viên|Giám sát|Quản lý|Giám đốc)";
        if (!position.matches(positionRegex)){
            throw new WrongInPutException("Chức vụ không hợp lệ, nhập lại");
        }
    }
    public static void checkCustomerType(String customerType)throws WrongInPutException{
        String typeRegex = "(Diamond|Platinium|Gold|Silver|Member)";
        if (!customerType.matches(typeRegex)){
            throw new WrongInPutException("Loại khách hàng không đúng, nhập lại");
        }
    }
    public static void checkAddress(String address) throws WrongInPutException{
        String addressRegex = "(^[\\sa-zA-Z0-9_-]{3,}$)+";
        if (!address.matches(addressRegex)){
            throw new WrongInPutException("Địa chỉ không đúng, nhập lại: ");
        }
    }
    public static void checkNameService(String nameService) throws WrongInPutException {
        String nameServiceRegex = "(Villa|House|Room)";
        if (!nameService.matches(nameServiceRegex)){
            throw new WrongInPutException("Tên dịch vụ không đúng, nhập lại: ");
        }
    }
    public static void checkRentType( String rentType)throws WrongInPutException{
        String rentTypeRegex = "(Ngày|Tháng|Năm)";
        if (!rentType.matches(rentTypeRegex)){
            throw new WrongInPutException("Kiểu thuê không đúng, nhập lại: ");
        }
    }
    public static void checkRoomStandard(String roomStandard) throws WrongInPutException{
        String roomStandardRegex = "(Vip|Normal)";
        if (!roomStandard.matches(roomStandardRegex)){
            throw new WrongInPutException("Nhập lại tiêu chuẩn phòng(Vip/Normal): ");
        }
    }
    public static void checkServiceCodeVilla(String serviceCode)throws WrongInPutException{
        String serviceCodeRegex = "VL-[0-9]{4}";
        if (!serviceCode.matches(serviceCodeRegex)){
            throw new WrongInPutException("Mã dịch vụ không đúng, nhập lại: ");
        }
    }
    public static void checkServiceCodeHouse(String serviceCode)throws WrongInPutException{
        String serviceCodeRegex = "HO-[0-9]{4}";
        if (!serviceCode.matches(serviceCodeRegex)){
            throw new WrongInPutException("Mã dịch vụ không đúng, nhập lại: ");
        }
    }
    public static void checkServiceCodeRoom(String serviceCode)throws WrongInPutException{
        String serviceCodeRegex = "RO-[0-9]{4}";
        if (!serviceCode.matches(serviceCodeRegex)){
            throw new WrongInPutException("Mã dịch vụ không đúng, nhập lại: ");
        }
    }
    public static void checkArea(double area)throws WrongInPutException{
        if (area < 30){
            throw new WrongInPutException("Diện tích không đúng, nhập lại: ");
        }
    }
    public static void checkCost(Double cost)throws WrongInPutException{
        if (cost < 0){
            throw new WrongInPutException("Chi phí không đúng, nhập lại: ");
        }
    }
    public static void checkNumberPeople(int number) throws WrongInPutException{
        if (number <= 0 || number >= 20){
            throw new WrongInPutException("Số lượng người không đúng, nhập lại: ");
        }
    }
    public static void checkNumberOfFloors(int number) throws WrongInPutException{
        if (number <= 0){
            throw new WrongInPutException("Số tầng không đúng, nhập lại: ");
        }
    }
    public static void checkAge(LocalDate dateOfBirth)throws WrongInPutException{
        LocalDate date = LocalDate.now();
        if (Period.between(dateOfBirth,date).getYears() < 18 || Period.between(dateOfBirth,date).getYears() > 100){
            throw new WrongInPutException("Chưa đủ 18 tuổi, nhập lại ngày sinh: ");
        }
    }
    public static void checkCodeCustomerBooking(int code) throws WrongInPutException, IOException {
        boolean check = false;
        for (int i = 0; i< CustomerService.readCustomerFile().size(); i++){
            if (code == CustomerService.readCustomerFile().get(i).getCode()){
                check = true;
                break;
            }
        }
        if (!check){
            throw new WrongInPutException("Không tìm thấy khách hàng có mã này, nhập lại");
        }
    }
    public static void checkServiceCodeBooking(String serviceCode) throws WrongInPutException, IOException {
        boolean check = false;
        for (int i = 0; i< FacilityService.readVilaFile().size(); i++){
            if (serviceCode.equals(FacilityService.readVilaFile().get(i).getServiceCode()) | serviceCode.equals(FacilityService.readHouseFile().get(i).getServiceCode()) | serviceCode.equals(FacilityService.readRoomFile().get(i).getServiceCode())){
                check = true;
                break;
            }
        }
        if (!check){
            throw new WrongInPutException("Không tìm thấy khách hàng có mã này, nhập lại");
        }
    }
    public static void checkCodeCustomer(int code) throws WrongInPutException, IOException {
        boolean check = true;
        for (int i = 0; i< CustomerService.readCustomerFile().size(); i++){
            if (code == CustomerService.readCustomerFile().get(i).getCode()){
                check = false;
                break;
            }
        }
        if (!check){
            throw new WrongInPutException("Mã khách hàng đã tồn tại, nhập lại");
        }
    }
}


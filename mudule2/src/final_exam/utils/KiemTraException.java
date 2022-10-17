package final_exam.utils;



public class KiemTraException {
    public static void kiemTraTenTaiKhoan(String tenTaiKhoan) throws WrongInputException {
        String nameRegex = "^[a-zA-Z\\s]*$";
        if (!tenTaiKhoan.matches(nameRegex)){
            throw new WrongInputException("Tên không hợp lệ, nhập lại");
        }
    }
    public static void kiemTraNgayThang(String ngay)throws  WrongInputException{
        String birthdayRegex = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        if (!ngay.matches(birthdayRegex)){
            throw new WrongInputException("Ngày sinh không hợp lệ, nhập lại");
        }
    }
    public static void kiemTraTienGui(int soTien)throws WrongInputException {
        if (soTien <=0 ){
            throw new WrongInputException("Số tiền gửi không hợp lệ, nhập lại: ");
        }
    }
    public static void kiemTraLaiSuat(int laiSuat)throws WrongInputException {
        if (laiSuat < 0){
            throw new WrongInputException("Lãi suất không hợp lệ, nhập lại: ");
        }
    }
    public static void kiemTraSoThe(int soThe)throws WrongInputException {
        if (soThe < 0){
            throw new WrongInputException("Lãi suất không hợp lệ, nhập lại: ");
        }
    }
}

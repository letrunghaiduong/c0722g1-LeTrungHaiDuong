package case_study.service.ultil;

import MVC.service.ulti.WrongInputException;

public class Check {
    public static void checkName(String name) throws WrongInPutException {
        String nameRegex = "([A-Z][a-z]+[ ])+([A-Z][a-z]+)";
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
        String identityCardRegex = "[0-9]{12}";
        if (!identityCard.matches(identityCardRegex)){
            throw new WrongInPutException("Số CMND không hợp lệ, nhập lại: ");
        }
    }
    public static void checkPhoneNumber(String phoneNumber) throws WrongInPutException{
        String phoneNumberRegex = "0[0-9]{9}";
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
        String positionRegex = "(Lễ tân|Phục vụ|Phuyên viên|Giám sát|Quản lý|Giám đốc)";
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
        String addressRegex = "([0-9]?[A-Z][a-z]+_)+";
        if (!address.matches(addressRegex)){
            throw new WrongInPutException("Địa chỉ không đúng, nhập lại: ");
        }
    }
}

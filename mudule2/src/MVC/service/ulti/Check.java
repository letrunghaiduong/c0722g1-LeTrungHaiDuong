package MVC.service.ulti;

public class Check {
    public static void checkName(String name) throws WrongInputException {
        String nameRegex = "([A-Z][a-z]+[ ])+([A-Z][a-z]+)";
        if (!name.matches(nameRegex)){
            throw new WrongInputException("Tên không hợp lệ, nhập lại");
        }
    }
    public static void checkScore(double score) throws  WrongInputException{
        if (score < 0 || score > 10){
            throw new WrongInputException("Điểm không hợp lệ, nhập lại: ");
        }
    }
    public static void checkGender(String gender) throws WrongInputException {
        String genderRegex = "(Nam|Nu)";
        if (!gender.matches(genderRegex)){
            throw new WrongInputException("Giới tính không hợp lệ, nhập lại");
        }
    }
    public static void checkBirthday(String birthday) throws WrongInputException{
        String birthdayRegex = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        if (!birthday.matches(birthdayRegex)){
            throw new WrongInputException("Ngày sinh không hợp lệ, nhập lại");
        }
    }
    public static void checkClass(String className)throws WrongInputException{
        String classRegex = "[[A-Z][0-9]]+";
        if (!className.matches(classRegex)) {
            throw new WrongInputException("Tên lớp không hợp lệ, nhập lại: ");
        }
    }
}

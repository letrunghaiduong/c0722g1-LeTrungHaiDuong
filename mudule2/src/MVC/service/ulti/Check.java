package MVC.service.ulti;

public class Check {
    public static void checkName(String name) throws WrongInputException {
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) < 32 || name.charAt(i) > 32 && name.charAt(i) < 65 || name.charAt(i) > 90 && name.charAt(i) < 97 || name.charAt(i) > 123){
                throw new WrongInputException("Tên sai định dạng, nhập lại: ");
            }
        }
    }
    public static void checkScore(double score) throws  WrongInputException{
        if (score < 0 || score > 10){
            throw new WrongInputException("Điểm không hợp lệ, nhập lại: ");
        }
    }
}

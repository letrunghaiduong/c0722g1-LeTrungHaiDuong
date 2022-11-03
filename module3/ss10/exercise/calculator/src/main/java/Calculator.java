public class Calculator {
    public static double calculate(double firstOperand, double secondOperand, char operator) throws Exception {
        switch (operator){
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand == 0){
                    throw new Exception("Mẫu số không hợp lệ");
                }else {
                    return firstOperand / secondOperand;
                }
            default:
                throw new Exception("Phép toán không hợp lệ");
        }
    }
}

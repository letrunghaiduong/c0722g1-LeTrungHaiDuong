package case_study.model;

public class Employee extends Persion{

    String level;
    String position;
    double wage;

    public Employee(int code, String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String level, String position, double wage) {
        super(code, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String level, String position, double wage) {
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,",code,name,dateOfBirth,gender,identityCard,phoneNumber,email,level,position,wage);
    }
}

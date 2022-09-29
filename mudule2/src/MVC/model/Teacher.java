package MVC.model;

import java.time.LocalDate;

public class Teacher extends Person{
    private String specialize;

    public Teacher(int id, String name, String birthDay, String gender, String specialize) {
        super(id, name, birthDay, gender);
        this.specialize = specialize;
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",getId(),getName(),getBirthDay(),getGender(),getSpecialize());
    }
}

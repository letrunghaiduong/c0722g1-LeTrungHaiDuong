package case_study.model;

import java.time.LocalDate;

public class Customer extends Persion{

    String customerType;
    String address;

    public Customer(int code, String name, LocalDate dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String customerType, String address) {
        super(code, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",code,name,dateOfBirth,gender,identityCard,phoneNumber,email,customerType,address);
    }
}

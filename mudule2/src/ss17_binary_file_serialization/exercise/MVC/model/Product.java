package ss17_binary_file_serialization.exercise.MVC.model;

import java.io.Serializable;

public class Product implements Serializable {
    int code;
    String name;
    String manufacturer;
    double price;
    String describe;

    public Product(int code, String name, String manufacturer, double price, String describe) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.describe = describe;
    }

    public Product() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",code,name,manufacturer,price,describe);
    }
}

package ss12_collection_framework.exercise.model;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name,double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

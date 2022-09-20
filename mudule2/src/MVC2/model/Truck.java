package MVC2.model;

public class Truck extends Vehicle{
    private String tonnage;

    public Truck(String licensePlate, String manufacturer, int yearOfManufacture, String owner, String tonnage) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public Truck(String tonnage) {
        this.tonnage = tonnage;
    }

    public Truck() {
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString()+
                "tonnage='" + tonnage + '\'' +
                '}';
    }
}

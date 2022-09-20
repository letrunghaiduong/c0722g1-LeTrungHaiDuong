package MVC2.model;

public class Motorcycle extends Vehicle{
    private String wattage;

    public Motorcycle(String licensePlate, String manufacturer, int yearOfManufacture, String owner, String wattage) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public Motorcycle(String wattage) {
        this.wattage = wattage;
    }

    public Motorcycle() {
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +super.toString()+
                "wattage='" + wattage + '\'' +
                '}';
    }
}

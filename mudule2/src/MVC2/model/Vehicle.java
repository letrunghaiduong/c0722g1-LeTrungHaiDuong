package MVC2.model;

public abstract class Vehicle {
    private String licensePlate;
    private String manufacturer;
    private int yearOfManufacture;
    private String owner;

    public Vehicle(String licensePlate, String manufacturer, int yearOfManufacture, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public Vehicle() {
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}

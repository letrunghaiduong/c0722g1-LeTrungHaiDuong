package MVC2.model;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String carType;

    public Car(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String carType) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Car(int numberOfSeats, String carType) {
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Car() {
    }


    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car{" +super.toString()+
                "numberOfSeats=" + numberOfSeats +
                ", carType='" + carType + '\'' +
                '}';
    }
}

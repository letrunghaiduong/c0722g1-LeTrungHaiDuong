package ss5_Access_modifier.practice;

public class Car {
    private String name;

    private String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }

    public Car(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String carType) {
    }



    // getters and setters
}

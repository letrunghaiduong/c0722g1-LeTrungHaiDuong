package MVC2.service;

public interface ICarService {
    void addCar();

    void carList();

    void searchCar(String licensePlate);

    void removeCar(String licensePlateRemove);
}

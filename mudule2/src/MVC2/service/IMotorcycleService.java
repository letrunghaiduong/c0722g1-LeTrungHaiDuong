package MVC2.service;

public interface IMotorcycleService {
    void addMoto();

    void motoList();

    void searchMoto(String licensePlate);

    void removeMoto(String licensePlateRemove);
}

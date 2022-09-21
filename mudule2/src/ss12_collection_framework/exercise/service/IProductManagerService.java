package ss12_collection_framework.exercise.service;

public interface IProductManagerService {
    void addProduct();

    void removeProduct(int idRemove);

    void editProduct(int idEdit);

    void productList();

    void seachByName(String nameToSearch);

    void ascending();

    void decrease();
}

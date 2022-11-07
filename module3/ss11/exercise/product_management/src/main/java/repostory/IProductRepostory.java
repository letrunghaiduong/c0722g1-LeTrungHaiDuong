package repostory;

import model.Product;

import java.util.List;

public interface IProductRepostory {
    List<Product> findAll();
    void add(Product product);
    void update(int id ,Product product);
    void remove(int id);
    List<Product> searchByName(String name);
    Product findByName(String name);
}

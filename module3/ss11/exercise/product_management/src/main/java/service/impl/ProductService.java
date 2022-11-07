package service.impl;

import model.Product;
import repostory.IProductRepostory;
import repostory.impl.ProductRepostory;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepostory productRepostory = new ProductRepostory();
    @Override
    public List<Product> findAll() {
        return productRepostory.findAll();
    }

    @Override
    public void add(Product product) {
        productRepostory.add(product);
    }

    @Override
    public void update(int id, Product product) {
        productRepostory.update( id, product);
    }

    @Override
    public void remove(int id) {
        productRepostory.remove(id);
    }

    @Override
    public Product findByName(String name) {
        return productRepostory.findByName(name);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepostory.searchByName(name);
    }
}

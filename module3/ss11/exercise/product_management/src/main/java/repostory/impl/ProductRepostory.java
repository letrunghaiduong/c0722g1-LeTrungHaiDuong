package repostory.impl;

import model.Product;
import repostory.IProductRepostory;

import java.util.ArrayList;
import java.util.List;

public class ProductRepostory implements IProductRepostory {
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(0,"Product1",1000000,"describe1","producer1"));
        productList.add(new Product(1,"Product1",1000000,"describe1","producer1"));
        productList.add(new Product(2,"Product2",1500000,"describe2","producer2"));
        productList.add(new Product(3,"Product3",1200000,"describe3","producer3"));
        productList.add(new Product(4,"Product4",1000000,"describe4","producer4"));
        productList.add(new Product(5,"Product5",2000000,"describe5","producer5"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i <productList.size(); i++) {
            if (productList.get(i).getId()==id){
                productList.set(i,product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size() ; i++) {
            if (productList.get(i).getId() == id){
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> listSearch = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                listSearch.add(productList.get(i));
            }
        }
        return listSearch;
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                return productList.get(i);
            }
        }
        return null;
    }
}

package ss12_collection_framework.exercise.service.impl;

import ss12_collection_framework.exercise.model.Product;
import ss12_collection_framework.exercise.service.IProductManagerService;

import java.util.*;

public class ProductManaferService implements IProductManagerService {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeProduct(int idRemove) {
        boolean check = false;
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId() == idRemove){
                check = true;
                productList.remove(i);
                System.out.println("Xóa thành công");
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void editProduct(int idEdit) {
        boolean check = false;
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId() == idEdit){
                check = true;
                System.out.println("Sản phẩm lúc đầu: " + productList.get(i));
                System.out.println("Mời bạn nhập tên sản phẩm sau khi sửa: ");
                String nameEdit = scanner.nextLine();
                System.out.println("Mời bạn nhập giá sản phẩm sau khi sửa: ");
                double priceEdit = scanner.nextDouble();
                productList.get(i).setName(nameEdit);
                productList.get(i).setPrice(priceEdit);
                System.out.println("Sửa thành công");
            }
        }
        if (!check){
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void productList() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product: productList){
            System.out.println(product);
        }
    }

    @Override
    public void seachByName(String nameToSearch) {
        boolean check = false;
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getName().equals(nameToSearch)){
                check = true;
                System.out.println(productList.get(i));
            }
        }
        if (!check){
            System.out.println("Không có sản phẩm này");
        }
    }

    @Override
    public void ascending() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (Product product: productList){
            System.out.println(product);
        }
    }

    @Override
    public void decrease() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        for (Product product: productList){
            System.out.println(product);
        }
    }

    public Product infoProduct(){
        System.out.println("Mời bạn nhập id sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm : ");
        double price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}

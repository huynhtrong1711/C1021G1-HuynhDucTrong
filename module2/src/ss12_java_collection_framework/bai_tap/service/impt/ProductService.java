package ss12_java_collection_framework.bai_tap.service.impt;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.service.IProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
   private List<Product> productList = new ArrayList<>();
   private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addProduct() {
        System.out.print("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá tiền của sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    @Override
    public void fixProduct() {
        System.out.print("Nhập ID sản phẩm bạn muốn sửa: ");
        int newId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (newId == productList.get(i).getId()) {
                System.out.print("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giá của sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
                check = true;
                break;
            }
        }if (check == false) {
            System.out.println("Không có sản phẩm này.");
        }


    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập ID sản phẩm bạn muốn xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idRemove) {
                productList.remove(productList.get(i));
            } else {
                System.out.println("Không có sản phẩm này.");
            }
        }

    }

    @Override
    public void getProduct() {
        for (Product products : productList) {
            System.out.println(products);
        }

    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String nameProduct = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (nameProduct.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i)+ " là sản phẩm bạn cần tìm.");
                check = true;
                break;
            }
        } if (check == false){
            System.out.println("không có sản phẩm bạn cần tìm.");
        }

    }

    @Override
    public void sortProduct() {
        Collections.sort(productList);
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}

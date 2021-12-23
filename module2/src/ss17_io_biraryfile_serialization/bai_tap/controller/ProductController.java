package ss17_io_biraryfile_serialization.bai_tap.controller;

import ss17_io_biraryfile_serialization.bai_tap.model.Product;
import ss17_io_biraryfile_serialization.bai_tap.service.IProductService;
import ss17_io_biraryfile_serialization.bai_tap.service.impt.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService iProductService = new ProductService();
        ProductService productService = new ProductService();
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        productService.writeProduct();

        do {
            System.out.println(" MENU ");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị sản phẩm.");
            System.out.println("3. Tìm kiếm sản phẩm.");
            System.out.println("0. Exit.");
            System.out.println("Nhập lựa chọn: ");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    iProductService.addProduct();


                    break;
                case 2:
                    iProductService.getProduct();
                    productList = productService.readProduct();
                    break;
                case 3:
                    iProductService.searchProduct();
                    break;
                case 0:
                    System.exit(0);
            }

        }while (true);
    }
}

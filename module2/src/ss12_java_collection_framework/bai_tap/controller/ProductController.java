package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.service.IProductService;
import ss12_java_collection_framework.bai_tap.service.impt.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa thông tin sản phẩm.");
            System.out.println("3. Xóa sản phẩm.");
            System.out.println("4. Hiển thị danh sách.");
            System.out.println("5. Tìm kiếm sản phẩm.");
            System.out.println("6. Sắp xếp danh sách theo giá.");
            System.out.println("0. Exit");
            int chosce = Integer.parseInt(scanner.nextLine());
            switch (chosce) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.fixProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.getProduct();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;
                case 6:
                    iProductService.sortProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);

    }
}

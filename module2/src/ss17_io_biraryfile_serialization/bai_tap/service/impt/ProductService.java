package ss17_io_biraryfile_serialization.bai_tap.service.impt;

import ss17_io_biraryfile_serialization.bai_tap.model.Product;
import ss17_io_biraryfile_serialization.bai_tap.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {

    public static final String FILE_PRODUCT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss17_io_biraryfile_serialization\\bai_tap\\product.txt";
    public List<Product> products;
    {
        products = readProduct();
    }
    public void writeProduct() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PRODUCT);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(products);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  List<Product> readProduct() {
        List<Product> myProducts = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PRODUCT);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            myProducts = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return myProducts;

    }


    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id của sản phầm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Hãn sản phẩm: ");
        String khanOP = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập thông tin khác: ");
        String description = scanner.nextLine();
        Product product = new Product(id, name, khanOP, price, description);
        products.add(product);
writeProduct();
    }

    @Override
    public void getProduct() {
        for (Product product : products){
            System.out.println(product);
        }

    }

    @Override
    public void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String nameSearch = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < products.size(); i++ ) {
            if (nameSearch.equals(products.get(i).getNameProduct())) {
                System.out.println(products.get(i) + " Là sản phẩm bạn cần tìm.");
                check = true;
                break;
            }

        }
        if (check == false) {
            System.out.println("Không có sản phẩm bạn cần tìm.");
        }

    }
}

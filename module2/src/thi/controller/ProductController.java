package thi.controller;

import thi.service.IService;
import thi.service.impl.ExportService;
import thi.service.impl.ImportService;

import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    static int chose;
    static boolean checkChose;

    public static void displayMainMenu() {
        do {
            checkChose = false;
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách sản phẩm");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    displayProduct();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
            }
        }while (checkChose);
    }

    public static void add() {
        IService importProduct = new ImportService();
        IService exportProduct = new ExportService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới sản phẩm nhập khẩu");
            System.out.println("2. Thêm mới sản phẩm xuất khẩu");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    importProduct.add();
                    checkChose = true;
                    continue;
                case 2:
                    exportProduct.add();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void displayProduct() {
        IService displayImportProduct = new ImportService();
        IService displayExportProduct = new ExportService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Hiển thị sản phẩm nhập khẩu");
            System.out.println("2. Hiển thị sản phẩm xuất khẩu");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    displayImportProduct.display();
                    checkChose = true;
                    continue;
                case 2:
                    displayExportProduct.display();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void remove() {
        IService removeImport = new ImportService();
        IService removeExport = new ExportService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Xóa sản phẩm nhập khẩu");
            System.out.println("2. Xóa sản phẩm xuất khẩu");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    removeImport.remove();
                    checkChose = true;
                    continue;
                case 2:
                    removeExport.remove();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void search() {
        IService searchImport = new ImportService();
        IService searchExport = new ExportService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Tìm kiếm sản phẩm nhập khẩu");
            System.out.println("2. Tìm kiếm sản phẩm xuất khẩu");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    searchImport.search();
                    checkChose = true;
                    continue;
                case 2:
                    searchExport.search();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }


}

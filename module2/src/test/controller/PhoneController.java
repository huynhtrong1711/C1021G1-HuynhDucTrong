package test.controller;

import java.util.Scanner;

public class PhoneController {
    public static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            int chose =Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
            }
        }while (true);

    }

    private static void addPhone() {
        do {
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Thêm mới");
            System.out.println("Chọn chức năng: ");
            int choseAdd = Integer.parseInt(scanner.nextLine());


        }while (true);
    }
}

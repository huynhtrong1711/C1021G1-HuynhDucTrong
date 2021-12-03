package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class DisplayPicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập chiều dài của hình chữ nhật: ");
//        int weight = scanner.nextInt();
//        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
//        int height = scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < weight; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println("");
//        }
//        System.out.print("Nhập chiều cao của tam giác: ");
//        int hight = scanner.nextInt();
//        for (int i = 0; i < hight; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        System.out.print("Nhập chiều cao của tam giác: ");
        int hight = scanner.nextInt();
        for (int i = hight; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

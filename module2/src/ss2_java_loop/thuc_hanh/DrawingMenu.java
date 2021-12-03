package ss2_java_loop.thuc_hanh;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choise = -1;
        Scanner scanner = new Scanner(System.in);
        while (choise != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình tam giác.");
            System.out.println("2. Vẽ hình vuông.");
            System.out.println("3. Vẽ hình chữ nhật.");
            System.out.println("0. Kết thúc.");
            System.out.println("Nhập lựa chọn vẽ: ");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn");

            }

        }
    }
}

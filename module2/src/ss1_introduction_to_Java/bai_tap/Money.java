package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usa;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usa = scanner.nextDouble();
        double change = usa * vnd;
        System.out.println("Số tiền VND là: " + change);

    }
}

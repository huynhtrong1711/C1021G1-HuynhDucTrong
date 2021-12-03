package ss2_java_loop.thuc_hanh;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Hai số không có ước chung");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        System.out.println("Số ước chung là: " + a);
    }
}

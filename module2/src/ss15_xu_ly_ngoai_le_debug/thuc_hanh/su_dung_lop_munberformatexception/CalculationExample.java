package ss15_xu_ly_ngoai_le_debug.thuc_hanh.su_dung_lop_munberformatexception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số a: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập một số b: ");
        int y = Integer.parseInt(scanner.nextLine());
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);

    }


    public void calculate(int x, int y) {
        try {
            int a = x * y;
            int b = x + y;
            int c = x - y;
            int d = x / y;
            System.out.println("Tích của 2 số a và b: " + a);
            System.out.println("Tổng của 2 số a và b: " + b);
            System.out.println("Hiệu của 2 số a và b: " + c);
            System.out.println("Thương của 2 số a và b: " + d);
        }catch (Exception e) {
            System.out.println("Xãy ra ngoại lệ: " + e.getMessage());
        }
    }
}

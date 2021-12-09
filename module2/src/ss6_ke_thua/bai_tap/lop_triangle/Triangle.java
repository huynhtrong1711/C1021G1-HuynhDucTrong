package ss6_ke_thua.bai_tap.lop_triangle;

import java.util.Scanner;

public class Triangle extends Shape{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập màu của tam giác: ");
        String mau = scanner.nextLine();
        System.out.print("Nhập cạnh a của tam giác: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b của tam giác: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c của tam giác: ");
        double c = scanner.nextDouble();
        Shape shape = new Shape(a,b,c,mau);
        System.out.println(shape);
    }
}

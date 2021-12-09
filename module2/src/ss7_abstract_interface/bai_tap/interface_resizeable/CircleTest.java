package ss7_abstract_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập % tăng bán kính: ");
        double tang = scanner.nextDouble();
        Circle1 circle1 = new Circle1(8,"While", false,tang);
        circle1.resize();
    }
}

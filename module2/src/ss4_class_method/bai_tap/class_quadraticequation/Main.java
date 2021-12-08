package ss4_class_method.bai_tap.class_quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số bậc 1, a = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hằng số, c = ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có một nghiệm x = " + (-c / b));
            }
            return;

        }
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm là: x1= " + quadraticEquation.getRoot1()
                    + "x2= " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình có 1 nghiệm là x= " + quadraticEquation.getRoot3());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

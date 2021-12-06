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
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phườn trình vô nghiệm");
            }else {
                System.out.println("Phương trình có một nghiệm x = " + (-c / b));
            }
        }
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if ( delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: x1= " + x1 + "x2= " + x2);
        }else if (delta < 0) {
            x1 = (-b / (2*a));
            System.out.println("Phương trình có 1 nghiệm là x= " + x1);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

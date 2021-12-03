package ss3_java_array.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitTocelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu ");
            System.out.println("1. Nhập độ F: ");
            System.out.println("2. Nhập độ C ");
            System.out.println("0. Thoát: ");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Độ F sang độ C là: " + fahrenheitTocelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Độ C sang đọ F là: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while ( choice != 0 );


    }
}

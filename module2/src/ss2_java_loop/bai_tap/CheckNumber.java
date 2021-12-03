package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        int num = 3;
        boolean check = true;
        System.out.print("Nhập vào n số nguyên tố đầu tiên: ");
        numbers = scanner.nextInt();
        if (numbers >= 1) {
            System.out.println(numbers + " Số nguyên tố đầu tiên là: ");
            System.out.println(2);
        }
        for ( int count = 1; count < numbers;) {
            for ( int n = 2; n <= Math.sqrt(num);n++) {
                if ( num % n == 0 ) {
                    check = false;
                    break;
                }
            }if (check) {
                System.out.println(num);
                count++;
            }
            check = true;
            num++;
        }
    }
}

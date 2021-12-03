package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();
        String alphabet;
        switch (number) {
            case 0:
                alphabet = "Zero";
                break;
            case 1:
                alphabet = "One";
                break;
            case 2:
                alphabet = "Two";
                break;
            case 3:
                alphabet = "Three";
                break;
            case 4:
                alphabet = "Four";
                break;
            case 5:
                alphabet = "Five";
                break;
            case 6:
                alphabet = "Six";
                break;
            case 7:
                alphabet = "Seven";
                break;
            case 8:
                alphabet = "Eight";
                break;
            case 9:
                alphabet = "Nine";
                break;
            default:
                alphabet = "Out of ability";
                break;
        }
        System.out.println(alphabet);
    }
}

package introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Date_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysMonth;
        switch (month) {
            case 2:
                daysMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysMonth = "30";
                break;
            default:
                daysMonth = "";
                break;
        }
        if (!daysMonth.equals("")) {
            System.out.printf("The month '%d' has '%s' days!", month, daysMonth);
        } else {
            System.out.print("Invalid input!");
        }
    }
}

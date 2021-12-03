package ss3_java_array.thuc_hanh;

import java.util.Scanner;

public class NumberCountingApp {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng học viên: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Số lượng học viên không được quá 30!");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập số điểm cho học viên " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Dnh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lượng học viên qua môn là: " + count);
    }
}

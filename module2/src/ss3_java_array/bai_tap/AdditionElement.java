package ss3_java_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionElement {
    public static void main(String[] args) {
        int[] arr1;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        n = scanner.nextInt();
        arr1 = new int[n + 1];
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print("Nhập phần tử a[" + i + "]= ");
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử muốn chèn vào mảng: ");
        int nunber = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn vào mảng: ");
        int index = scanner.nextInt();
        if (index > -1 && index < arr1.length-1) {
            for (int j = arr1.length - 1; j > index; j--){
                arr1[j] = arr1[j - 1];
            }
            arr1[index] = nunber;
        }
        System.out.println(Arrays.toString(arr1));
    }
}

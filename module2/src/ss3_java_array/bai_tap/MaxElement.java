package ss3_java_array.bai_tap;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cột: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số hàng: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập arr[" + i + "]" + "[" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất trong mảng là: " + max);
    }
}

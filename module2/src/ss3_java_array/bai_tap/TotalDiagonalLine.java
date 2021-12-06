package ss3_java_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cột: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập arr[" + i + "]" + "[" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i][i];
        }
        System.out.println("Tổng số đường chéo trong ma trận là: " + total);
    }
}

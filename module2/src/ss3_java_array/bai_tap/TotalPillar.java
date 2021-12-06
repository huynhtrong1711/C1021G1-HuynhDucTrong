package ss3_java_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalPillar {
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
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int sum = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < sum; i++) {
            for (int j = 1; j < n; j++) {
                total += arr[i][j];
            }
        }

        System.out.println("Tổng phần tử ở " + sum + " cột là: " + total);
    }
}

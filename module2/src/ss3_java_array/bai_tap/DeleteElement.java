package ss3_java_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số bất kì: ");
        int number = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length;i++) {
            if (number == arr[i]) {
                index = i + 1;
                System.out.println(number + " đã có ở trong mảng. " + "Vi trí của nó trong mảng là: " + index);
                for (int j = i; j < arr.length - 1; j++) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

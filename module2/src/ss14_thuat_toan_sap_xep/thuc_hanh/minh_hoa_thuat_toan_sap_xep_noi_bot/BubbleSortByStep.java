package ss14_thuat_toan_sap_xep.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập " + array.length + " phần tử.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng của bạn là: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Xử lý mảng: ");
        bubbleSortByStep(array);

    }

    public static void bubbleSortByStep(int[] array) {
        boolean check = true;

        for (int i = 1; i < array.length && check; i++) {
            check = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    check = true;

                }
            }
            if (!check) {
                System.out.println("Mảng của bạn đã được sắp xếp.");
                break;
            }
            System.out.println("Mảng sau khi đc sắp xếp là: ");
            System.out.println(Arrays.toString(array));

        }
    }

}

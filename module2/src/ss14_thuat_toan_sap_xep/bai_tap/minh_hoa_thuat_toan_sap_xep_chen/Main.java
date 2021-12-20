package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cảu mảng: ");
        int size = scanner.nextInt();
        System.out.println("Nhập các phần tử vào mảng: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử a[" + i + "] : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Xử lý mảng: ");
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử a[" + i + "] là: " + array[i]);
        }

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > currentElement; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentElement;
        }
    }
}

package ss3_java_array.thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Mảng không được quá 20 phần tử!");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử vào mảng: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng là: " + max + " vị trí của nó trong mảng là: " + index);


    }
}

package ss15_xu_ly_ngoai_le_debug.thuc_hanh.su_dung_lop_arrayindexoutofboudsexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số của một phần tử: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là: " + array[index]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số không có ở trong mảng.");
        }

    }
}

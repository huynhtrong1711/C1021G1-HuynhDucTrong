package ss15_xu_ly_ngoai_le_debug.thuc_hanh.su_dung_lop_arrayindexoutofboudsexception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i] + " ");
        }
        return array;
    }

}

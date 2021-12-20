package ss14_thuat_toan_sap_xep.thuc_hanh.cai_dat_thuat_toan_sap_xep_noi_bot;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort (int[] array) {
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

        }
    }

    public static void main(String[] args) {
        int[] myArr = {8, 4, 9, 1, 7, 2};
        bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}

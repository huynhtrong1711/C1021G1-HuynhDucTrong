package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int index = i - 1;
            for (; index >= 0 && array[index] > currentElement; index--) {
                array[index + 1] = array[index];
            }
            array[index + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {9,1,3,7,6};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

}

package ss14_thuat_toan_sap_xep.thuc_hanh.cai_dat_thuat_toan_sap_xep_chon;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] array = {2, 5.3, 7, 1.6};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}

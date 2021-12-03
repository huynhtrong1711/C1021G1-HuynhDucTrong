package ss3_java_array.bai_tap;

import java.util.Arrays;

public class JoinArray {
    public static void main(String[] args) {
        int[] arr1 ={1, 4, 5, 7};
        int[] arr2 ={9, 3, 2, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int chen = 0;
        for (int result : arr1) {
            arr3[chen] = result;
            chen++;
        }
        for (int result : arr2) {
            arr3[chen] = result;
            chen++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}

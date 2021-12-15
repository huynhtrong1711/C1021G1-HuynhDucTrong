package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse {

    public static void main(String[] args) {
        Stack Object = new Stack();

        int[] arrays = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrays));

        for (int index = 0; index < arrays.length; index++) {
            Object.push(arrays[index]);
        }

        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = (int) Object.pop();
        }

        System.out.println(Arrays.toString(arrays));


    }

}

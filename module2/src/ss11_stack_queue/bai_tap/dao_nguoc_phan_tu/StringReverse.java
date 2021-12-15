package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        Stack Object = new Stack();

        String string = "Barcelona";
        System.out.println(string);

        int index = string.length();

        for (int i = 0; i < index; i++) {
            Object.push(string.charAt(i));
        }

        for (int i = 0; i < index; i++) {
            char str = (char) Object.pop();

        }
        System.out.println(string);

    }
}

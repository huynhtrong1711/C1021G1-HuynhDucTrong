package ss3_java_array.bai_tap;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {
        String name = "happy new year";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự bất kỳ: ");
        char characters = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (characters == name.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần suất hiện của ký tự " + characters + " trong chuỗi " + name + " là: " + count);
    }
}

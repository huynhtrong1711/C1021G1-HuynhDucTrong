package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String string = scanner.nextLine();

        LinkedList<Character> characterLinkedList = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new  LinkedList<>();
            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > characterLinkedList.size()) {
                characterLinkedList.clear();
                characterLinkedList.addAll(list);
            }
            list.clear();
        }
        for (Character character : characterLinkedList) {
            System.out.print(character);
        }
        System.out.println();
    }
}

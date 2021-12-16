package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = scanner.nextLine();

        Map<String, Integer> treeMap = new TreeMap<>();
        String character;

        for (int i = 0; i < string.length(); i++){
            character = String.valueOf(string.charAt(i));
            if (treeMap.containsKey(character)) {
                int newCharacter = treeMap.get(character);
                treeMap.put(character, newCharacter + 1);
            } else {
                treeMap.put(character,1);
            }
        }
        System.out.println(treeMap);
    }
}

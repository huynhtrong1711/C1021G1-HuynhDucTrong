package ss3_java_array.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] studens = {"Trọng", "Đạt", "Sơn", "Minh", "Linh", "Tín"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        boolean isName = false;
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(name)) {
                System.out.println("Vị trí của học viên " + name + " trong danh sách là: " + i);
                isName = true;
                break;
            }

        }
        if (!isName) {
            System.out.println("Không tìm thấy" + name + " trong danh sách.");
        }
    }

}

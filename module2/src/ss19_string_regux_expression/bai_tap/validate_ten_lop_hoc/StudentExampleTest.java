package ss19_string_regux_expression.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class StudentExampleTest {
    private static StudentExample studentExample;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        String nameStudent = scanner.nextLine();
        studentExample = new StudentExample();
        boolean valid = studentExample.checkClass(nameStudent);
        if (valid) {
            System.out.println("Tên lớp: " + nameStudent + " Hợp lệ.");
        } else {
            System.out.println("Tên lớp: " + nameStudent + " Không hợp lệ.");
        }
    }
}

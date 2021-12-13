package oop_mvc.bai2.controller;

import oop_mvc.bai2.service.IStudentService;
import oop_mvc.bai2.service.impt.TestStudent;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        IStudentService iStudentService =  new TestStudent();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Thêm học sinh mới. ");
            System.out.println("2. Xóa một học sinh theo mã số học sinh. ");
            System.out.println("3. Tìm kiếm một học sinh theo mã số học sinh. ");
            System.out.println("4. Sắp xếp danh sách theo mã số họ sinh. ");
            System.out.println("5. Hiển thị danh sách học viên. ");
            System.out.println("6. kết thúc. ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                    break;
                case 3:
                    iStudentService.searchStudent();
                    break;
                case 4:
                    iStudentService.sortStudent();
                    break;
                case 5:
                    iStudentService.getAll();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }while (true);
    }
}

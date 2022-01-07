package thi_thu.controller;

import thi_thu.service.IService;
import thi_thu.service.impl.StudentService;
import thi_thu.service.impl.TeacherService;

import java.util.Scanner;

public class PersonController {
    public static Scanner scanner = new Scanner(System.in);
    static int chose;
    static boolean checkChose;

    public static void displayMainMenu() {
        do {
            checkChose = false;
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Tìm kiếm giảng viên hoặc học sinh");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                     search();
                     break;
                case 5:
                    System.exit(0);
            }
        }while (checkChose);
    }

    public static void add() {
        IService addStudent = new StudentService();
        IService addTeacher = new TeacherService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Thêm mới giảng viên");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    addStudent.add();
                    checkChose = true;
                    continue;
                case 2:
                    addTeacher.add();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void remove() {
        IService removeStudent = new StudentService();
        IService removeTeacher = new TeacherService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Xóa học sinh ");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    removeStudent.remove();
                    checkChose = true;
                    continue;
                case 2:
                    removeTeacher.remove();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void display() {
        IService displayStudent = new StudentService();
        IService displayTeacher = new TeacherService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Hiển thị danh sách giảng viên");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    displayStudent.display();
                    checkChose = true;
                    continue;
                case 2:
                    displayTeacher.display();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void search() {
        IService searchStudent = new StudentService();
        IService searchTeacher = new TeacherService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Tìm kiếm học sinh");
            System.out.println("2. Tìm kiếm giảng viên");
            System.out.println("3. Trở về menu");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    searchStudent.search();
                    checkChose = true;
                    continue;
                case 2:
                    searchTeacher.search();
                    checkChose =true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

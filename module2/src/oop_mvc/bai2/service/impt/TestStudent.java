package oop_mvc.bai2.service.impt;

import oop_mvc.bai1.model.Candidate;
import oop_mvc.bai2.model.Student;
import oop_mvc.bai2.service.IStudentService;

import java.util.Arrays;
import java.util.Scanner;

public class TestStudent implements IStudentService {
    private Student[] students = new Student[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    @Override
    public void addStudent() {
        System.out.print("Nhập số lượng học viên cần thêm vào: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number + count <= 100) {
            for (int index = 0; index < number; index++) {
                System.out.print("Nhập mã số học sinh: ");
                String code = scanner.nextLine();
                System.out.print("Nhập họ và tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập ngày tháng năm sinh: ");
                String dateOb = scanner.nextLine();
                System.out.print("Nhập giới tính: ");
                String sex = scanner.nextLine();
                System.out.print("Nhập lớp: ");
                String studentName = scanner.nextLine();
                System.out.print("Nhập khóa học: ");
                double course = Double.parseDouble(scanner.nextLine());
                Student student = new Student(code, name, dateOb, sex, studentName, course);
                students[count] = student;
                count++;
            }
        }else {
            System.out.println("Danh sách đầy.");
        }
    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void searchStudent() {
        System.out.print("Nhập mã số học viên bạn muốn tìm: " );
        String codeStudent = scanner.nextLine();
        for ( int index = 0; index < students.length; index++){
            if (Arrays.asList(students).contains(codeStudent));
            System.out.println(students[index]);
            break;
        }

    }

    @Override
    public void sortStudent() {

    }

    @Override
    public void getAll() {
        for (Student student : students) {
            if (student == null) {
                break;
            } else {
                System.out.println(student);
            }
        }

    }
}

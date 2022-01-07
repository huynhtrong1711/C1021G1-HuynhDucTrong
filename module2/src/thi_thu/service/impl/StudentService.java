package thi_thu.service.impl;

import thi_thu.model.Student;
import thi_thu.service.IService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IService {
    public static final String FILE_STUDENT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\thi_thu\\data\\student.csv";
    public List<Student> studentList;
    public Scanner scanner = new Scanner(System.in);
    public StudentService() {
        studentList = readStudent();
    }

    public void writeStudent() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_STUDENT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getDateOfBirthday() +
                        "," + student.getSex() + "," + student.getStudentClass() + "," + student.getPoint());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readStudent() {
        List<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_STUDENT);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                student = new Student(temp[0], temp[1], temp[2],temp[3], temp[4],Double.parseDouble(temp[5]));
                students.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void add() {
        studentList.add(creatStudent());
        writeStudent();
    }

    @Override
    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void remove() {
        boolean check;
        boolean chose =false;
        int index = 0;
        System.out.println("Nhập id sinh viên bạn muốn xóa: ");
        String idRemove = scanner.nextLine();
        System.out.println("Bạn có chắc chắn muốn xóa sinh viên có id: " + idRemove + " này không?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Nhập lựa chọn: ");
        do {
            check = false;
            try {
                index = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng! Xin nhập lại: ");
                check = true;
            }
        }while (check);
        switch (index) {
            case 1:
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getId().equals(idRemove)) {
                        studentList.remove(i);
                        System.out.println("Danh sách sau khi bị xóa: ");
                        display();
                        writeStudent();
                        break;
                    }else {
                        chose = true;
                    }
                }
                if (chose){
                    System.out.println("Id sinh viên không tồn tại!");
                }
            case 2:
                break;
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên của học sinh bạn muốn tìm: ");
        String nameSearch = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getName().contains(nameSearch)) {
                System.out.println(student);
            }
        }
    }

    public Student creatStudent() {
        String inputId;
        String inputDOB;
        String inputSex;
        double inputPoint = 0;
        String regexId = "(SV)(-)[0-9]{4}";
        String regexSex = "^([A-Z])\\w+";
        String regexDateDOB = "[0-9]{1,2}/[0-9]{1,2}/(19|20)[0-9]{2}";
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã sinh viên(SV-XXXX): ");
            inputId = scanner.nextLine();
            if (!inputId.matches(regexId)) {
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        System.out.println("Nhập tên sinh viên: ");
        String inputName = scanner.nextLine();

        do {
            check = false;
            System.out.println("Nhập ngày tháng năm sinh: ");
            inputDOB = scanner.nextLine();
            if (!inputDOB.matches(regexDateDOB)) {
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập giới tính: ");
            inputSex = scanner.nextLine();
            if (!inputSex.matches(regexSex)) {
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        System.out.println("Nhập lớp của học sinh: ");
        String inputClass = scanner.nextLine();

        do {
            check = false;
            try {
                System.out.println("Nhập điểm của học sinh: ");
                inputPoint = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (inputPoint< 0) {
                check = true;
                System.out.println("Điểm số phải lớn hơn 0! Xin nhập lại: ");
            }
        }while (check);
        Student student = new Student(inputId, inputName,inputDOB,inputSex,inputClass,inputPoint);
        return student;
    }
}

package thi_thu.service.impl;

import thi_thu.model.Teacher;
import thi_thu.service.IService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IService {
    public static final String FILE_TEACHER = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\thi_thu\\data\\tearcher.csv";
    public List<Teacher> teacherList;
    public Scanner scanner = new Scanner(System.in);
    public TeacherService() {
        teacherList = readTeacher();
    }

    public void writeTeacher() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_TEACHER);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher : teacherList) {
                bufferedWriter.write(teacher.getId() + "," + teacher.getName() + "," + teacher.getDateOfBirthday() +
                        "," + teacher.getSex() + "," + teacher.getTechnique());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Teacher> readTeacher() {
        List<Teacher> teachers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_TEACHER);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Teacher teacher;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                teacher = new Teacher(temp[0], temp[1], temp[2],temp[3], temp[4]);
                teachers.add(teacher);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teachers;
    }

    @Override
    public void add() {
        teacherList.add(creatTeacher());
        writeTeacher();
    }

    @Override
    public void display() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void remove() {
        boolean check;
        boolean chose =false;
        int index = 0;
        System.out.println("Nhập id giảng viên bạn muốn xóa: ");
        String idRemove = scanner.nextLine();
        System.out.println("Bạn có chắc chắn muốn xóa giảng viên có id: " + idRemove + " này không?");
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
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getId().equals(idRemove)) {
                        teacherList.remove(i);
                        System.out.println("Danh sách sau khi bị xóa: ");
                        display();
                        writeTeacher();
                        break;
                    }else {
                        chose = true;
                    }
                }
                if (chose){
                    System.out.println("Id giảng viên không tồn tại!");
                }
            case 2:
                break;
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên học sinh bạn muốn xóa: ");
        String nameRemove = scanner.nextLine();
        for (Teacher teacher : teacherList) {
            if (teacher.getName().contains(nameRemove)) {
                System.out.println(teacher);
            }
        }
    }

    public Teacher creatTeacher() {
        String inputId;
        String inputName = null;
        String inputDOB;
        String inputSex;
        String inputTechnique = null;
        String regexId = "(GV)(-)[0-9]{4}";
        String regexSex = "^([A-Z])\\w+";
        String regexDateDOB = "[0-9]{1,2}/[0-9]{1,2}/(19|20)[0-9]{2}";
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã giảng viên(GV-XXXX): ");
            inputId = scanner.nextLine();
            if (!inputId.matches(regexId)) {
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập tên giảng viên: ");
                inputName = scanner.nextLine();
            }catch (NumberFormatException e) {
                check = true;
                System.out.println("Sai định dạng! Xin nhập lại: ");
            }
        }while (check);

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

        do {
            check = false;
            try {
                System.out.println("Nhập chuyên môn: ");
                inputTechnique = scanner.nextLine();
            }catch (NumberFormatException e) {
                check = true;
                System.out.println("Sai định dạng! Xin nhập lại: ");
            }
        }while (check);
        Teacher teacher = new Teacher(inputId, inputName,inputDOB,inputSex,inputTechnique);
        return teacher;
    }
}

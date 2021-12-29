package case_study.sevirce.impt;

import case_study.model.person.Employee;
import case_study.sevirce.IService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IService {
    public static final String FILE_PERSON = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\person.csv";
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public EmployeeService()
    {
        employees = readEmployee();
    }

    public  List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PERSON);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String temp[];
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                employee = new Employee(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3],Integer.parseInt(temp[4]), temp[5], temp[6], temp[7], temp[8], Integer.parseInt(temp[9]));
                employeeList.add(employee);

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public void writerEmployee() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PERSON);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                bufferedWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getDayOfBirthday()
                 + "," + employee.getSex() + "," + employee.getPassport() + "," + employee.getPhone() + "," + employee.getEmail()
                + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getWage());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    @Override
    public void displayList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    @Override
    public void addNew() {
        System.out.print("Nhập id nhân viên mới: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên nhân viên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirthday = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.print("Nhập CMND: ");
        int passport = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập trình độ(Trung cấp, Cao đẳng, Đại học và sau đại học) : ");
        String level = scanner.nextLine();
        System.out.print("Nhập vị trí làm việc: ");
        String quality = scanner.nextLine();
        System.out.print("Nhập lương: ");
        int wage = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(idEmployee, name, dateOfBirthday, sex, passport,phone, email, level, quality, wage);
        employees.add(employee);
        writerEmployee();

    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên bạn muốn sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < employees.size(); i++) {
            if (idEdit == employees.get(i).getId()) {
                System.out.print("Nhập tên nhân viên mới: ");
                String name = scanner.nextLine();
                System.out.print("Nhập ngày sinh: ");
                String dateOfBirthday = scanner.nextLine();
                System.out.print("Nhập giới tính: ");
                String sex = scanner.nextLine();
                System.out.print("Nhập CMND: ");
                int passport = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập số điện thoại: ");
                String phone = scanner.nextLine();
                System.out.print("Nhập email: ");
                String email = scanner.nextLine();
                System.out.print("Nhập trình độ(Trung cấp, Cao đẳng, Đại học và sau đại học) : ");
                String level = scanner.nextLine();
                System.out.print("Nhập vị trí làm việc: ");
                String quality = scanner.nextLine();
                System.out.print("Nhập lương: ");
                int wage = Integer.parseInt(scanner.nextLine());
                employees.get(i).setName(name);
                employees.get(i).setDayOfBirthday(dateOfBirthday);
                employees.get(i).setSex(sex);
                employees.get(i).setPassport(passport);
                employees.get(i).setPhone(phone);
                employees.get(i).setEmail(email);
                employees.get(i).setLevel(level);
                employees.get(i).setPosition(quality);
                employees.get(i).setWage(wage);
                check = true;
                break;
            }
            if (!check) {
                System.out.println("không có nhân viên bạn cần tìm");
            }
        }
    }
}

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
                employee = new Employee(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], Double.parseDouble(temp[9]));
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
        employees.add(creatEmployee());
        writerEmployee();

    }

    @Override
    public void edit() {
        Employee employee = null;
        System.out.println("Nhập id nhân viên bạn muốn sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < employees.size(); i++) {
            if (idEdit == employees.get(i).getId()) {
                employee = creatEmployee();
                employees.set(i,employee);
                check = true;
                break;
            }
            if (!check) {
                System.out.println("không có nhân viên bạn cần tìm");
            }
        }
    }

    public Employee creatEmployee() {
        String regexEmail = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String inputEmail;
        String regexPhone = "0[1-9][0-9]{8}";
        String inputNumberPhone;
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/(19|20)[0-9]{2}";
        String inputDate;
        String inputGender;
        String regexCardNumber = "2[0-9]{8}";
        String inputIndetityCardNumber;
        String inputQuatification;
        String inputPosition;
        boolean check;
        double inputSalary = 0;
        System.out.println("Nhập id nhân viên: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên nhân viên: ");
        String inputName = scanner.nextLine();

        do {
            check = false;
            System.out.println("Nhập ngày tháng năm sinh (DD/MM/YY): ");
            inputDate = scanner.nextLine();

            if(!inputDate.matches(regexDate)) {
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            String[] temp = inputDate.split("/");
            if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12){
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if(Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 || Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 ||
                    Integer.parseInt(temp[1]) == 8 || Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12 ){
                if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
                    check = true;
                    System.out.println("Không đúng định dạng! Xin nhập lại: ");
                    continue;
                }
            }else if(Integer.parseInt(temp[1]) == 2){
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0){
                    if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 29) {
                        check = true;
                        System.out.println("Không đúng định dạng! Xin nhập lại: ");
                        continue;
                    }
                }else {
                    if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
                        check = true;
                        System.out.println("Không đúng định dạng! Xin nhập lại: ");
                        continue;
                    }
                }

            }else if (Integer.parseInt(temp[1]) > 0 || Integer.parseInt(temp[1]) < 13){
                if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 30) {
                    check = true;
                    System.out.println("Không đúng định dạng! Xin nhập lại: ");
                    continue;
                }
            }else {
                check = true;
            }

        }while (check);

        do {
            check = true;
            System.out.println("Nhập giới tính ");
            inputGender = scanner.nextLine();
            if(inputGender.toLowerCase().equals("nam") || inputGender.toLowerCase().equals("nữ")){
                break;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập số CMND: ");
            inputIndetityCardNumber = scanner.nextLine();
            if(!inputIndetityCardNumber.matches(regexCardNumber)){
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }

        }while (check);


        do {check = false;
            System.out.println("Nhập số điện thoại: ");
            inputNumberPhone = scanner.nextLine();
            if(!inputNumberPhone.matches(regexPhone)) {
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại:: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập EMAIL: ");
            inputEmail = scanner.nextLine();
            if(!inputEmail.matches(regexEmail)){
                check = true;
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = true;
                System.out.println("Nhập trình độ học vấn: Đại học, Cao đẳng, Trung cấp, Tiến sĩ, Giáo sư");
            inputQuatification = scanner.nextLine();
            if(inputQuatification.toLowerCase().equals("đại học") || inputQuatification.toLowerCase().equals("cao đẳng") ||
                    inputQuatification.toLowerCase().equals("trung cấp") || inputQuatification.toLowerCase().equals("tiến sĩ") ||
                    inputQuatification.toLowerCase().equals("giáo sư")) {
                break;
            }
        }while (check);

        do{
            check = true;
                System.out.println("Nhập chức vụ: Lễ tân, Phục vụ, Giám sát, Quản lý, Giám đốc ");
            inputPosition = scanner.nextLine();
            List<String> employee = new ArrayList<>();
            employee.add("lễ tân");
            employee.add("phục vụ");
            employee.add("giám sát");
            employee.add("quản lý");
            employee.add("giám đốc");
            for(String employees: employee){
                if (inputPosition.toLowerCase().equals(employees)) {
                    check = false;
                    break;
                }
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập lương: ");
                inputSalary = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                check = true;
            }
        }while (check);
        Employee employee = new Employee(idEmployee, inputName, inputDate, inputGender, inputIndetityCardNumber,
                inputNumberPhone, inputEmail, inputQuatification, inputPosition, inputSalary);
        return employee;
    }
}

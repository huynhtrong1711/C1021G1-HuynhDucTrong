package case_study.sevirce.impt;

import case_study.model.person.Customer;
import case_study.sevirce.IService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerService implements IService {
    private static final String FILE_CUSTOMER = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\customer.csv";
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    public CustomerService() {
        customerList = readCustomer();
    }

    public List<Customer> readCustomer() {
        List<Customer> customers = new LinkedList<>();
        try {
            FileReader fileReader = new FileReader(FILE_CUSTOMER);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String temp[];
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[6], temp[7], temp[8], temp[9]);
                customers.add(customer);

            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public void writerCustomer() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_CUSTOMER);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getDayOfBirthday() + "," +
                        customer.getSex() + "," + customer.getPassport() + "," + customer.getPhone() + "," + customer.getEmail() +
                        customer.getClassCustomer() + "," + customer.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void displayList() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    @Override
    public void addNew() {
        System.out.print("Nhập id khách hàng: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên khách hàng: ");
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
        System.out.print("Nhập cấp độ(Diamond, Platinium, Gold, Silver, Member) : ");
        String level = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfBirthday, sex, passport, phone, email, level, address);
        customerList.add(customer);
        writerCustomer();



    }

    @Override
    public void edit() {
        System.out.println("Nhập id khách hàng bạn muốn chỉnh sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (idEdit == customerList.get(i).getId()) {
                System.out.print("Nhập tên khách hàng: ");
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
                System.out.print("Nhập cấp độ(Diamond, Platinium, Gold, Silver, Member) : ");
                String level = scanner.nextLine();
                System.out.print("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                customerList.get(i).setName(name);
                customerList.get(i).setDayOfBirthday(dateOfBirthday);
                customerList.get(i).setSex(sex);
                customerList.get(i).setPassport(passport);
                customerList.get(i).setPhone(phone);
                customerList.get(i).setEmail(email);
                customerList.get(i).setClassCustomer(level);
                customerList.get(i).setAddress(address);
                check = true;
                break;

            }

            if (!check) {
                System.out.println("không có khách hàng bạn cần tìm");
            }

        }

    }
}
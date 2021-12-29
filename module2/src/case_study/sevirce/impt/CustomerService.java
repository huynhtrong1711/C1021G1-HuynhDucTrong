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
                customer = new Customer(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[6], temp[7], temp[8], temp[9]);
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
        customerList.add(creatCustomer());
        writerCustomer();



    }

    @Override
    public void edit() {
        Customer customer = null;
        System.out.println("Nhập id khách hàng bạn muốn chỉnh sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (idEdit == customerList.get(i).getId()) {
                customer = creatCustomer();
                customerList.set(i, customer);
                check = true;
                break;

            }

            if (!check) {
                System.out.println("không có khách hàng bạn cần tìm");
            }

        }

    }

    public Customer creatCustomer() {
        String regexEmail = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String inputEmail;
        String regexPhone = "0[397][0378][0-9]{7}";
        String inputNumberPhone;
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/(20|19)[0-9]{2}";
        String inputDate;
        String inputGender;
        String regexCardNumber = "2[0-9]{8}";
        String inputIndetityCardNumber;
        String inputCustomerType;
        String inputAddress;
        boolean check;

        System.out.println("Nhập id khách hàng: ");
        int idCustomer = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên khách hàng: ");
        String inputName = scanner.nextLine();

        do {
            check = false;
            System.out.println("Nhập ngày tháng năm sinh (DD/MM/YY): ");
            inputDate = scanner.nextLine();

            if(!inputDate.matches(regexDate)) {
                check = true;
                System.out.println("Không định dạng! Xin nhập lại: ");
                continue;
            }
            String[] temp = inputDate.split("/");
            if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12){
                check = true;
                System.out.println("Không định dạng! Xin nhập lại: ");
                continue;
            }
            if(Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 || Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 ||
                    Integer.parseInt(temp[1]) == 8 || Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12 ){
                if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
                    check = true;
                    System.out.println("Không định dạng! Xin nhập lại: ");
                    continue;
                }
            }else if(Integer.parseInt(temp[1]) == 2){
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0){
                    if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 29) {
                        check = true;
                        System.out.println("Không định dạng! Xin nhập lại: ");
                        continue;
                    }
                }else {
                    if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
                        check = true;
                        System.out.println("Không định dạng! Xin nhập lại: ");
                        continue;
                    }
                }

            }else if (Integer.parseInt(temp[1]) > 0 || Integer.parseInt(temp[1]) < 13){
                if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 30) {
                    check = true;
                    continue;
                }
            }else {
                check = true;
            }

        }while (check);

        do {
            check = true;
            System.out.println("Nhập giới tính: ");
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
                System.out.println("Không định dạng! Xin nhập lại: ");
                continue;
            }

        }while (check);


        do {check = false;
            System.out.println("Nhập số điện thoại: ");
            inputNumberPhone = scanner.nextLine();
            if(!inputNumberPhone.matches(regexPhone)) {
                check = true;
                System.out.println("Không định dạng! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập email: ");
            inputEmail = scanner.nextLine();
            if(!inputEmail.matches(regexEmail)){
                check = true;
                System.out.println("Không định dạng! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = true;
            System.out.println("Nhập cấp độ khách hàng: DIAMOND, PLATINIUM, GOLD, SILVER  ");
            inputCustomerType = scanner.nextLine();
            if(inputCustomerType.toLowerCase().equals("diamond") || inputCustomerType.toLowerCase().equals("platinium") ||
                    inputCustomerType.toLowerCase().equals("gold") || inputCustomerType.toLowerCase().equals("silver")) {
                break;
            }
        }while (check);

        System.out.println("Nhập địa chỉ: ");
        inputAddress = scanner.nextLine();

        Customer customer = new Customer(idCustomer, inputName, inputDate, inputGender, inputIndetityCardNumber,
                inputNumberPhone, inputEmail, inputCustomerType, inputAddress);
        return customer;

    }
}
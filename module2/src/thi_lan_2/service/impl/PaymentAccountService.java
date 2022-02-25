package thi_lan_2.service.impl;

import thi_lan_2.model.PaymentAccount;
import thi_lan_2.service.IBankService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentAccountService implements IBankService {
    public static final String FILE_PAYMENT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\thi_lan_2\\data\\paymentAccount.csv";
    public Scanner scanner = new Scanner(System.in);
    public List<PaymentAccount> paymentAccountList;

    public PaymentAccountService() {
        paymentAccountList = readBankPayment();
    }
    public void writeBankPayment() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PAYMENT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PaymentAccount paymentAccount : paymentAccountList) {
                bufferedWriter.write(paymentAccount.getId() + "," + paymentAccount.getCodeAccount() + "," + paymentAccount.getName() +
                        "," + paymentAccount.getDateCreated() + "," + paymentAccount.getCardNumber() + "," + paymentAccount.getMoney());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<PaymentAccount> readBankPayment() {
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PAYMENT);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            PaymentAccount paymentAccount;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                paymentAccount = new PaymentAccount(temp[1],temp[2], temp[3], Integer.parseInt(temp[4]), Integer.parseInt(temp[5]));
                paymentAccount.setId(Integer.parseInt(temp[0]));
                paymentAccountList.add(paymentAccount);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paymentAccountList;
    }
    @Override
    public void add() {
        paymentAccountList.add(creatPaymentAccount());
        writeBankPayment();
    }

    @Override
    public void display() {
        for (PaymentAccount paymentAccount : paymentAccountList) {
            System.out.println(paymentAccount);
        }
    }

    @Override
    public void remove() {
        boolean check;
        boolean chose = false;
        int index = 0;
        System.out.println("Nhập mã tài khoản ngân hàng bạn muốn xóa: ");
        String idRemove = scanner.nextLine();
        System.out.println("Bạn có chắc chắn muốn xóa tài khoản có mã: " + idRemove + " này không?");
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
                for (int i = 0; i < paymentAccountList.size(); i++) {
                    if (paymentAccountList.get(i).getCodeAccount().equals(idRemove)) {
                        paymentAccountList.remove(i);
                        System.out.println("Danh sách sau khi bị xóa: ");
                        display();
                        writeBankPayment();
                        break;
                    }else {
                        chose = true;
                    }
                }
                if (chose){
                    System.out.println("Mã tài khoản ngân hàng không tồn tại!");
                }
            case 2:
                break;
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên chủ tài khoản bạn muốn tìm kiếm: ");
        String nameBank = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < paymentAccountList.size(); i++) {
            if (nameBank.equals(paymentAccountList.get(i).getName())) {
                System.out.println(paymentAccountList.get(i)+ " là tài khoản bạn cần tìm.");
                check = true;
                break;
            }
        } if (!check){
            System.out.println("không có tài khoản bạn cần tìm.");
        }
    }

    public PaymentAccount creatPaymentAccount() {
        String regexCode = "(TKTT)(-)[0-9]{5}";
        String inputCode;
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/(19|20)[0-9]{2}";
        String inputDate;
        int money = 0;
        int cardNumber = 0;
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã tài khoản thanh toán(TKTT-XXXXX): ");
            inputCode = scanner.nextLine();
            if (!inputCode.matches(regexCode)){
                check = true;
                System.out.println("Nhập không đúng định dạng xin nhập lại");
            }
        }while (check);

        System.out.println("Nhập tên chủ tài khoản: ");
        String name = scanner.nextLine();

        do {
            check = false;
            System.out.println("Nhập ngày tạo tài khoản thanh toán: ");
            inputDate = scanner.nextLine();
            if (!inputDate.matches(regexDate)) {
                check = true;
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập số thẻ: ");
                 cardNumber = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (cardNumber <= 0) {
                check = true;
                System.out.println("Số thẻ phải là số dương! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập số tiền trong tài khoản: ");
                money = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (money <= 0) {
                check = true;
                System.out.println("Số tiền trong tài khoản phải là số dương! Xin nhập lại: ");
            }
        }while (check);
        PaymentAccount paymentAccount = new PaymentAccount(inputCode,name,inputDate,cardNumber,money);
        return paymentAccount;

    }
}

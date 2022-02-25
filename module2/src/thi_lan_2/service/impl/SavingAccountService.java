package thi_lan_2.service.impl;

import thi_lan_2.model.SavingAccount;
import thi_lan_2.service.IBankService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingAccountService implements IBankService {
    public static final String FILE_SAVING = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\thi_lan_2\\data\\savingAccount.csv";
    public List<SavingAccount> savingAccountList;
    public Scanner scanner = new Scanner(System.in);

    public SavingAccountService() {
        savingAccountList = readBank();
    }

    public void writeBank() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_SAVING);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SavingAccount savingAccount : savingAccountList) {
                bufferedWriter.write(savingAccount.getId() + "," + savingAccount.getCodeAccount() + "," + savingAccount.getName() +
                        "," + savingAccount.getDateCreated() + "," + savingAccount.getSavedMoney() + "," + savingAccount.getDateSent() +
                        "," + savingAccount.getInterestRate() + "," + savingAccount.getPeriod());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<SavingAccount> readBank() {
        List<SavingAccount> savingAccountList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_SAVING);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            SavingAccount savingAccount;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                savingAccount = new SavingAccount(temp[1],temp[2], temp[3], Double.parseDouble(temp[4]), temp[5],
                        Double.parseDouble(temp[6]), Integer.parseInt(temp[7]));
                savingAccount.setId(Integer.parseInt(temp[0]));
                savingAccountList.add(savingAccount);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return savingAccountList;
    }

    @Override
    public void add() {
        savingAccountList.add(creatAccount());
        writeBank();
    }

    @Override
    public void display() {
        for (SavingAccount savingAccount : savingAccountList) {
            System.out.println(savingAccount);
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
                for (int i = 0; i < savingAccountList.size(); i++) {
                    if (savingAccountList.get(i).getCodeAccount().equals(idRemove)) {
                        savingAccountList.remove(i);
                        System.out.println("Danh sách sau khi bị xóa: ");
                        display();
                        writeBank();
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
        for (int i = 0; i < savingAccountList.size(); i++) {
            if (nameBank.equals(savingAccountList.get(i).getName())) {
                System.out.println(savingAccountList.get(i)+ " là tài khoản bạn cần tìm.");
                check = true;
                break;
            }
        } if (!check){
            System.out.println("không có tài khoản bạn cần tìm.");
        }
    }

    public SavingAccount creatAccount() {
        String regexCode = "(TKTK)(-)[0-9]{5}";
        String inputCode;
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/(19|20)[0-9]{2}";
        String inputDate;
        double money = 0;
        String sentDate;
        double interestRate = 0;
        int period = 0;
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã tài khoản tiết kiệm(TKTK-XXXXX): ");
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
            System.out.println("Nhập ngày tạo tài khoản tiết kiệm: ");
            inputDate = scanner.nextLine();
            if (!inputDate.matches(regexDate)) {
                check = true;
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập số tiền gửi tiết kiệm: ");
                money = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (money <= 0) {
                check = true;
                System.out.println("Số tiền gửi tiết kiệm phải là số dương! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập ngày gửi tiết kiệm: ");
            sentDate = scanner.nextLine();
            if (!sentDate.matches(regexDate)) {
                check = true;
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập lãi suất: ");
                interestRate = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                check= true;
                continue;
            }
            if (interestRate <= 0) {
                check = true;
                System.out.println("Lãi suất phải lớn hơn 0! Xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập kì hạn(số tháng): ");
                period = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (period <= 0) {
                check = true;
                System.out.println("kì hạn phải từ 1 tháng trở lên! Xin nhập lại: ");
            }
        }while (check);
        SavingAccount savingAccount = new SavingAccount(inputCode,name,inputDate,money,sentDate,interestRate,period);
        return savingAccount;
    }
}

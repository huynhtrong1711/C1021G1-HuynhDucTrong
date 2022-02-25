package thi_lan_2.controller;

import thi_lan_2.service.IBankService;
import thi_lan_2.service.impl.PaymentAccountService;
import thi_lan_2.service.impl.SavingAccountService;

import java.util.Scanner;

public class BankController {
    public static Scanner scanner = new Scanner(System.in);
    static int chose;
    static boolean checkChose;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            checkChose = false;
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG--");
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
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
                    addBank();
                    break;
                case 2:
                    removeBank();
                    break;
                case 3:
                    displayBank();
                    break;
                case 4:
                    searchBank();
                    break;
                case 5:
                    System.exit(0);
            }
        }while (checkChose);
    }

    public static void addBank(){
        IBankService addBankSaving = new SavingAccountService();
        IBankService addBankPayment = new PaymentAccountService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Thêm mới tài khoản tiết kiệm");
            System.out.println("2. Thêm mới tài khoản thanh toán");
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
                    addBankSaving.add();
                    checkChose = true;
                    continue;
                case 2:
                    addBankPayment.add();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void displayBank(){
        IBankService displayBankSaving = new SavingAccountService();
        IBankService displayBankPayment = new PaymentAccountService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Hiển thị tài khoản tiết kiệm");
            System.out.println("2. Hiển thị tài khoản thanh toán");
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
                    displayBankSaving.display();
                    checkChose = true;
                    continue;
                case 2:
                    displayBankPayment.display();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void removeBank() {
        IBankService removeBankSaving = new SavingAccountService();
        IBankService removeBankPayment = new PaymentAccountService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Xóa tài khoản tiết kiệm");
            System.out.println("2. Xóa tài khoản thanh toán");
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
                    removeBankSaving.remove();
                    checkChose = true;
                    continue;
                case 2:
                    removeBankPayment.remove();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }

    public static void searchBank() {
        IBankService searchBankSaving = new SavingAccountService();
        IBankService searchBankPayment = new PaymentAccountService();
        do {
            checkChose = false;
            System.out.println("Chọn chức năng theo số(để tiếp tục): ");
            System.out.println("1. Tìm kiếm tài khoản tiết kiệm");
            System.out.println("2. Tìm kiếm tài khoản thanh toán");
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
                    searchBankSaving.search();
                    checkChose = true;
                    continue;
                case 2:
                    searchBankPayment.search();
                    checkChose = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
            }
        }while (checkChose);
    }
}

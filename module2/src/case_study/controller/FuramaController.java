package case_study.controller;

import case_study.sevirce.*;
import case_study.sevirce.impt.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {
    static int chose;
    static boolean checkChose;
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            checkChose = false;
            System.out.println(" MENU ");
            System.out.println("1. Employee Management. ");
            System.out.println("2. Customer Management. ");
            System.out.println("3. Facility Management. ");
            System.out.println("4. Booking Management. ");
            System.out.println("5. Promotion Management. ");
            System.out.println("6. Exit. ");
            try {
               chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                   customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (checkChose);
    }

    private static void employeeManagement() {
        EmployeeService iEmployeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        do {
            checkChose = false;
            System.out.println("1. Display list employee. ");
            System.out.println("2. Add new employee. ");
            System.out.println("3. Edit employee. ");
            System.out.println("4. Return main menu. ");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    iEmployeeService.displayList();
                    checkChose = true;
                    continue;
                case 2:
                    iEmployeeService.addNew();
                    checkChose = true;
                    continue;
                case 3:
                    iEmployeeService.edit();
                    checkChose = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (checkChose);
    }

    private static void customerManagement() {
        IService iCustomerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        do {
            checkChose = false;
            System.out.println("1. Display list customer. ");
            System.out.println("2. Add new customer. ");
            System.out.println("3. Edit customer. ");
            System.out.println("4. Return main menu. ");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    iCustomerService.displayList();
                    checkChose = true;
                    continue;
                case 2:
                    iCustomerService.addNew();
                    checkChose = true;
                    continue;
                case 3:
                    iCustomerService.edit();
                    checkChose = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (checkChose);
    }

    private static void facilityManagement() {
        IFacilityService iFacilityService = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {
            checkChose = false;
            System.out.println("1. Display list facility. ");
            System.out.println("2. Add new facility. ");
            System.out.println("3. Display list facility maintenance. ");
            System.out.println("4. Return main menu. ");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                checkChose = true;
                continue;
            }
            switch (chose) {
                case 1:
                    do {
                        checkChose = false;
                        System.out.println("1. Display Villa.");
                        System.out.println("2. Display House.");
                        System.out.println("3. Display Room.");
                        System.out.println("4. Back To Menu.");
                        try {
                            chose = Integer.parseInt(scanner.nextLine());
                        }catch (NumberFormatException e) {
                            System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                            checkChose = true;
                            continue;
                        }
                        switch (chose) {
                            case 1:
                                iFacilityService.displayVilla();
                                break;
                            case 2:
                                iFacilityService.displayHouse();
                                break;
                            case 3:
                                iFacilityService.displayRoom();
                                break;
                            case 4:
                                facilityManagement();
                                break;
                        }
                    }while (checkChose);
                    checkChose = true;
                    continue;
                case 2:
                    do {
                        checkChose = false;
                        System.out.println("1. Add New Villa.");
                        System.out.println("2. Add New House.");
                        System.out.println("3. Add New Room.");
                        System.out.println("4. Back To Menu.");
                        try {
                            chose = Integer.parseInt(scanner.nextLine());
                        }catch (NumberFormatException e) {
                            System.out.println("Nhập không đúng định dạng! Xin nhập lại: ");
                            checkChose = true;
                            continue;
                        }
                        switch (chose) {
                            case 1:
                                iFacilityService.addVilla();
                                break;
                            case 2:
                                iFacilityService.addHouse();
                                break;
                            case 3:
                                iFacilityService.addRoom();
                                break;
                            case 4:
                                facilityManagement();
                                break;
                        }
                    }while (checkChose);
                    checkChose = true;
                    continue;
                case 3:
                    iFacilityService.edit();
                    checkChose = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (checkChose);
    }

    private static void bookingManagement() {
        IBookingService iBookingService = new BookingService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add new booking. ");
            System.out.println("2. Display list booking. ");
            System.out.println("3. Create new contracts. ");
            System.out.println("4. Booking Management. ");
            System.out.println("5. Edit booking. ");
            System.out.println("6. Return main menu. ");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    iBookingService.addNew();
                    break;
                case 2:
                    iBookingService.displayList();
                    break;
                case 3:
                    iBookingService.createNew();
                    break;
                case 4:
                    iBookingService.bookingManagement();
                    break;
                case 5:
                    iBookingService.editBooking();
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    private static void promotionManagement() {
        IContractsService iContractsService = new ContractsService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Display list customers use service. ");
            System.out.println("2. Display list customers get voucher. ");
            System.out.println("3. Return main menu. ");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    iContractsService.displayListService();
                    break;
                case 2:
                    iContractsService.displayListVoucher();
                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

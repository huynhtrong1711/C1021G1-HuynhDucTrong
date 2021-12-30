package case_study.sevirce.impt;

import case_study.model.facility.Facility;
import case_study.sevirce.IFacilityService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final String FILE_VILA = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\villa.csv";
    private static final String FILE_HOUSE = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\house.csv";
    private static final String FILE_ROOM = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\room.csv";
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Scanner scanner = new Scanner(System.in);


//    public Map<Facility, Integer> readFacility() {
//
//
//    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {

    }

    public void addVilla() {
        String regexIdFacility = "^(SVVL)(-)[0-9]{4}$";
        String regexServiceName = "^[A-Z][a-z]$";
        String regexRentType = "^[A-Z][a-z]$";
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã dịch vụ: ");
            String inputIdFacility = scanner.nextLine();
            if (!inputIdFacility.matches(regexIdFacility)) {
                check = true;
                System.out.println("Không đúng định dạng mã dịch vụ! Xin nhập lại: ");
                continue;
            }

        }while (check);
        do {
            check = false;
            System.out.println("Nhập tên dịch vụ: ");
            String inputServiceName = scanner.nextLine();
            if (!inputServiceName.matches(regexServiceName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }

        }while (check);

        do {
            check =false;
            System.out.println("Nhập diện tích sử dụng: ");
            int acreage = Integer.parseInt(scanner.nextLine());
            if (acreage < 30) {
                check = true;
                System.out.println("Diện tích dịch vụ phải lớn hơn 30! Xin nhập lại diện tích sử dụng: ");
                continue;
            }

        }while (check);

        do {
            check = false;
            System.out.println("Nhập chi phí thuê: ");
            int cost = Integer.parseInt(scanner.nextLine());
            if (cost < 0) {
                check = true;
                System.out.println("Chi phí thuê phải là một số dương! Xin nhập lại: ");
                continue;
            }

        }while (check);

        do {
            check = false;
            System.out.println("Nhập số lượng người: ");
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            if (numberOfPeople < 0 || numberOfPeople > 20) {
                check = true;
                System.out.println("Số lượng người phải lớn hơn 0 hoặc nhỏ hơn 20! Xin nhập lại: ");
                continue;

            }

        }while (check);

        do {


        }while (check);



    }

    public void addHouse() {

    }

    public void addRoom() {

    }
}

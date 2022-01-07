package case_study.sevirce.impt;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.sevirce.IFacilityService;

import java.io.*;
import java.util.*;

public class FacilityService implements IFacilityService {
    private static final String FILE_VILA = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\villa.csv";
    private static final String FILE_HOUSE = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\house.csv";
    private static final String FILE_ROOM = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\case_study\\data\\room.csv";
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Scanner scanner = new Scanner(System.in);
    String regexName = "^([A-Z])\\w+";
    String inputId;
    String inputName;
    int acreage;
    int cost;
    int numberOfPeople;
    String standard;
    int floor;
    String rentType;
    static boolean check;

    @Override
    public void edit() {
    }

    @Override
    public void display() {
    }

    public void addVilla() {
        String regexIdVilla = "^(SVVL)(-)[0-9]{4}$";
        int areaPool;
        do {
            check = false;
            System.out.println("Nhập mã dịch vụ: ");
            inputId = scanner.nextLine();
            if (!inputId.matches(regexIdVilla)) {
                check = true;
                System.out.println("Không đúng định dạng mã dịch vụ! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập tên dịch vụ: ");
            inputName = scanner.nextLine();
            if (!inputName.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check =false;
            System.out.println("Nhập diện tích sử dụng: ");
            acreage = Integer.parseInt(scanner.nextLine());
            if (acreage < 30) {
                check = true;
                System.out.println("Diện tích dịch vụ phải lớn hơn 30! Xin nhập lại diện tích sử dụng: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập chi phí thuê: ");
            cost = Integer.parseInt(scanner.nextLine());
            if (cost < 0) {
                check = true;
                System.out.println("Chi phí thuê phải là một số dương! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập số lượng người: ");
            numberOfPeople = Integer.parseInt(scanner.nextLine());
            if (numberOfPeople < 0 || numberOfPeople > 20) {
                check = true;
                System.out.println("Số lượng người phải lớn hơn 0 hoặc nhỏ hơn 20! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập kiểu thuê (Năm, Tháng, Ngày, Giờ): ");
            rentType = scanner.nextLine();
            if (!rentType.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập tiêu chuẩn(Vip, Normal): ");
            standard = scanner.nextLine();
            if (!standard.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập số tầng: ");
            floor = Integer.parseInt(scanner.nextLine());
            if (floor < 0) {
                check = true;
                System.out.println("Số tần phải lớn hơn 0! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập diện tích hồ bơi: ");
            areaPool = Integer.parseInt(scanner.nextLine());
            if (areaPool < 30) {
                check = true;
                System.out.println("Diện tích hồ bơi phải lớn hơn 30! Xin nhập lại: ");
                continue;
            }
        }while (check);
        Villa villa = new Villa(inputId, inputName, acreage, cost, numberOfPeople, rentType, standard, floor, areaPool);
        facilityIntegerMap.put(villa, 0);
        writeVilla();
    }

    public void addHouse() {
        String regexIdHO = "^(SVHO)(-)[0-9]{4}$";
        do {
            check = false;
            System.out.println("Nhập mã dịch vụ: ");
            inputId = scanner.nextLine();
            if (!inputId.matches(regexIdHO)) {
                check = true;
                System.out.println("Không đúng định dạng mã dịch vụ! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập tên dịch vụ: ");
            inputName = scanner.nextLine();
            if (!inputName.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check =false;
            System.out.println("Nhập diện tích sử dụng: ");
            acreage = Integer.parseInt(scanner.nextLine());
            if (acreage < 30) {
                check = true;
                System.out.println("Diện tích dịch vụ phải lớn hơn 30! Xin nhập lại diện tích sử dụng: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập chi phí thuê: ");
            cost = Integer.parseInt(scanner.nextLine());
            if (cost < 0) {
                check = true;
                System.out.println("Chi phí thuê phải là một số dương! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập số lượng người: ");
            numberOfPeople = Integer.parseInt(scanner.nextLine());
            if (numberOfPeople < 0 || numberOfPeople > 20) {
                check = true;
                System.out.println("Số lượng người phải lớn hơn 0 hoặc nhỏ hơn 20! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập kiểu thuê(năm, tháng, ngày, giờ): ");
            rentType = scanner.nextLine();
            if (!rentType.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check = true;
            System.out.println("Nhập tiêu chuẩn: ");
            standard = scanner.nextLine();
            if (!standard.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập số tầng: ");
            floor = Integer.parseInt(scanner.nextLine());
            if (floor < 0) {
                check = true;
                System.out.println("Số tần phải lớn hơn 0! Xin nhập lại: ");
                continue;
            }
        }while (check);
        House house = new House(inputId, inputName, acreage, cost, numberOfPeople, rentType, standard, floor);
        facilityIntegerMap.put(house, 0);
        writeHouse();
    }

    public void addRoom() {
        String regexIdRoom = "^(SVRO)(-)[0-9]{4}$";
        String freeService = null;
        do {
            check = false;
            System.out.println("Nhập mã dịch vụ: ");
            inputId = scanner.nextLine();
            if (!inputId.matches(regexIdRoom)) {
                check = true;
                System.out.println("Không đúng định dạng mã dịch vụ! Xin nhập lại: ");
                continue;
            }
        }while (check);
        do {
            check = false;
            System.out.println("Nhập tên dịch vụ: ");
            inputName= scanner.nextLine();
            if (!inputName.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check =false;
            System.out.println("Nhập diện tích sử dụng: ");
            acreage = Integer.parseInt(scanner.nextLine());
            if (acreage < 30) {
                check = true;
                System.out.println("Diện tích dịch vụ phải lớn hơn 30! Xin nhập lại diện tích sử dụng: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập chi phí thuê: ");
            cost = Integer.parseInt(scanner.nextLine());
            if (cost < 0) {
                check = true;
                System.out.println("Chi phí thuê phải là một số dương! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập số lượng người: ");
            numberOfPeople = Integer.parseInt(scanner.nextLine());
            if (numberOfPeople < 0 || numberOfPeople > 20) {
                check = true;
                System.out.println("Số lượng người phải lớn hơn 0 hoặc nhỏ hơn 20! Xin nhập lại: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Nhập kiểu thuê (year, month, date, hour): ");
            rentType = scanner.nextLine();
            if (!rentType.matches(regexName)) {
                check = true;
                System.out.println("Không đúng định dạng tên dịch vụ! Xin nhập lại:");
                continue;
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập dịch phụ miễn phí đi cùng: ");
                freeService = scanner.nextLine();
            }catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng định dạng! Xin nhập lại: ");
                check = true;
            }
        }while (check);
        Room room = new Room(inputId, inputName, acreage, cost, numberOfPeople, rentType, freeService);
        facilityIntegerMap.put(room, 0);
        writeRoom();
    }

    @Override
    public void displayVilla() {
        for (Map.Entry<Facility, Integer> integerEntry : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + integerEntry.getKey() + " , số lần đã thuê: " + integerEntry.getValue());
        }
    }

    @Override
    public void displayHouse() {
        for (Map.Entry<Facility, Integer> integerEntry : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + integerEntry.getKey() + " , số lần đã thuê: " + integerEntry.getValue());
        }
    }

    @Override
    public void displayRoom() {
        for (Map.Entry<Facility, Integer> integerEntry : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + integerEntry.getKey() + " , số lần đã thuê: " + integerEntry.getValue());
        }
    }

    public static Map<Facility,Integer> readVilla() {
        Map<Facility,Integer> villaIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(FILE_VILA);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Villa villa = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]),
                        Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]), Integer.parseInt(temp[8]));
                villaIntegerMap.put(villa, 1);
            }
            if (villa != null) {
                villaIntegerMap.put(villa, 1);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerMap;
    }

    public static Map<Facility,Integer> readHouse() {
        Map<Facility,Integer> houseIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(FILE_HOUSE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            House house = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]),
                        Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                houseIntegerMap.put(house, 1);
            }
            if (house != null) {
                houseIntegerMap.put(house, 1);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseIntegerMap;
    }
    public static Map<Facility,Integer> readRoom() {
        Map<Facility,Integer> roomIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(FILE_ROOM);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Room room = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]),
                        Integer.parseInt(temp[4]), temp[5], temp[6]);
                roomIntegerMap.put(room, 1);
            }
            if (room != null) {
                roomIntegerMap.put(room, 1);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomIntegerMap;
    }

    public void writeVilla() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        try {
            FileWriter fileWriter = new FileWriter(FILE_VILA);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().getIdFacility() + "," + entry.getKey().getServiceName() + "," +
                        entry.getKey().getAcreage() + "," + entry.getKey().getCost() + "," + entry.getKey().getNumberOfPeople() +
                        "," + entry.getKey().getRentType() + "," + entry.getKey().getQuality() + "," + entry.getKey().getFloor() +
                        "," + entry.getKey().getPoolArea());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHouse() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        try {
            FileWriter fileWriter = new FileWriter(FILE_HOUSE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House, Integer> entry : houseIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().getIdFacility() + "," + entry.getKey().getServiceName() + "," +
                        entry.getKey().getAcreage() + "," + entry.getKey().getCost() + "," + entry.getKey().getNumberOfPeople() +
                        "," + entry.getKey().getRentType() + "," + entry.getKey().getQuality() + "," + entry.getKey().getFloor());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRoom() {
        Map<Room, Integer> roomIntegerMap= new LinkedHashMap<>();
        try {
            FileWriter fileWriter = new FileWriter(FILE_HOUSE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().getIdFacility() + "," + entry.getKey().getServiceName() + "," +
                        entry.getKey().getAcreage() + "," + entry.getKey().getCost() + "," + entry.getKey().getNumberOfPeople() +
                        "," + entry.getKey().getRentType() + "," + entry.getKey().getFreeService());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void readHashMap() {
//        for (Map.Entry<Facility, Integer> entry : readVilla().entrySet()) {
//            facilityIntegerMap.put(entry.getKey(), 1);
//        }
//        for (Map.Entry<Facility, Integer> entry : readHouse().entrySet()) {
//            facilityIntegerMap.put(entry.getKey(), 1);
//        }
//        for (Map.Entry<Facility, Integer> entry : readRoom().entrySet()) {
//            facilityIntegerMap.put(entry.getKey(), 1);
//        }
//    }
//
//    public FacilityService() {
//        readHashMap();
//    }

    static {
        readVilla();
        readHouse();
        readRoom();
    }
}

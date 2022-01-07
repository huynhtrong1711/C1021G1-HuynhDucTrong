package thi.service.impl;

import thi.model.Export;
import thi.service.IService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportService implements IService {
    public static final String FILE_EXPORT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\thi\\data\\export.csv";
    public List<Export> exportList;
    public Scanner scanner = new Scanner(System.in);
    public ExportService() {
        exportList = readExport();
    }

    public void writeExport() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_EXPORT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Export export : exportList) {
                bufferedWriter.write(export.getId() + "," + export.getCodeProduct() + "," + export.getName() +
                        "," + export.getPrice() + "," + export.getQuantum() + "," + export.getProducer() +
                        "," + export.getPriceExport() + "," + export.getNationImport());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Export> readExport() {
        List<Export> exports = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_EXPORT);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Export export;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                export = new Export(temp[1],temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5],
                        Integer.parseInt(temp[6]), temp[7]);
                exports.add(export);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exports;
    }
    @Override
    public void add() {
        exportList.add(creatExport());
        writeExport();
    }

    @Override
    public void display() {
        for (Export export : exportList) {
            System.out.println(export);
        }
    }

    @Override
    public void remove() {
        boolean check;
        boolean chose =false;
        int index = 0;
        System.out.println("Nhập mã sản phẩm bạn muốn xóa: ");
        String idRemove = scanner.nextLine();
        System.out.println("Bạn có chắc chắn muốn xóa sản phẩm có mã: " + idRemove + " này không?");
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
                for (int i = 0; i < exportList.size(); i++) {
                    if (exportList.get(i).getCodeProduct().equals(idRemove)) {
                        exportList.remove(i);
                        System.out.println("Danh sách sau khi bị xóa: ");
                        display();
                        writeExport();
                        break;
                    }else {
                        chose = true;
                    }
                }
                if (chose){
                    System.out.println("Mã sản phẩm không tồn tại!");
                }
            case 2:
                break;
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String nameProduct = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < exportList.size(); i++) {
            if (nameProduct.equals(exportList.get(i).getName())) {
                System.out.println(exportList.get(i)+ " là sản phẩm bạn cần tìm.");
                check = true;
                break;
            }
        } if (!check){
            System.out.println("không có sản phẩm bạn cần tìm.");
        }
    }

    public Export creatExport() {
        String regexCode = "(SP)(-)[0-9]{5}";
        String imputCode;
        int price = 0;
        int quantum = 0;
        int importProduct = 0;
        int tax = 0;
        boolean check;

        do {
            check = false;
            System.out.println("Nhập mã sản phẩm(SP-XXXXX)");
            imputCode = scanner.nextLine();
            if (!imputCode.matches(regexCode)) {
                check = true;
                System.out.println("Nhập không đúng định dạng xin nhập lại");
            }
        }while (check);

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        do {
            check = false;
            try {
                System.out.println("Nhập giá của sản phẩm: ");
                price = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (price <= 0) {
                check = true;
                System.out.println("Giá sản phẩm phải là số nguyên dương! xin nhập lại: ");
            }
        }while (check);

        do {
            check = false;
            try {
                System.out.println("Nhập số lượng sản phẩm: ");
                quantum = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (quantum <= 0) {
                check = true;
                System.out.println("Số lượng sản phẩm phải là số nguyên dương! xin nhập lại: ");
            }
        }while (check);

        System.out.println("Nhập nhà sản xuất: ");
        String producer = scanner.nextLine();

        do {
            check = false;
            try {
                System.out.println("Nhập giá xuất khẩu của sản phẩm: ");
                importProduct = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (importProduct <= 0) {
                check = true;
                System.out.println("Giá sản phẩm phải là số nguyên dương! xin nhập lại: ");
            }
        }while (check);

        System.out.println("Nhập quốc gia xuất khẩu: ");
        String provinceImport = scanner.nextLine();

        Export export = new Export(imputCode, name, price, quantum, producer, importProduct, provinceImport);
        return export;
    }
}

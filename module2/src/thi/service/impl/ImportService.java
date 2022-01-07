package thi.service.impl;

import thi.model.Import;
import thi.service.IService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportService implements IService {
    public static final String FILE_IMPORT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\thi\\data\\import.csv";
    public List<Import> importList;
    public Scanner scanner = new Scanner(System.in);
    public ImportService() {
       importList = readImport();
    }
    public void writeImport() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_IMPORT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Import importProduct : importList) {
                bufferedWriter.write(importProduct.getId() + "," + importProduct.getCodeProduct() + "," + importProduct.getName() +
                        "," + importProduct.getPrice() + "," + importProduct.getQuantum() + "," + importProduct.getProducer() +
                        "," + importProduct.getPriceImport() + "," + importProduct.getProvinceImport() + "," + importProduct.getTax());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Import> readImport() {
      List<Import> imports = new ArrayList<>();
      try {
          FileReader fileReader = new FileReader(FILE_IMPORT);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line;
          String[] temp;
          Import importProduct;
          while ((line = bufferedReader.readLine()) != null) {
              temp = line.split(",");
              importProduct = new Import(temp[1],temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5],
                      Integer.parseInt(temp[6]), temp[7], Integer.parseInt(temp[8]));
              imports.add(importProduct);
          }
          bufferedReader.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
      return imports;
    }
    @Override
    public void add() {
       importList.add(creatImport());
       writeImport();
    }

    @Override
    public void display() {
        for (Import imports : importList) {
            System.out.println(imports);
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
                for (int i = 0; i < importList.size(); i++) {
                    if (importList.get(i).getCodeProduct().equals(idRemove)) {
                        importList.remove(i);
                        System.out.println("Danh sách sau khi bị xóa: ");
                        display();
                        writeImport();
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
        for (int i = 0; i < importList.size(); i++) {
            if (nameProduct.equals(importList.get(i).getName())) {
                System.out.println(importList.get(i)+ " là sản phẩm bạn cần tìm.");
                check = true;
                break;
            }
        } if (!check){
            System.out.println("không có sản phẩm bạn cần tìm.");
        }

    }

    public Import creatImport() {
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
                System.out.println("Nhập giá nhập khẩu của sản phẩm: ");
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

        System.out.println("Nhập tỉnh thành nhập khẩu: ");
        String provinceImport = scanner.nextLine();

        do {
            check = false;
            try {
                System.out.println("Nhập thuế của sản phẩm: ");
                tax = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng! Xin nhập lại: ");
                continue;
            }
            if (tax <= 0) {
                check = true;
                System.out.println("Thuế phải là số nguyên dương! xin nhập lại: ");
            }
        }while (check);
        Import imports = new Import(imputCode, name, price, quantum, producer, importProduct, provinceImport, tax);
        return imports;
    }
}

package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line =bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            bufferedReader.close();

            System.out.println("Tổng = " + sum);
        }catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }


    }


    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}

package ss17_io_biraryfile_serialization.thuc_hanh.coppy_file_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void copyFileUsingJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);

            }
        } finally {
            inputStream.close();
            outputStream.close();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file muốn copy: ");
        String inputFile = scanner.nextLine();
        System.out.print("Nhập đường dẫn file muốn past: ");
        String outputFile = scanner.nextLine();

        File fileInput = new File(inputFile);
        File fileOutput = new File(outputFile);

        try {
            copyFileUsingJava7File(fileInput, fileOutput);
            System.out.print("Đã copy");
        } catch (IOException e) {
            System.out.print("Không thể copy ");
            System.out.print(e.getMessage());
        }


    }

}

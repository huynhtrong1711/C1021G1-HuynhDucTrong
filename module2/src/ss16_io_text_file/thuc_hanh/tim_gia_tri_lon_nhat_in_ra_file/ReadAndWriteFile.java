package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_in_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile (String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                number.add(Integer.parseInt(line));

            }

            bufferedReader.close();

        }catch (Exception e) {
            System.out.println("File không tồn tại hoặc bị lỗi!");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

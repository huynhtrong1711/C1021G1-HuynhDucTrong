package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoppyFile {

    public static final String FILE_INPUT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\input.txt";
    public static final String FILE_OUPUT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\ouput.txt";

    public static String readFile() {
        String stringFile = "";
        int i;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(FILE_INPUT);
            while ((i = fileReader.read()) != -1) {
                stringFile += (char)i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringFile;
    }

    public static void writeFile(String str) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_OUPUT);
        fileWriter.write(str);
        fileWriter.close();

    }

    public static void main(String[] args) throws IOException {
        String string = readFile();
        writeFile(string);
    }
}

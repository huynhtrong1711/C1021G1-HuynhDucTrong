package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListCountry {

    public static final String FILE_COUNTRY_CSV = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\country.csv";

    public static List<WorldCountry> listCountry() {
        List<WorldCountry> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_COUNTRY_CSV);
            BufferedReader buffReader = new BufferedReader(fileReader);
            String line = null;
            String temp[];
            WorldCountry worldCountry;
            while ((line = buffReader.readLine()) != null){
                temp = line.split(",");
                worldCountry = new WorldCountry(Integer.parseInt(temp[0]), temp[1], temp[2]);
                list.add(worldCountry);
            }
            buffReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<WorldCountry> worldCountryList = listCountry();
        for (WorldCountry worldCountry : worldCountryList) {
            System.out.println(worldCountry.getName());
        }
    }
}

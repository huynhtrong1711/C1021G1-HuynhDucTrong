package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_in_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax (List<Integer> number) {
        int max = number.get(0);
        for (int i = 1; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_in_ra_file\\text.txt");
        int maxValua = findMax(number);

        readAndWriteFile.writeFile("D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_in_ra_file\\result.txt", maxValua);

    }

}

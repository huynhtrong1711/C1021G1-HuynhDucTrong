package ss17_io_biraryfile_serialization.thuc_hanh.doc_ghi_danh_sach_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_TEXT = "D:\\C1021G1-HuynhDucTrong\\module2\\src\\ss17_io_biraryfile_serialization\\thuc_hanh\\doc_ghi_danh_sach_ra_file_nhi_phan\\student.txt";

    public static void writeToObject(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(students);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readStudent(String path) {
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Student>) ois.readObject();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        studentList.add(new Student(2, "Phạm Đình Tín", "Hồ Chí Minh"));
        studentList.add(new Student(3, "Võ Minh Huyền", "Quảng Nam"));
        studentList.add(new Student(4, "Lê Quang Anh", "Đà Nẵng"));
        studentList.add(new Student(5, "Nguyễn Văn Luyến", "Quảng Trị"));
        studentList.add(new Student(6, "Lê Tấn Trình", "Đà Nẵng"));
        writeToObject(FILE_TEXT, studentList);
        List<Student> studentList1 = readStudent(FILE_TEXT);
        for (Student student : studentList1) {
            System.out.println(student.getName() + " address: " + student.getAddress());
        }


    }


}

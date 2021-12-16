package ss12_java_collection_framework.thuc_hanh.phan_biet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Trọng", 24, "QN");
        Student student2 = new Student("Tín", 21, "QN");
        Student student3 = new Student("Trình", 27, "QN");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        hashMap.put(4, student1);

        for (Map.Entry<Integer, Student> studentEntry : hashMap.entrySet()) {
            System.out.println(studentEntry.toString());
        }

        System.out.println("-------------Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);
        for (Student students : studentSet) {
            System.out.println(students.toString());
        }

    }
}

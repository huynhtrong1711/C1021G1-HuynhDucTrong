package ss12_java_collection_framework.thuc_hanh.sap_xep_voi_comparable_comparator;

import java.util.*;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {
        Student students1 = new Student("Trọng", 24, "QN");
        Student students2 = new Student("Long", 28, "DN");
        Student students3 = new Student("Tiên", 20, "DN");
        Student students4 = new Student("Sơn", 26, "DN");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(students1);
        studentList.add(students2);
        studentList.add(students3);
        studentList.add(students4);
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        System.out.println("----------");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList,ageComparator);
        System.out.println("So sánh tên tuổi");
        for (Student student : studentList){
            System.out.println(student.toString());
        }
    }
}

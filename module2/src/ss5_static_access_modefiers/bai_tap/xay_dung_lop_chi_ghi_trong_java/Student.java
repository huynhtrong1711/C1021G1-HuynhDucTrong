package ss5_static_access_modefiers.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    void display() {
        System.out.println("Name: " + name + " Class: " + classes);
    }
}

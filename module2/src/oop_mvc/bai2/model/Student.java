package oop_mvc.bai2.model;

public class Student {
    private String code;
    private String name;
    private String dateOb;
    private String sex;
    private String studentName;
    private double course;

    public Student(String code, String name, String dateOb,String sex, String studentName, double course) {
        this.code = code;
        this.name = name;
        this.dateOb = dateOb;
        this.sex = sex;
        this.studentName = studentName;
        this.course = course;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOb() {
        return dateOb;
    }

    public void setDateOb(String dateOb) {
        this.dateOb = dateOb;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dateOb='" + dateOb + '\'' +
                ", sex=" + sex +
                ", studentName=" + studentName +
                ", course=" + course +
                '}';
    }
}

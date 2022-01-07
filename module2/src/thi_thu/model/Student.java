package thi_thu.model;

public class Student extends Person{
    private String studentClass;
    private double point;

    public Student() {
    }

    public Student(String studentClass, double point) {
        this.studentClass = studentClass;
        this.point = point;
    }

    public Student(String id, String name, String dateOfBirthday, String sex, String studentClass, double point) {
        super(id, name, dateOfBirthday, sex);
        this.studentClass = studentClass;
        this.point = point;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", studentClass='" + studentClass + '\'' +
                ", point=" + point +
                '}';
    }
}

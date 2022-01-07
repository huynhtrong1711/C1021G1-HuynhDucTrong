package thi_thu.model;

public class Teacher extends Person{
    private String technique;

    public Teacher() {
    }

    public Teacher(String technique) {
        this.technique = technique;
    }

    public Teacher(String id, String name, String dateOfBirthday, String sex, String technique) {
        super(id, name, dateOfBirthday, sex);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", technique='" + technique + '\'' +
                '}';
    }
}

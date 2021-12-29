package case_study.model.person;

public class Employee extends Person{
    private String level;
    private String position;
    private int wage;

    public Employee() {

    }


    public Employee(int id, String name, String dayOfBirthday, String sex,int passport, String phone, String email, String level, String position, int wage) {
        super(id, name, dayOfBirthday, sex, passport, phone, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + '\'' +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}

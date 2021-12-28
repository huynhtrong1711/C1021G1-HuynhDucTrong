package case_study.model.person;

public class Employee extends Person{
    private String level;
    private String position;

    public Employee() {

    }


    public Employee(int id, String name, int dayOfBirthday, String sex, int passport, int phone, String email, String level, String position) {
        super(id, name, dayOfBirthday, sex, passport, phone, email);
        this.level = level;
        this.position = position;
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

    @Override
    public String toString() {
        return "Employee{" + super.toString() + '\'' +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

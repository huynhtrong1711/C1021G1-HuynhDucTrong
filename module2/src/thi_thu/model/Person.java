package thi_thu.model;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirthday;
    private String sex;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirthday, String sex) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", sex='" + sex;
    }
}

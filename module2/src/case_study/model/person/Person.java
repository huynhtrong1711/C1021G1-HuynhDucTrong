package case_study.model.person;

public abstract class Person {
    private int id;
    private String name;
    private String sex;
    private int passport;
    private int phone;
    private String email;
    private int dayOfBirthday;

    public Person() {
    }

    public Person(int id, String name, int dayOfBirthday, String sex, int passport, int phone, String email) {
        this.id = id;
        this.name = name;
        this.dayOfBirthday = dayOfBirthday;
        this.sex = sex;
        this.passport = passport;
        this.phone = phone;
        this.email = email;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(int dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirthday=" + dayOfBirthday + '\'' +
                ", sex='" + sex + '\'' +
                ", passport=" + passport +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}

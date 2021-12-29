package case_study.model.person;

public abstract class Person {
    private int id;
    private String name;
    private String sex;
    private String passport;
    private String phone;
    private String email;
    private String dayOfBirthday;

    public Person() {
    }

    public Person(int id, String name, String dayOfBirthday, String sex, String passport, String phone, String email) {
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

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirthday=" + dayOfBirthday + '\'' +
                ", sex='" + sex + '\'' +
                ", passport=" + passport +
                ", phone=" + phone +
                ", email='" + email + '\'' + ", ";
    }
}

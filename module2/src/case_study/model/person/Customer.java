package case_study.model.person;

public class Customer extends Person{
    private String classCustomer;
    private String address;

    public Customer() {

    }

    public Customer(int id, String name, String dayOfBirthday, String sex, String passport, String phone, String email, String classCustomer, String address) {
        super(id, name, dayOfBirthday, sex, passport, phone, email);
        this.classCustomer = classCustomer;
        this.address = address;
    }

    public String getClassCustomer() {
        return classCustomer;
    }

    public void setClassCustomer(String classCustomer) {
        this.classCustomer = classCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + '\'' +
                "classCustomer='" + classCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

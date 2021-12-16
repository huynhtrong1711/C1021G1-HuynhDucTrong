package ss12_java_collection_framework.thuc_hanh.phan_biet_hashmap_hashset;

public class Student {
    private String name;
    private int age;
    private String adderss;

    public Student() {
    }

    public Student(String name, int age, String adderss) {
        this.name = name;
        this.age = age;
        this.adderss = adderss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adderss='" + adderss + '\'' +
                '}';
    }
}

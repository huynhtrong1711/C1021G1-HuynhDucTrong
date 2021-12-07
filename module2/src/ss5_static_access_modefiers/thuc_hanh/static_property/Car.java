package ss5_static_access_modefiers.thuc_hanh.static_property;

public class Car {
    private String name;

    private String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
    void display() {
        System.out.println("Car name: " + name + ", Engine: " + engine);
    }
}

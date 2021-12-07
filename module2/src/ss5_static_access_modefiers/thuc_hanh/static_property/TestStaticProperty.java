package ss5_static_access_modefiers.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);
        car1.display();

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);
        car2.display();
    }
}

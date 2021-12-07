package ss5_static_access_modefiers.bai_tap.access_modefiers;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6.0);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

    }
}

package ss7_abstract_interface.bai_tap.interface_resizeable;

import ss6_ke_thua.thuc_hanh.Circle;
import ss6_ke_thua.thuc_hanh.Rectangle;
import ss6_ke_thua.thuc_hanh.Shape;
import ss6_ke_thua.thuc_hanh.Square;

import java.io.FileOutputStream;

public class CircleTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(6);
        shape[1] = new Rectangle(7,4);
        shape[2] = new Square(5);
        for (Shape shape1 : shape) {
            shape1.resize(50);
            System.out.println(shape1);
        }
    }
}

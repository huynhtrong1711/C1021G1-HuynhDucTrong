package ss7_abstract_interface.bai_tap.interface_colorable;

import ss6_ke_thua.thuc_hanh.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(4.3, "while", true );
        squares[1] = new Square();
        squares[2] = new Square(6);
        for (Square square : squares) {
            System.out.println(square.getArea());
            square.howToColor();
        }



    }
}

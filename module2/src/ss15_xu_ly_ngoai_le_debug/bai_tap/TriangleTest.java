package ss15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleException triangleException = new TriangleException();

        System.out.print("Nhập cạnh a của tam giác: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh b của tam giác: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh c của tam giác: ");
        int c = Integer.parseInt(scanner.nextLine());
        try {
            triangleException.checkTriangle(a,b,c);
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }




    }

}

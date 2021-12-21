package ss15_xu_ly_ngoai_le_debug.bai_tap;

public class TriangleException {
    public void checkTriangle(int a, int b, int c) throws MyException {
        if (a < 0 || b < 0 || c < 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new MyException("LỖI ĐỊNH DẠNG!");
        } else {
            System.out.println("Tam giác hợp lệ.");
        }

    }
}

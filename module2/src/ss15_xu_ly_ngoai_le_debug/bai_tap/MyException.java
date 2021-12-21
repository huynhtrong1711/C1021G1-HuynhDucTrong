package ss15_xu_ly_ngoai_le_debug.bai_tap;

public class MyException extends Exception{
    private String error;
    public MyException() {
    }
    public MyException(String st) {
        super(st);
        this.error = st;
    }

}

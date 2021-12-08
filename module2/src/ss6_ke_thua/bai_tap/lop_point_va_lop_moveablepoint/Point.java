package ss6_ke_thua.bai_tap.lop_point_va_lop_moveablepoint;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;


    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "arr: " + Arrays.toString(getXY());
    }
}

package ss6_ke_thua.bai_tap.lop_point2d_3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;

    }
    public float[] getXYZ() {
        float[] arr2 = {getX(),getY(),z};
        return arr2;
    }

    @Override
    public String toString() {
        return "arr2: " + Arrays.toString(getXYZ());
    }
}

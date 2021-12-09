package ss7_abstract_interface.bai_tap.interface_resizeable;

import ss6_ke_thua.thuc_hanh.Circle;

public class Circle1 extends Circle implements Resizeable {
    private double doiso;
    double r = (doiso / 100);

    public double getDoso() {
        return doiso;
    }

    public void setDoso(double doso) {
        this.doiso = doso;
    }

    public Circle1() {
    }

    public Circle1(double radius) {
        super(radius);
    }

    public Circle1(double radius, String color, boolean filled, double doiso) {
        super(radius, color, filled);
        this.doiso = doiso;
    }

    @Override
    public void resize() {
        System.out.println("Diện tích tăng là: " + (r * r));

    }
}
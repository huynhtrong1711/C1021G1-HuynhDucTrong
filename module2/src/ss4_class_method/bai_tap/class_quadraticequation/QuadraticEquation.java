package ss4_class_method.bai_tap.class_quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }
    public double getRoot1() {
        return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }
    public double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }
    public double getRoot3() {
        return (-b / (2*a));
    }

}

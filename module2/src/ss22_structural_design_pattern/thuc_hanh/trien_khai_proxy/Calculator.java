package ss22_structural_design_pattern.thuc_hanh.trien_khai_proxy;

public interface Calculator {
    double add(double first, double second) throws RuntimeException;
    double sub(double first, double second);
    double mul(double first, double second);
    double div(double first, double second);
}

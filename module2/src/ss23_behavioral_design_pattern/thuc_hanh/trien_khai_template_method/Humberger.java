package ss23_behavioral_design_pattern.thuc_hanh.trien_khai_template_method;

public class Humberger extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Nhập bánh kẹp, thịt và khoai tây chiên.");
    }

    @Override
    public void cook() {
        System.out.println("Đang làm bánh và khoai tây chiên.");

    }

    @Override
    public void cleanUp() {
        System.out.println("Đã vứt dọn dẹp đĩa nhựa.");

    }
}

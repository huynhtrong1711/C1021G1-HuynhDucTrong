package ss23_behavioral_design_pattern.thuc_hanh.trien_khai_template_method;

public class TacoMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Nhập bánh.");
    }

    @Override
    public void cook() {
        System.out.println("Đang làm bánh và vỏ bánh.");
    }
    @Override
    public void eat() {
        System.out.println("Bánh rất ngon!");
    }

    @Override
    public void cleanUp() {
        System.out.println("Đã dọn dẹp vỏ bánh.");

    }
}

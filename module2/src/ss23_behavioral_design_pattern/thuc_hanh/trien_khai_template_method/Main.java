package ss23_behavioral_design_pattern.thuc_hanh.trien_khai_template_method;

public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Humberger();
        meal1.doMeal();

        System.out.println("--------");

        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}

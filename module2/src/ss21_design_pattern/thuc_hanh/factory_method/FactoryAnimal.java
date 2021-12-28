package ss21_design_pattern.thuc_hanh.factory_method;

public class FactoryAnimal {
    public Animal getSound(String type) {
        if ("canice".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }

    }
}

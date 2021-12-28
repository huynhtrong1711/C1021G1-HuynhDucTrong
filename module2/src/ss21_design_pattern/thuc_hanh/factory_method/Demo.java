package ss21_design_pattern.thuc_hanh.factory_method;

public class Demo {
    public static void main(String[] args) {
        FactoryAnimal animal = new FactoryAnimal();

        Animal animal1 = animal.getSound("canice");
        System.out.println(animal1.makeSound());

        Animal animal2 = animal.getSound("feline");
        System.out.println(animal2.makeSound());
    }
}

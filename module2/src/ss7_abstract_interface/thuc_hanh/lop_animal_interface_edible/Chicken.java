package ss7_abstract_interface.thuc_hanh.lop_animal_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return "Could be fried";
    }
}

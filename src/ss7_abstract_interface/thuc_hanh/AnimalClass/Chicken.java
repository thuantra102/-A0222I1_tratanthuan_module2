package ss7_abstract_interface.thuc_hanh.AnimalClass;

public class Chicken extends Animal implements Edible {
    @Override
    public String Makesound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return "Chicken is edible";
    }
}

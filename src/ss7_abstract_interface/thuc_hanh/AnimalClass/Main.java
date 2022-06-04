package ss7_abstract_interface.thuc_hanh.AnimalClass;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal i: animals) {
            System.out.println(i.Makesound());
            if (i instanceof Chicken) {
                Edible edible = (Chicken) i;
                System.out.println(edible.howtoEat());
            }
        }

    }
}

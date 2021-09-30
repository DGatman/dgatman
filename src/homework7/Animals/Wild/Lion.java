package homework7.Animals.Wild;

import homework7.Animals.Predator;

public class Lion extends Wild implements Predator {
    public Lion(int id, int age, int weight, String color) {
        super(id, age, weight, color, true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print("and I'm angry ");
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting...");
    }
}

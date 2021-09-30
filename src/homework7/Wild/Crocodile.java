package homework7.Wild;

import homework7.Swimable;
import homework7.Predator;

public class Crocodile extends Wild implements Swimable, Predator {
    public Crocodile(int id, int age, int weight, String color) {
        super(id, age, weight, color, true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print("and I'm angry ");
    }

    @Override
    public void hunt() {
        System.out.println("Crocodile is hunting...");
    }

    @Override
    public void swim() {
        System.out.println("Crocodile is swimming");
    }
}

package homework7.Pet;

import homework7.Swimable;

public class Fish extends Pet implements Swimable {
    public Fish(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.println("Fish tries its best, but it can't make a sound :(");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming...");
    }
}

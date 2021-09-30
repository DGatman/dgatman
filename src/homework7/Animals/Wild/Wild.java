package homework7.Animals.Wild;

import homework7.Animals.Animal;

public abstract class Wild extends Animal {
    boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print("I'm a wild animal ");
    }
}

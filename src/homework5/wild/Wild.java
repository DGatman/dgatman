package homework5.wild;

import homework5.Animal;

public class Wild extends Animal {
    public Wild(int id, int age, String color, double weight, boolean isPredator) {
        super(id, age, color, weight);
        this.isPredator = isPredator;
    }

    boolean isPredator;

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.println("I am wild animal" + (isPredator ? " and i am hungry.\n" : ".\n"));

    }
}

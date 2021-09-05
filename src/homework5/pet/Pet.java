package homework5.pet;

import homework5.Animal;

public class Pet extends Animal {
    public Pet(int id, int age, String color, double weight, String name, boolean isVaccinated) {
        super(id, age, color, weight);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    String name;
    boolean isVaccinated;

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.print(" my name is "+ name +". \n");
    }
}

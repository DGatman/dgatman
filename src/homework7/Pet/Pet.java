package homework7.Pet;

import homework7.Animal;

public abstract class Pet extends Animal {
    String name;
    boolean isVaccinated;

    public Pet(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public void voice() {
      super.voice();
        System.out.print("my name is " + this.name);
    }

}

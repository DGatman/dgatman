package homework7.Pet;

public class Cat extends Pet{
    public Cat(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

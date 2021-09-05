package homework5.pet;

public class Cat extends Pet{
    public Cat(int id, int age, String color, double weight, String name, boolean isVaccinated) {
        super(id, age, color, weight, name, isVaccinated);
    }

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.println("Meow!");
    }
}

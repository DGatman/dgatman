package homework5.pet;

public class Dog extends Pet{
    public Dog(int id, int age, String color, double weight, String name, boolean isVaccinated) {
        super(id, age, color, weight, name, isVaccinated);
    }

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.println("Woof!");
    }
}

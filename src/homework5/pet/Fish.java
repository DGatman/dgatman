package homework5.pet;

public class Fish extends Pet{
    public Fish(int id, int age, String color, double weight, String name, boolean isVaccinated) {
        super(id, age, color, weight, name, isVaccinated);
    }

    @Override
    public void makeVoice() {
        System.out.println("...");
    }
}

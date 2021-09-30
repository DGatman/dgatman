package homework7.Pet;

public class Dog extends Pet{
    public void guard(){
        System.out.println("Dog guards");
    }

    public Dog(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

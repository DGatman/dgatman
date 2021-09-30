package homework7.Animals.Pet;

public class GuideDog extends Dog{
    boolean isTrained = true;

    @Override
    public void guard() {
        super.guard();
    }
    public void takeHome(){
        System.out.println("Dog went towards the house");
    }

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package homework5.pet;

public class GuideDog extends Dog{
    public GuideDog(int id, int age, String color, double weight, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, color, weight, name, isVaccinated);
        this.isTrained = isTrained;
    }

    boolean isTrained;
    public void takeHome(){
        System.out.println("Let's go home!");
    }

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.print("I can take you home\n");
    }
}

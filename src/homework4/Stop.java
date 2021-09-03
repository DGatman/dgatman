package homework4;

public class Stop{
    String name;
    int distanceFromStart;

    public Stop() {
        this.name = "Undefined";
        this.distanceFromStart = 0;
    }
    //Getters and setters
    public String getName() {
        return name;
    }

    public int getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }
}

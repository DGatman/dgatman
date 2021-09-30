package homework4;

public class Trip {
    private String name;
    private int distance;
    private Stop[] stopList;
    private int price;

    public Trip(String name, int distance,int stopCount) {
        this.name = name;
        this.distance = distance;
        this.stopList = new Stop[stopCount];
        for (int i = 0; i < stopList.length; i++) {
            stopList[i]=new Stop();
        }

        this.price =(int)(TestCar.car.getTankVolume()*2789);
    }

    /**
     * Outputs all field values of the Trip object.
     */
    public void TripInfo(){
        System.out.println("\t\t\t" + name + " :"
        + "\n\tDistance :\t" + distance + " km."
        + "\n\tStops : ");
        for (Stop stop:stopList) {
            System.out.println("\t\t1. " + stop.getName()
            + "\t\t\tDistance from start point :\t" + stop.getDistanceFromStart());
        }
        System.out.println("\tFull price :\t" + (double)price/100 + " UAH.");
    }
//Getters and setters
    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public Stop[] getStopList() {
        return stopList;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setStopList(Stop[] stopList) {
        this.stopList = stopList;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

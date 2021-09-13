package homework4;

public class Car {
    private double tankVolume;
    private double fuel;
    private double consumption;

    public Car(double tankVolume,double consumption) {
        this.tankVolume = tankVolume;
        this.fuel = 0;
        this.consumption = consumption;
    }

    public void Refuel() {
        fuel = tankVolume;
    }

    /**
     * Calculates the rest of fuel after covering the distance.
     *
     * @param distance
     * @return Amount of fuel ( l. )
     */
    public double GetRestOfFuelAfterDistance(int distance) {
        return fuel - (distance / 100.0 * consumption);
    }

    /**
     * Calculates amount of fuel needed to cover the distance.
     *
     * @param distance
     * @return aAmount of fuel ( l. )
     */
    public double GetAmountOfMissingFuelAfterDistance(int distance) {
        return distance / 100.0 * consumption;
    }

    /**
     *
     *
     */
    public void CarInfo(){
        System.out.println("Tank volume :\t" + tankVolume + " l."
                + "\nFuel :\t" + fuel + " l."
                + "\nFuel consumption per 100 km :\t" + consumption + " l.");
    }
    //Getters and setters
    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }
}

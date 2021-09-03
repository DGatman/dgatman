package homework4;

public class Car {
    private double tankVolume;
    private double fuel;
    private double fuelPer100km;
    final int FUEL_PRICE = 2789;

    public Car(double tankVolume,double fuelPer100km) {
        this.tankVolume = tankVolume;
        this.fuel = 0;
        this.fuelPer100km = fuelPer100km;
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
        return fuel - (distance / 100.0 * fuelPer100km);
    }

    /**
     * Calculates amount of fuel needed to cover the distance.
     *
     * @param distance
     * @return aAmount of fuel ( l. )
     */
    public double GetAmountOfMissingFuelAfterDistance(int distance) {
        return distance / 100.0 * fuelPer100km;
    }

    /**
     *
     *
     */
    public void CarInfo(){
        System.out.println("Tank volume :\t" + tankVolume + " l."
                + "\nFuel :\t" + fuel + " l."
                + "\nFuel consumption per 100 km :\t" + fuelPer100km + " l.");
    }
    //Getters and setters
    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelPer100km(double fuelPer100km) {
        this.fuelPer100km = fuelPer100km;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelPer100km() {
        return fuelPer100km;
    }
}

package homework4Simple;

public class Car {
    private double tankVolume;
    private double fuel;
    private double fuelPer100km;

    public Car(double tankVolume, double fuelPer100km) {
        this.tankVolume = tankVolume;
        this.fuel = 0;
        this.fuelPer100km = fuelPer100km;
    }

    public void Refuel() {
        fuel = tankVolume-fuel;
    }

    public double GetRestOfFuelAfterDistance(int distance) {
        return fuel - (distance / 100.0 * fuelPer100km);
    }

    public double GetFuelForDistance(int distance) {
        return distance / 100.0 * fuelPer100km;
    }
}

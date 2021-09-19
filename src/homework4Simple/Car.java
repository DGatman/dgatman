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
    public void Ride(int distance) throws ArithmeticException{
        this.fuel -= fuelPer100km*distance/100;
        if (fuel<=0){
            throw new ArithmeticException("Fuel is 0!");
        }
    }
    public void CarInfo(){
        System.out.println("Tank volume :\t" + tankVolume + " l."
                + "\nFuel :\t" + fuel + " l."
                + "\nFuel consumption per 100 km :\t" + fuelPer100km + " l.");
    }

    public void Refuel() {
        fuel = tankVolume-fuel;
    }

    public void Refuel(int count){
        fuel += fuel+count>tankVolume ? tankVolume : count;
    }

    public double GetRestOfFuelAfterDistance(int distance) {
        return fuel - (distance / 100.0 * fuelPer100km);
    }

    public double GetFuelForDistance(int distance) {
        return distance / 100.0 * fuelPer100km;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getFuel() {
        return fuel;
    }
}

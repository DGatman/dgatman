package homework4Simple;

public class TestCar {
    //Odessa - Kiev - 478km
    //Odessa - Kr.oz. - 178 km
    //Kr.oz. - Жашков - 152 км
    //Жашков - Киев - 148 км
    public static void main(String[] args) {
        Car car = new Car(48,9);
        car.Refuel();
        double fuelNeeded = car.GetFuelForDistance(478);
        int fuelPrice = (int)(fuelNeeded*100*27.89);
        double restOfFuel = car.GetRestOfFuelAfterDistance(148);
        System.out.println("We need " + fuelNeeded + " l of fuel." +
                "\nIt'll cost " + (double)fuelPrice/100 + " UAH." +
                "\nRest of fuel  in end point : " + restOfFuel + " l.");

    }

}

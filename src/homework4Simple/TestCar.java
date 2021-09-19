package homework4Simple;

import java.util.Random;
import java.util.Scanner;

public class TestCar {
    //Odessa - Kiev - 478km
    //Odessa - Kr.oz. - 178 km
    //Kr.oz. - Жашков - 152 км
    //Жашков - Киев - 148 км
    //Fuel price - 27,89
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int toRefuel;
        Random random = new Random();
        Car car = new Car(random.nextInt(40)+20,random.nextInt(4)+8);
        System.out.println("You started trip.");
        car.CarInfo();
        car.Refuel();
        int price = (int)car.getTankVolume()*2879;
        System.out.println("You refuel tank.It costs you : " + (double)price/100);
        System.out.println("You arrived to Krivoe ozero");
        car.Ride(178);
        System.out.format("There's %.2f l of fuel in your tank.How much fuel do you need?",car.getFuel());
        toRefuel = in.nextInt();
        car.Refuel(toRefuel + car.getFuel() > car.getTankVolume() ? (int)(car.getTankVolume() - car.getFuel()) : toRefuel);
        price+= toRefuel*2789;
        System.out.println("It costs you : " + (double)(toRefuel*2789)/100);
        System.out.println("You arrived to Zhashkov");
        car.Ride(152);
        System.out.format("There's %.2f l of fuel in your tank.How much fuel do you need?",car.getFuel());
        toRefuel = in.nextInt();
        car.Refuel(toRefuel + car.getFuel() > car.getTankVolume() ? (int)(car.getTankVolume() - car.getFuel()) : toRefuel);
        price+= (toRefuel + car.getFuel() > car.getTankVolume() ? (int)(car.getTankVolume() - car.getFuel()) : toRefuel) * 2789;
        System.out.println("It costs you : " + (double)(toRefuel*2789)/100);
        car.Ride(148);
        System.out.format("You arrived to Kyiv.There's %.2f l of fuel in your tank.Price of the trip : " + (double)price/100,car.getFuel());


    }

}

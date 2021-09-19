package homework4;

import java.util.Scanner;

public class CarTest {
    //Odessa - Kiev - 478km
    //Odessa - Kr.oz. - 178 km
    //Kr.oz. - Жашков - 152 км
    //Жашков - Киев - 148 км
    //Fuel price - 27,89
    public static Car car = new Car(43, 9.5);
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int stopsCount;
        int distance;
        String name;

        System.out.print("Enter the name of the trip : ");
        in.nextLine();
        name = in.nextLine();
        System.out.print("Enter the distance of the trip : ");
        distance = in.nextInt();
        System.out.print("Enter the number of stops : ");
        stopsCount = in.nextInt();
        Trip trip = new Trip(name, distance, stopsCount);
        for (int i = 0; i < trip.getStopList().length; i++) {
            System.out.println("Enter the name of the " + (i + 1) + " stop.");
            in.nextLine();
            trip.getStopList()[i].setName(in.nextLine());
            System.out.println("Enter the distance from start point to the " + (i + 1) + " stop.");
            trip.getStopList()[i].setDistanceFromStart(in.nextInt());
        }
    }


}

package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCar {
    public static Car car = new Car(43, 9.5);
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Trip> tripList = new ArrayList<>();

        //Я знаю,выглядит ужасно.Хотел разбить на методы и засунуть в енам,но до понедельника уже не успеваю.
        Exit : while (true) {
            System.out.println("1. Car\n" +
                    "2. Trip");
            switch (in.nextInt()) {
                //Car
                case 1:
                    car.CarInfo();
                    System.out.println("1. Edit car.\n" +
                            "0. Back.");
                    switch (in.nextInt()) {
                        case 1:
                            System.out.println("Edit :\n" +
                                    "1. Tank volume.\n" +
                                    "2. Fuel amount.\n" +
                                    "3. Fuel consumption.\n" +
                                    "0. Back.");
                            switch (in.nextInt()) {
                                case 1:
                                    System.out.println("Previous tank volume : " + car.getTankVolume() + " l.\n" +
                                            "New(use < , > as a separator) :");
                                    car.setTankVolume(in.nextDouble());
                                    break;
                                case 2:
                                    System.out.println("Previous fuel amount : " + car.getFuel() + " l.\n" +
                                            "New(use < , > as a separator) :");
                                    car.setFuel(in.nextDouble());
                                    break;
                                case 3:
                                    System.out.println("Previous fuel consumption : " + car.getTankVolume() + " l per 100 km.\n" +
                                            "New(use < , > as a separator) :");
                                    car.setConsumption(in.nextDouble());
                                    break;
                                case 0:
                                    break;
                            }
                        case 0:
                            break;
                    }
                    break;
                    //Trip
                case 2:
                    System.out.println("1. Create.\n" +
                            "2. List.\n" +
                            "0. Back.");
                    switch (in.nextInt()) {
                        case 1:
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
                            tripList.add(trip);
                            trip.TripInfo();
                            break;
                        case 2:
                            for (int i = 0; i < tripList.size(); i++) {
                                System.out.println((i + 1) + ". " + tripList.get(i).getName());
                            }
                            System.out.println("0. Back.");
                            int tripIndex = in.nextInt()-1;
                            if (tripIndex != -1) {
                                System.out.println("1. Trip info.\n" +
                                        "2. Edit trip.");
                                switch (in.nextInt()) {
                                    case 1:
                                        tripList.get(tripIndex).TripInfo();
                                        break;
                                    case 2:
                                        System.out.println("Edit :\n" +
                                                "1. Name.\n" +
                                                "2. Distance.\n" +
                                                "3. Stops.\n" +
                                                "0. Back.");
                                        switch (in.nextInt()) {
                                            case 1:
                                                System.out.println("Previous name : " + tripList.get(tripIndex).getName()
                                                        + "\nNew :");
                                                in.nextLine();
                                                tripList.get(tripIndex).setName(in.nextLine());
                                                break;
                                            case 2:
                                                System.out.println("Previous distance : " + tripList.get(tripIndex).getName()
                                                        + "\nNew :");
                                                tripList.get(tripIndex).setDistance(in.nextInt());
                                                break;
                                            case 3:
                                        }
                                }
                            }
                            break;
                    }
                    break;
                case 0:
                    break Exit;
            }
        }

    }
}

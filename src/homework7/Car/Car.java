package homework7.Car;

public class Car {
    private String position;
    private int tripDistance;
    private double fuelInTank;
    private double tankVolume;
    private int price = 0;
    private int consumption;

    @Override
    public String toString() {
        return "Car{" +
                "position='" + position + '\'' +
                ", tripDistance=" + tripDistance +
                ", fuelInTank=" + fuelInTank +
                ", tankVolume=" + tankVolume +
                ", price=" + price +
                ", consumption=" + consumption +
                '}';
    }

    public Car(String position) {
        this.position = position;
        this.tankVolume =  (30 + (int) (Math.random()*30));
        this.fuelInTank = (Math.random()*0.4 + 0.1) * this.tankVolume ;
        this.consumption =(int) (Math.random()*10 + 5);
    }

    public void setTripDistance(int tripDistance) {
        this.tripDistance = tripDistance;

    }
    public double getFuelInTank() {
        return fuelInTank;
    }

    public void fillFullTank(double fuelPrice) {
        this.price += (int) ((fuelPrice*100)*(this.tankVolume - this.fuelInTank));
        this.fuelInTank = this.tankVolume;
    }

    public void drive(int distance, String destination) throws Exception {
        this.fuelInTank -= this.consumption * (double)(distance/100);
        this.position = destination;
        this.tripDistance += distance;
        Exception e = new Exception("Бензина не осталось.");
        if (fuelInTank < 0)
            throw e;
    }

    public void fillTank(double liters, double fuelPrice) {
        liters = Math.min(liters, (this.tankVolume - this.fuelInTank));
        this.price += (int)(liters*fuelPrice*100);
        this.fuelInTank += liters;
    }

    public void printTripReport() {
        System.out.println("\t* * * *  Отчет о поездке  * * * *");
        System.out.printf("\tОстаток топлива в баке :\t%.2f л." +
                "\n\tВсего проехали :\t\t\t%d км." +
                "\n\tВсего потрачено :\t\t\t%.2f грн." +
                "\n\tМестоположение авто :\t\t%s",this.fuelInTank,this.tripDistance,((double)this.price/100),this.position);
    }
}

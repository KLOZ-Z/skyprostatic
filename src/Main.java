import drivers.Bdriver;
import drivers.Cdriver;
import drivers.Ddriver;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bdriver driverb = new Bdriver("BName",5,true);
        Cdriver driverc = new Cdriver("CName",10,true);
        Ddriver driverd = new Ddriver("DName",12,true);
        Car<Bdriver> car1 = new Car<>("Brand1","Model1", 3.0,driverb);
        Car<Bdriver> car2 = new Car<>("Brand2","Model2", 3.0,driverb);
        Car<Bdriver> car3 = new Car<>("Brand3","Model3", 3.0,driverb);
        Car<Bdriver> car4 = new Car<>("Brand4","Model4", 3.0,driverb);
        Truck<Cdriver> truck1 = new Truck<>("Brand1","Model1", 3.0,driverc);
        Truck<Cdriver> truck2 = new Truck<>("Brand2","Model2", 3.0,driverc);
        Truck<Cdriver> truck3 = new Truck<>("Brand3","Model3", 3.0,driverc);
        Truck<Cdriver> truck4 = new Truck<>("Brand4","Model4", 3.0,driverc);
        Bus<Ddriver> bus1 = new Bus<>("Brand1","Model1", 3.0,driverd);
        Bus<Ddriver> bus2 = new Bus<>("Brand2","Model2", 3.0,driverd);
        Bus<Ddriver> bus3 = new Bus<>("Brand3","Model3", 3.0,driverd);
        Bus<Ddriver> bus4 = new Bus<>("Brand4","Model4", 3.0,driverd);
        car1.pitstop();
        car2.fastestLap();
        car3.maxSpeed();
        car1.participate();
        bus1.participate();
        truck1.participate();
    }
}
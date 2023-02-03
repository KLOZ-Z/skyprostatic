import drivers.Bdriver;
import drivers.Cdriver;
import drivers.Ddriver;
import enums.BodyType;
import enums.CapacityType;
import enums.TransportType;
import enums.WeightType;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bdriver driverb = new Bdriver("BName",5,true);
        Cdriver driverc = new Cdriver("CName",10,true);
        Ddriver driverd = new Ddriver("DName",12,true);
        Car<Bdriver> car1 = new Car<>("Brand1","Model1", 3.0,null,driverb, BodyType.SEDAN);
        Truck<Cdriver> truck1 = new Truck<>("Brand1","Model1", 3.0, TransportType.TRUCK,driverc, WeightType.N2);
        Bus<Ddriver> bus1 = new Bus<>("Brand1","Model1", 3.0,TransportType.BUS,driverd, CapacityType.MEDIUM);
        car1.passDiagnostic();
        truck1.passDiagnostic();
        bus1.passDiagnostic();
    }

}
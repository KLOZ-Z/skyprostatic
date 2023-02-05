import drivers.Bdriver;
import drivers.Cdriver;
import drivers.Ddriver;
import enums.BodyType;
import enums.CapacityType;
import enums.TransportType;
import enums.WeightType;
import exceptions.TransportTypeException;
import mechanic.Mechanic;
import station.ServiceStation;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> TransportList = new ArrayList<>();
        ArrayList<Mechanic> MechanicList = new ArrayList<>();
        Bdriver driverb = new Bdriver("BName",5,true);
        Cdriver driverc = new Cdriver("CName",10,true);
        Ddriver driverd = new Ddriver("DName",12,true);
        Mechanic mechanic1 = new Mechanic("name1 surname1","company1");
        Mechanic mechanic2 = new Mechanic("name2 surname2","company2");
        Mechanic mechanic3 = new Mechanic("name3 surname3","company3");
        ServiceStation service = new ServiceStation();
        MechanicList.add(mechanic1);
        MechanicList.add(mechanic2);
        MechanicList.add(mechanic3);
        Car<Bdriver> car1 = new Car<>("Brand1","Model1", 2.0,null,MechanicList,driverb, BodyType.SEDAN);
        Truck<Cdriver> truck1 = new Truck<>("Brand2","Model2", 6.0, TransportType.TRUCK,MechanicList,driverc, WeightType.N2);
        Bus<Ddriver> bus1 = new Bus<>("Brand3","Model3", 4.0,TransportType.BUS,MechanicList,driverd, CapacityType.MEDIUM);
        TransportList.add(car1);
        TransportList.add(truck1);
        TransportList.add(bus1);
        for (Transport transp:TransportList) {
            System.out.println(transp.toString());
        }
        mechanic1.doTechService(car1);
        mechanic2.repair(car1);
        car1.printDriver();
        car1.printMechanics();

        service.addToQueue(car1);
        service.addToQueue(truck1);
        service.addToQueue(bus1);
        service.techInspection();

        /*try {
            car1.passDiagnostic();
        } catch (TransportTypeException e) {
            System.out.println(e);
        }
        try {
            truck1.passDiagnostic();
        } catch (TransportTypeException e) {
            System.out.println(e);
        }
        try {
            bus1.passDiagnostic();
        } catch (TransportTypeException e) {
            System.out.println(e);
        }*/
    }
}
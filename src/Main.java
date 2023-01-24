import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        Car car1 = new Car("BMW","Z8",250,3.0,"черный",2021,"Германия","АКПП","родстер","к775нп77",2,true);
        System.out.println(car1.toString());
        System.out.println("\nTask 2");
        Bus bus1 = new Bus("Brand1", "Mod1", "blue", 2001,"rus",100);
        Bus bus2 = new Bus("Brand2", "Mod2", "yellow", 2003,"rus",110);
        Bus bus3 = new Bus("Brand3", "Mod3", "green", 2004,"rus",120);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());

    }
}
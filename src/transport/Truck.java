package transport;

import drivers.Cdriver;
import interfaces.Competitor;

public class Truck<T extends Cdriver> extends Transport implements Competitor {
    private T driver;
    public Truck(String brand, String model, double engineVolume,T driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }

    public void participate(){
        System.out.println("водитель "+this.driver.getFio()+" управляет автомобилем "+this.getModel()+" "+this.getBrand()+" и будет участвовать в заезде");
    }

    @Override
    public void pitstop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void fastestLap() {
        System.out.println(this.getBrand()+" "+this.getModel()+"Лучшее время круга: "+"00:06:30");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this.getBrand()+" "+this.getModel()+" Максимальная скорость: "+"100"+" км/ч");
    }
}

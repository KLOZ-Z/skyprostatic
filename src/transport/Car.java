package transport;

import drivers.Bdriver;
import drivers.Driver;
import interfaces.Competitor;

public class Car<T extends Bdriver> extends Transport implements Competitor {
    private T driver;
    public Car(String brand, String model, double engineVolume, T driver) {
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
        System.out.println(this.getBrand()+" "+this.getModel()+" Лучшее время круга: "+"00:03:30");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this.getBrand()+" "+this.getModel()+" Максимальная скорость: "+"150"+" км/ч");
    }
}

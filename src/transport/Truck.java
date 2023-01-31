package transport;

import drivers.Cdriver;
import enums.TransportType;
import enums.WeightType;
import interfaces.Competitor;

public class Truck<T extends Cdriver> extends Transport implements Competitor {
    private T driver;
    private WeightType weight;
    public Truck(String brand, String model, double engineVolume, TransportType type, T driver, WeightType weight) {
        super(brand, model, engineVolume, type);
        this.driver = driver;
        this.weight = weight;
    }

    public void participate(){
        System.out.println("водитель "+this.driver.getFio()+" управляет автомобилем "+this.getModel()+" "+this.getBrand()+" и будет участвовать в заезде");
    }

    public String printweight(){
        return this.getBrand() +" "+ this.getModel()+" "+this.weight;
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

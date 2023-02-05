package transport;

import drivers.Ddriver;
import enums.CapacityType;
import enums.TransportType;
import enums.WeightType;
import exceptions.TransportTypeException;
import interfaces.Competitor;
import mechanic.Mechanic;

import java.util.ArrayList;

public class Bus<T extends Ddriver> extends Transport implements Competitor {
    private T driver;

    private CapacityType capacity;
    public Bus(String brand, String model, double engineVolume, TransportType type, ArrayList<Mechanic> mechanicList, T driver, CapacityType capacity) {
        super(brand, model, engineVolume, type, mechanicList);
        this.driver = driver;
        this.capacity = capacity;
    }


    public void participate(){
        System.out.println("водитель "+this.driver.getFio()+" управляет автомобилем "+this.getModel()+" "+this.getBrand()+" и будет участвовать в заезде");
    }

    public String printcapacity(){
        return this.getBrand() +" "+ this.getModel()+" "+this.capacity;
    }

    public T getDriver() {
        return driver;
    }

    public void printDriver(){
        System.out.println(driver.getFio());
    }

    @Override
    public void pitstop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void fastestLap() {
        System.out.println(this.getBrand()+" "+this.getModel()+"Лучшее время круга: "+"00:09:20");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this.getBrand()+" "+this.getModel()+" Максимальная скорость: "+"80"+" км/ч");
    }

    @Override
    public void passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не могут проходить диагноситку");
    }
}

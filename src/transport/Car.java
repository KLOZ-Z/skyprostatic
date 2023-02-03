package transport;

import drivers.Bdriver;
import drivers.Driver;
import enums.BodyType;
import enums.TransportType;
import interfaces.Competitor;



public class Car<T extends Bdriver> extends Transport implements Competitor {
    private T driver;
    private BodyType btype;



    public Car(String brand, String model, double engineVolume, TransportType type, T driver, BodyType btype) {
        super(brand, model, engineVolume, type);
        this.driver = driver;
        this.btype = btype;
    }

    public void participate(){
        System.out.println("водитель "+this.driver.getFio()+" управляет автомобилем "+this.getModel()+" "+this.getBrand()+" и будет участвовать в заезде");
    }

    public String printtype(){
        return this.getBrand() +" "+ this.getModel()+this.btype;
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

    @Override
    public void passDiagnostic() {
        System.out.println("Диагностика пройдена");
    }
}

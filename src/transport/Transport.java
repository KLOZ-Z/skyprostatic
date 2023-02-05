package transport;

import enums.BodyType;
import enums.TransportType;
import exceptions.TransportTypeException;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;

    private double engineVolume;

    private List<Mechanic> mechanicList = new ArrayList<>();

    public TransportType type;

    public Transport(String brand,String model, double engineVolume, TransportType type, ArrayList<Mechanic> mechanicList){
        if(brand==null)
            this.brand = "default";
        else
        if(brand.isEmpty())
            this.brand = "default";
        else
            this.brand = brand;
        if(model==null)
            this.model = "default";
        else
        if(model.isEmpty())
            this.model = "default";
        else
            this.model = model;
        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
        this.type = type;
        this.mechanicList = mechanicList;
    }


    //неизменяемые поля


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
    }

    public void startMoving(){

    }

    public void stopMoving(){

    }

    public abstract void passDiagnostic() throws TransportTypeException;


    public void printType(){
        if(type==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
        else
            System.out.println(type);
    }

    public void printMechanics(){
        for (Mechanic mech: mechanicList) {
            System.out.println(mech.getName());
        }
    }

    @Override
    public String toString(){
        return this.getBrand() +" "+ this.getModel() +", объем двигателя "+this.engineVolume+" л.";
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }
}
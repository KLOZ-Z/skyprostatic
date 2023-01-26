package transport;

public abstract class Transport {
    private final String brand;
    private final String model;

    private double engineVolume;

    public Transport(String brand,String model, double engineVolume){
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


    @Override
    public String toString(){
        return this.getBrand() +" "+ this.getModel() +", объем двигателя "+this.engineVolume+" л.";
    }
}
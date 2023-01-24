package transport;

public class Car extends Transport{
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int placesNumber;
    private boolean tiers;

    public class Key{
        private final boolean remoteStart;
        private final boolean access;

        public Key(Boolean remoteStart, Boolean access) {
            if(remoteStart==null)
                this.remoteStart = false;
            else
                this.remoteStart = remoteStart;
            if(access==null)
                this.access = false;
            else
                this.access = access;
        }

        public boolean isAccess() {
            return access;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }
    }

    public Car(String brand,String model, int maxSpeed, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int placesNumber, Boolean tires) {
        super(brand, model, color, year, country, maxSpeed);
        if(transmission==null)
            this.transmission = "default";
        else
        if(transmission.isEmpty())
            this.transmission = "default";
        else
            this.transmission = transmission;

        if(bodyType==null)
            this.bodyType = "default";
        else
        if(bodyType.isEmpty())
            this.bodyType = "default";
        else
            this.bodyType = bodyType;

        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;

        if(registrationNumber==null)
            this.registrationNumber = "default";
        else
        if(registrationNumber.isEmpty())
            this.registrationNumber = "default";
        else
            this.registrationNumber = registrationNumber;

        if(placesNumber<=1)
            this.placesNumber = 2;
        else
            this.placesNumber = placesNumber;

        if(tires==null)
            this.tiers = false;
        else
            this.tiers = tires;
    }



    //неизменяемые поля


    public String getBodyType() {
        return bodyType;
    }

    public int getPlacesNumber() {
        return placesNumber;
    }

//изменяемые поля


    public boolean isTiers() {
        return tiers;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getTransmission() {
        return transmission;
    }


    public void setEngineVolume(double engineVolume) {
        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber==null)
            this.registrationNumber = "default";
        else
        if(registrationNumber.isEmpty())
            this.registrationNumber = "default";
        else
            this.registrationNumber = registrationNumber;
    }

    public void setTiers(Boolean tiers) {
        if(tiers == null)
            this.tiers=false;
        else
            this.tiers=tiers;
    }

    public void setTransmission(String transmission) {
        if(transmission==null)
            this.transmission = "default";
        else
        if(transmission.isEmpty())
            this.transmission = "default";
        else
            this.transmission = transmission;
    }

    public void changeTires(int month){
        if((month==11) || (month==12)|| (month==1)|| (month==2))
            this.tiers=true;
        else
            this.tiers=false;
    }

    @Override
    public String toString(){
        if(this.tiers)
            return this.getBrand() +" "+ this.getModel() +", сборка: "+ this.getCountry() +", Цвет кузова "+ this.getColor() +", объем двигателя "+this.engineVolume+" л.,"+ " максимальная скорость: "+ this.getMaxSpeed() +", год выпуска "+ this.getYear() +", коробка передач: "+this.transmission+", Тип кузова: "+this.bodyType+", Регистрационный номер: "+this.registrationNumber+", количество мест: "+this.placesNumber+", Зимняя резина";
        else
            return this.getBrand() +" "+ this.getModel() +", сборка: "+ this.getCountry() +", Цвет кузова "+ this.getColor() +", объем двигателя "+this.engineVolume+" л.,"+ " максимальная скорость: "+ this.getMaxSpeed() + ", год выпуска "+ this.getYear() +", коробка передач: "+this.transmission+", Тип кузова: "+this.bodyType+", Регистрационный номер: "+this.registrationNumber+", количество мест: "+this.placesNumber+", Летняя резина";
    }
}

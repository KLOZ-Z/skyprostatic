package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

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

    public Transport(String brand,String model, String color, int year, String country, int maxSpeed){
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
        if(color==null)
            this.color = "default";
        else
        if(color.isEmpty())
            this.color = "белый";
        else
            this.color = color;
        if(year<=0)
            this.year = 2000;
        else
            this.year = year;
        if(country==null)
            this.country = "default";
        else
        if(country.isEmpty())
            this.country = "default";
        else
            this.country = country;

        if(maxSpeed<=0)
            this.maxSpeed = 150;
        else
            this.maxSpeed = maxSpeed;
    }


    //неизменяемые поля
    public int getYear() {
        return year;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //изменяемые поля

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed<=0)
            this.maxSpeed = 150;
        else
            this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        if(color==null)
            this.color = "default";
        else
        if(color.isEmpty())
            this.color = "белый";
        else
            this.color = color;
    }






    @Override
    public String toString(){
        return this.brand+" "+this.model+", сборка: "+this.country+", Цвет кузова "+this.color+", год выпуска "+this.year+", максимальная скорость: "+this.maxSpeed;
    }
}
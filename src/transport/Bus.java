package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }
    @Override
    public String toString(){
        return this.getBrand() +" "+ this.getModel() +", сборка: "+ this.getCountry() +", Цвет кузова "+ this.getColor() +", год выпуска "+ this.getYear() +", максимальная скорость: "+ this.getMaxSpeed();
    }
}

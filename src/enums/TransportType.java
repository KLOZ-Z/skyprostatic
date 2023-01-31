package enums;

public enum TransportType {
    CAR("Легковой автомобиль"),
    TRUCK("Грузовой автомобиль"),
    BUS("Автобус");


    private String type;
    TransportType(String type) {
        this.type=type;
    }

    @Override
    public String toString() {
        return "Тип транспортного средства: "+type;
    }
}

package enums;

public enum WeightType {
    N1(0f,3.5f),
    N2(3.5f,12f),
    N3(12f,100f);

    private Float low;
    private Float upper;
    WeightType(Float i, Float v) {
        this.low = i;
        this.upper = v;
    }

    @Override
    public String toString() {
        if(low==null){
            return "Грузоподъемность: до "+upper+" тонн.";
        } else if (upper==null) {
            return "Грузоподъемность: от " +low+" тонн.";
        }
        else
            return "Грузоподъемность: от " +low+" тонн до "+upper+" тонн.";
    }
}

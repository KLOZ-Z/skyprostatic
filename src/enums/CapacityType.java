package enums;

public enum CapacityType {
    VERYSMALL(0,10),
    SMALL(10,25),
    MEDIUM(40,50),
    BIG(60,80),
    VERYBIG(100,120);

    private Integer low;
    private Integer upper;
    CapacityType(Integer i, Integer v) {
        this.low = i;
        this.upper = v;
    }

    @Override
    public String toString() {
        if(low==null){
            return "Вместимость: до "+upper+" мест.";
        } else if (upper==null) {
            return "Вместимость: от " +low+" мест.";
        }
        else
            return "Вместимость: от " +low+" мест до "+upper+" мест.";
    }
}

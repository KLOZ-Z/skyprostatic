package drivers;

public class Bdriver extends Driver{
    private String category;
    public Bdriver(String fio, int experience, boolean license) {
        super(fio, experience, license);
        this.category="B";
    }
}

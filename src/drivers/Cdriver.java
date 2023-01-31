package drivers;

public class Cdriver extends Driver{
    private String category;
    public Cdriver(String fio, int experience, boolean license) {
        super(fio, experience, license);
        this.category = "C";
    }
}

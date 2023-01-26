package drivers;

public class Ddriver extends Driver{
    private String category;
    public Ddriver(String fio, int experience, boolean license) {
        super(fio, experience, license);
        this.category = "D";
    }
}

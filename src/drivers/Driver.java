package drivers;

public class Driver {
    private String fio;
    private boolean license;
    private int experience;

    public String getFio() {
        return fio;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isLicense() {
        return license;
    }

    public Driver(String fio, int experience, boolean license){
        this.fio=fio;
        this.experience=experience;
        this.license=license;
    }

    public void start(){}
    public void stop(){}
    public void refuel(){}
}

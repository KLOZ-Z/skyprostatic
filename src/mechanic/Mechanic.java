package mechanic;

import transport.Transport;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company){
        this.company = company;
        this.name = name;
    }

    public void doTechService(Transport transport){
        System.out.println("Техническое обслуживание "+transport.getBrand());
    }

    public void repair(Transport transport){
        System.out.println(transport.getBrand()+" починена");
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString(){
        return this.name;
    }


    public String getName() {
        return name;
    }
}

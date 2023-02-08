package station;

import enums.TransportType;
import exceptions.TransportTypeException;
import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue = new LinkedList<>();

    public void addToQueue(Transport transport){
        if (transport.type != TransportType.BUS) {
            queue.offer(transport);
            System.out.println("Машина "+transport.getBrand()+" добавлена в очередь");
        }
        else
            System.out.println("Автобусы не проходят техосмотр");
    }

    public void techInspection(){
        Transport transp;
        if((transp = queue.poll())!=null) {
            try {
                transp.passDiagnostic();
            } catch (TransportTypeException e) {
                throw new RuntimeException(e);
            }
        }
        else
            System.out.println("Нет машин в очереди");

    }
}

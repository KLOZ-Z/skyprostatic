package exceptions;

import java.io.IOException;

public class TransportTypeException extends IOException {
    public TransportTypeException() {
        super();
    }

    public TransportTypeException(String message) {
        super(message);
    }

    public TransportTypeException(String message, Throwable t) {
        super(message, t);
    }

    public TransportTypeException(Throwable t) {
        super(t);
    }
}

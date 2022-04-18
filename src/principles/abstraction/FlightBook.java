package principles.abstraction;

import java.util.Date;

public class FlightBook {

private Date bookDate;
private String origin;
private String destination;

    public FlightBook(Date bookDate, String origin, String destino) {
        this.bookDate = bookDate;
        this.origin = origin;
        this.destination = destination;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destino) {
        this.destination = destination;
    }

    
}


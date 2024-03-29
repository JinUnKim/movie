package movie.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import movie.domain.*;
import movie.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private String seatId;

    public Reserved(Reservation aggregate) {
        super(aggregate);
    }

    public Reserved() {
        super();
    }
}
//>>> DDD / Domain Event

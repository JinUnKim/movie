package movie.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import movie.domain.*;
import movie.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointsExhausted extends AbstractEvent {

    private Long id;

    public PointsExhausted(Point aggregate) {
        super(aggregate);
    }

    public PointsExhausted() {
        super();
    }
}
//>>> DDD / Domain Event

package movie.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import movie.domain.*;
import movie.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointDecreased extends AbstractEvent {

    private Long id;

    public PointDecreased(Point aggregate) {
        super(aggregate);
    }

    public PointDecreased() {
        super();
    }
}
//>>> DDD / Domain Event

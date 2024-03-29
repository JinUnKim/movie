package movie.domain;

import java.util.*;
import lombok.*;
import movie.domain.*;
import movie.infra.AbstractEvent;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private String seatId;
}

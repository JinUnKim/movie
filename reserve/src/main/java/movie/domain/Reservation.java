package movie.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import movie.ReserveApplication;
import movie.domain.Reserved;

@Entity
@Table(name = "Reservation_table")
@Data
//<<< DDD / Aggregate Root
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String seatId;

    @PostPersist
    public void onPostPersist() {
        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();
    }

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReserveApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }
}
//>>> DDD / Aggregate Root

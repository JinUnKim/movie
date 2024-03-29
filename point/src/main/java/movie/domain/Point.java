package movie.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import movie.PointApplication;
import movie.domain.PointDecreased;
import movie.domain.PointsExhausted;

@Entity
@Table(name = "Point_table")
@Data
//<<< DDD / Aggregate Root
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        PointDecreased pointDecreased = new PointDecreased(this);
        pointDecreased.publishAfterCommit();

        PointsExhausted pointsExhausted = new PointsExhausted(this);
        pointsExhausted.publishAfterCommit();
    }

    public static PointRepository repository() {
        PointRepository pointRepository = PointApplication.applicationContext.getBean(
            PointRepository.class
        );
        return pointRepository;
    }

    //<<< Clean Arch / Port Method
    public static void usePoint(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointDecreased pointDecreased = new PointDecreased(point);
        pointDecreased.publishAfterCommit();
        PointsExhausted pointsExhausted = new PointsExhausted(point);
        pointsExhausted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointDecreased pointDecreased = new PointDecreased(point);
            pointDecreased.publishAfterCommit();
            PointsExhausted pointsExhausted = new PointsExhausted(point);
            pointsExhausted.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Event {

    @GeneratedValue
    @Id
    private Long id;

//    @Column(name = "event_type_id")
//    private Long eventTypeId;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String pictures;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column
    private String address;

    @Column(name = "limited_number_of_seats")
    private Boolean limitedNrOfSeats;

//    @Column(name = "number_of_zones")
//    private Integer numberOfZone; // to bedzie foreign key

    @Column(name = "age_range")
    private String ageRange;

    public Event(String title,
                 String description,
                 String pictures,
                 Date startDate,
                 Date endDate,
                 String address,
                 Boolean limitedNrOfSeats,
//                 Integer numberOfZone,
                 String ageRange) {
        this.title = title;
        this.description = description;
        this.pictures = pictures;
        this.startDate = startDate;
        this.endDate = endDate;
        this.address = address;
        this.limitedNrOfSeats = limitedNrOfSeats;
//        this.numberOfZone = numberOfZone;
        this.ageRange = ageRange;
    }
}

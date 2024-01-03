package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Event {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String pictures;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column
    private String address;

    @Column(name = "limitedNumberOfSeats")
    private Boolean limitedNumberOfSeats;

//    @Column(name = "event_type_id")
//    private Long eventTypeId;

//    @Column(name = "number_of_zones")
//    private Integer numberOfZone; // to bedzie foreign key

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

    @Column(name = "ageRange")
    private String ageRange;

    public Event(String title,
                 String description,
                 String pictures,
                 Date startDate,
                 Date endDate,
                 String address,
                 Boolean limitedNumberOfSeats,
                 List<Ticket> tickets,
                 String ageRange) {
        this.title = title;
        this.description = description;
        this.pictures = pictures;
        this.startDate = startDate;
        this.endDate = endDate;
        this.address = address;
        this.limitedNumberOfSeats = limitedNumberOfSeats;
        this.tickets = tickets;
        this.ageRange = ageRange;
    }
}
